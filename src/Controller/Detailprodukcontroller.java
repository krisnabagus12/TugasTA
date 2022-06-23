package Controller;
import Entity.Detailproduk;
import Entity.View;
import Model.Detailprodukmodel;
import Model.Viewmodel;

import java.util.ArrayList;

public class Detailprodukcontroller {
    //Detailprodukmodel detailprodukmodel = new Detailprodukmodel();
    public void insertDetailproduk(int id_produk, int id_transaksi, float jumlah_produk){
        Detailprodukmodel detailprodukmodel = new Detailprodukmodel();
        Detailproduk detailproduk = new Detailproduk(id_produk,id_transaksi, jumlah_produk);
        detailprodukmodel.insertDetailproduk(detailproduk);
    }

}
