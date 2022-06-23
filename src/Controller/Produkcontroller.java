package Controller;
import Entity.Produk;
import Entity.Transaksi;
import Model.Produkmodel;
import Model.Transaksimodel;

import java.util.ArrayList;

public class Produkcontroller {
    public void insertProduk(int id_produk, int id_kategori, String nama_produk, float harga_produk){
    Produkmodel produkmodel = new Produkmodel();
    Produk produk = new Produk(0,id_kategori, nama_produk, harga_produk);
    produkmodel.insertProduk(produk);
    }
    public void updateProduk(int id_produk, int id_kategori, String nama_produk, float harga_produk){
        Produkmodel produkmodel = new Produkmodel();
        produkmodel.updateProduk(id_produk,id_kategori,nama_produk, harga_produk);
    }
    public void deleteProduk(int currentId){
        Produkmodel produkmodel = new Produkmodel();
        produkmodel.deleteProduk(currentId);
    }
    public ArrayList<Produk> viewProduk(){
        return new Produkmodel().viewProduk();
    }
}
