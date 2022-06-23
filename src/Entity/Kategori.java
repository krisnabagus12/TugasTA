package Entity;

public class Kategori {
    protected int Id_Kategori;
    private String nama_kategori;
    public Kategori (){
    }
    public Kategori(int id_kategori,String nama_kategori){
        this.Id_Kategori = id_kategori;
        this.nama_kategori = nama_kategori;
    }
    //public Kategori (String nama_kategori){
        //this.nama_kategori = nama_kategori;
    //}
    public int getId_Kategori(){
        return Id_Kategori;
    }
    public void setId_Kategori(int Id_Kategori){
        this.Id_Kategori = Id_Kategori;
    }
    public String getnama_kategori(){
        return nama_kategori;
    }
    public void setnama_kategori(String nama_kategori){
        this.nama_kategori = nama_kategori;
    }
}
