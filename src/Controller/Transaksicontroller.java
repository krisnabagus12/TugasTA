package Controller;
import Entity.Transaksi;
import Model.Transaksimodel;

import java.util.ArrayList;
import java.util.Date;

public class Transaksicontroller {
    public ArrayList<Transaksi> insertTransaksi(Date tgl_transaksi, float total_transaksi){
        Transaksimodel transaksiModel = new Transaksimodel();
        Transaksi transaksi = new Transaksi(tgl_transaksi, 0, total_transaksi);
        transaksiModel.insertTransaksi(transaksi);
        return new Transaksimodel().insertTransaksi(transaksi);
    }
    public ArrayList<Transaksi> getTransaksi(){
        return new Transaksimodel().getTransaksi();
    }
}
