package Model;
import Entity.View;
import Helper.KoneksiDb;
import Entity.Detailproduk;
import java.sql.*;
import java.util.ArrayList;
import Entity.Produk;


//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;

public class Detailprodukmodel extends Detailproduk{
    public static Produk produk = new Produk();
    protected String Detailproduk = "";

    int result = 0;
    String sql;
    public Connection conn = KoneksiDb.getconnection();

    public void insertDetailproduk(Detailproduk detailproduk) {
        try {
            sql = String.format("INSERT INTO detail_produk (id_produk, id_transaksi, jumlah_produk) VALUES " +
                            "('%s','%s','%s');",
                    detailproduk.getId_produk(),
                    detailproduk.getId_transaksi(),
                    detailproduk.getJumlah_produk()
            );
            PreparedStatement statement = conn.prepareStatement(sql);
            int result = statement.executeUpdate();
            if (result > 0) {
                System.out.println("Beerhasil menambah data transaksi");
            } else {
                System.out.println("Gagal menambahkan data transaksi");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //coba

}