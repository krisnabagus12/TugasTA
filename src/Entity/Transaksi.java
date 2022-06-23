package Entity;
import java.util.Date;

public class Transaksi {
    protected Date tgl_transaksi;
    protected int id_transaksi;
    protected float total_transaksi;

    public Transaksi(){
    }

    public Transaksi(Date tgl_transaksi, int id_transaksi, float total_transaksi){
        this.tgl_transaksi = tgl_transaksi;
        this.id_transaksi = id_transaksi;
        this.total_transaksi = total_transaksi;
    }


    public int getId_transaksi(){
        return id_transaksi;
    }
    public void setId_transaksi(int id_transaksi){
        this.id_transaksi = id_transaksi;
    }
    public Date gettgl_transaksi(){
        return tgl_transaksi;
    }
    public void settgl_transaksi(Date tgl_transaksi){
        this.tgl_transaksi = tgl_transaksi;
    }

    public float gettotal_transaksi(){
        return total_transaksi;
    }
    public void setTotal_transaksi(float total_transaksi){
        this.total_transaksi = total_transaksi;
    }
}
