package Entity;

import javax.xml.crypto.Data;
import java.util.Date;

public class View {
    public int id_transaksi;
    public Date tgl_transaksi;
    public int id_produk;
    public String nama_produk;
    public float jumlah_produk;
    public float total_transaksi;

    public View(){
    }

    public View(int id_transaksi, Date tgl_transaksi, int id_produk, String nama_produk,float jumlah_produk, float total_transaksi){
        this.id_transaksi = id_transaksi;
        this.tgl_transaksi = tgl_transaksi;
        this.id_produk = id_produk;
        this.nama_produk = nama_produk;
        this.jumlah_produk = jumlah_produk;
        this.total_transaksi = total_transaksi;
    }

    public int getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }
    public Date getTgl_transaksi(){
        return tgl_transaksi;
    }

    public void setTgl_transaksi(Date tgl_transaksi) {
        this.tgl_transaksi = tgl_transaksi;
    }

    public int getId_produk() {
        return id_produk;
    }

    public void setId_produk(int id_produk) {
        this.id_produk = id_produk;
    }

    public String getNama_produk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }
    public float getJumlah_produk(){
        return jumlah_produk;
    }

    public void setJumlah_produk(float jumlah_produk) {
        this.jumlah_produk = jumlah_produk;
    }

    public float getTotal_transaksi() {
        return total_transaksi;
    }

    public void setTotal_transaksi(float total_transaksi) {
        this.total_transaksi = total_transaksi;
    }
}
