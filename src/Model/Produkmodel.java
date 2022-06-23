package Model;
import Entity.Transaksi;
import Helper.KoneksiDb;
import Entity.Produk;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Produkmodel extends Produk{
    private String Produk = "";
    String sql;
    int result = 0;
    public Connection conn = KoneksiDb.getconnection();

    public void insertProduk(Produk produk){
        try {
            sql = String.format("INSERT INTO produk (id_produk, id_kategori, nama_produk, harga_produk) VALUES" +
                    "('%s', '%s', '%s', '%s');",
                    produk.getId_produk(),
                    produk.getId_kategori(),
            produk.getnama_produk(),
            produk.getharga_produk()
            );
            PreparedStatement statement = conn.prepareStatement(sql);
            if(statement.executeUpdate() > 0){
                System.out.println("Berhasil menambah data makanan");
            }else {
                System.out.println("Gagal menambah data makanan");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
    public void updateProduk(int id_produk, int id_kategori, String nama_produk, float harga_produk) {
        int result = 0;
        try {
            sql = String.format("UPDATE produk set id_kategori = " + "'%s'," +
                            "nama_produk    = " + "'%s'," +
                            "harga_produk  = " + "'%s' WHERE id_produk = '%s';",
                    id_kategori,nama_produk, harga_produk, id_produk
            );
            PreparedStatement statement = conn.prepareStatement(sql);
            result = statement.executeUpdate();
            if(result > 0){
                System.out.println("Berhasil menghapus");
            }else{
                System.out.println("Gagal menghapus");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteProduk(int id){
        int result = 0;
        try {
            Connection conn = KoneksiDb.getconnection();
            String sql = String.format("DELETE FROM produk WHERE id_produk = '%s';",
                    id
            );
            PreparedStatement statement = conn.prepareStatement(sql);
            result = statement.executeUpdate();
            if(result > 0){
                System.out.println("Berhasil menghapus");
            }else{
                System.out.println("Gagal menghapus");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public ArrayList<Produk> viewProduk() {
        ArrayList<Produk> produks = new ArrayList<>();
        try {
            String sql = "select *" +
                    "from produk  ";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Produk produk = new Produk();
                produk.setid(rs.getInt("id_produk"));
                produk.setId_kategori(rs.getInt("id_kategori"));
                produk.setnama_produk(rs.getString("nama_produk"));
                produk.setharga_produk(rs.getFloat("harga_produk"));
                produks.add(produk);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produks;
    }
}
