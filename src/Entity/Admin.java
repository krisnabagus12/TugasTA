package Entity;

public class Admin {
    private String pass;
    private String nama;
    public Admin(){}
    public Admin(String nama, String pass) {
        this.nama = nama;
        this.pass = pass ;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
