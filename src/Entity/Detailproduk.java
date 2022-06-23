package Entity;
import Entity.Produk;
import Entity.Transaksi;

public class Detailproduk {
    protected int id_produk;
    protected int id_transaksi;
    public float jumlah_produk;

    public Detailproduk(){
    }

    public Detailproduk(int id_produk, int id_transaksi, float jumlah_produk){
        this.id_produk = id_produk;
        this.id_transaksi = id_transaksi;
        this.jumlah_produk = jumlah_produk;
    }

    public int getId_produk(){return id_produk;}
    public void setId_produk(int id_produk){this.id_produk = id_produk;}

    public int getId_transaksi(){return id_transaksi;}
    public void setId_transaksi(int id_transaksi){this.id_transaksi = id_transaksi;}

    public float getJumlah_produk(){return jumlah_produk;}
    public void setJumlah_produk(float jumlah_produk){this.jumlah_produk = jumlah_produk;}
}
