package Controller;
import Entity.Kategori;
import Model.Kategorimodel;
import java.util.ArrayList;
public class Kategoricontroller {
    public void insertKategori( String nama_kategori){
        Kategorimodel kategorimodel = new Kategorimodel();
        Kategori kategori = new Kategori(0, nama_kategori);
        kategorimodel.insertkategori(kategori);
    }
    public void updateKategori(int id_kategori, String nama_kategori){
        Kategorimodel kategorimodel = new Kategorimodel();
        kategorimodel.updateKategori(id_kategori,nama_kategori);
    }
    public void deleteKategori(int currentId){
        Kategorimodel kategorimodel = new Kategorimodel();
        kategorimodel.deleteKategori(currentId);
    }
    public ArrayList<Kategori> getKategori(){
        return new Kategorimodel().getKategori();
    }
}
