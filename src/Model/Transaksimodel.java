package Model;
import Helper.KoneksiDb;
import Entity.Transaksi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Transaksimodel extends Transaksi {


    String sql;
    int result = 0;
    public Connection conn = KoneksiDb.getconnection();

    public ArrayList<Transaksi> getTransaksi() {
        ArrayList<Transaksi> transaksi = new ArrayList<>();
        try {
            String sql = "select *" +
                    "from transaksi  ";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Transaksi transaksi1 = new Transaksi();
                transaksi1.setId_transaksi(rs.getInt("id_transaksi"));
                transaksi1.settgl_transaksi(rs.getDate("tgl_transaksi"));
                transaksi1.setTotal_transaksi(rs.getFloat("total_transaksi"));
                transaksi.add(transaksi1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return transaksi;
    }

    //public void insertTransaksi(Transaksi transaksi) {
    public ArrayList<Transaksi> insertTransaksi(Transaksi transaksi) {
        ArrayList<Transaksi> transaksis = new ArrayList<>();
        try {
            sql = String.format("INSERT INTO transaksi (id_transaksi, tgl_transaksi, total_transaksi) VALUES " +
                            "('%s', NOW(), '%s');",
                    transaksi.getId_transaksi(),
                    transaksi.gettotal_transaksi()
            );
            PreparedStatement statement = conn.prepareStatement(sql);
            result = statement.executeUpdate();
            if (result > 0) {
                System.out.println("Beerhasil menambah data transaksi");
            } else {
                System.out.println("Gagal menambahkan data transaksi");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return transaksis;
    }

}


