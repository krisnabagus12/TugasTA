package Entity;

public class Produk {
    protected int id_produk, id_kategori;
    private String nama_produk;
    private float harga_produk;
    public Produk (){
    }
    public Produk(int id_produk, int id_kategori, String nama_produk, float harga_produk){
        this.id_produk = id_produk;
        this.id_kategori = id_kategori;
        this.nama_produk = nama_produk;
        this.harga_produk = harga_produk;
    }
    public int getId_produk(){
        return id_produk;
    }
    public void setid(int id_produk){
        this.id_produk = id_produk;
    }

    public int getId_kategori(){
        return id_kategori;
    }
    public void setId_kategori(int id_kategori){
        this.id_kategori = id_kategori;
    }
    public String getnama_produk(){
        return nama_produk;
    }
    public void setnama_produk(String nama_produk){
        this.nama_produk = nama_produk;
    }
    public float getharga_produk(){
        return harga_produk;
    }
    public void setharga_produk(float harga_produk){
        this.harga_produk = harga_produk;
    }
}
