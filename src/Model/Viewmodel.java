package Model;
import Entity.Transaksi;
import Entity.View;
import Helper.KoneksiDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class Viewmodel {
    String sql;
    int result = 0;
    public Connection conn = KoneksiDb.getconnection();

    public ArrayList<View> getView(){
        ArrayList<View> views = new ArrayList<>();
        try {
            String sql = "  select detail_produk.id_transaksi, transaksi.tgl_transaksi, detail_produk.id_produk,produk.nama_produk, " +
                    "detail_produk.jumlah_produk, transaksi.total_transaksi " +
                    "from detail_produk join produk " +
                    "on detail_produk.id_produk=produk.id_produk join transaksi " +
                    "on detail_produk.id_transaksi= transaksi.id_transaksi;";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                View view = new View();
                view.setId_transaksi(rs.getInt("id_transaksi"));
                view.setTgl_transaksi(rs.getDate("tgl_transaksi"));
                view.setId_produk(rs.getInt("id_produk"));
                view.setNama_produk(rs.getString("nama_produk"));
                view.setJumlah_produk(rs.getFloat("jumlah_produk"));
                view.setTotal_transaksi(rs.getFloat("total_transaksi"));
                views.add(view);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return views;
    }
    //public ArrayList<View> getView(){
        //ArrayList<View> = new ArrayList<>();
        //try {
            //String sql = " select harga_produk*jumlah_produk as total from detail_produk join produk on detail_produk.id_produk=produk.id_produk";
            //PreparedStatement statement = conn.prepareStatement(sql);
            //ResultSet rs = statement.executeQuery();
            //while (rs.next()){
                //View view = new View();
                //view.set
            //}
        //}
    //}

}
