package Model;
import Helper.KoneksiDb;
import Entity.Kategori;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
public class Kategorimodel {

   String sql;
    public Connection conn = KoneksiDb.getconnection();
    public ArrayList<Kategori> getKategori(){
        ArrayList<Kategori> kategoris = new ArrayList<>();
        try {
            String sql = "select *" +
                    "from jajan ";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Kategori kategori = new Kategori();
                kategori.setId_Kategori(rs.getInt("id_kategori"));
                kategori.setnama_kategori(rs.getString("nama_kategori"));
                kategoris.add(kategori);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kategoris;
    }
    public void insertkategori (Kategori kategori){
        try{
            sql = String.format("INSERT INTO kategori (id_kategori, nama_kategori) VALUES " +
                "('%s', '%s');",
            kategori.getId_Kategori(),
            kategori.getnama_kategori()
            );
            PreparedStatement statement = conn.prepareStatement(sql);
            if(statement.executeUpdate() > 0){
                System.out.println("Berahsil menambahkan kategori baru");
            }else{
                System.out.println("Gagal menambahkan kategori baru");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void updateKategori(int id_kategori, String nama_kategori) {
        int result = 0;
        try{
            sql = String.format("UPDATE kategori set id_kategori = " + "'%s'," +
                            "NAMA KATEGORI  = " + "'%s' WHERE id_kategori = " + "'%s';",
                    nama_kategori, id_kategori
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
    public void deleteKategori(int id){
        int result = 0;
        try {
            Connection conn = KoneksiDb.getconnection();
            String sql = String.format("DELETE FROM kategori WHERE id_kategori = '%s';",
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
}
