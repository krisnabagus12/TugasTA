package Model;
import Entity.Admin;

public class Adminmodel {
    private static Admin[] admin = new Admin[1];
    public void insert(String[] nama, String[] pass){
        admin[0] = new Admin(nama[0], pass[0]);
    }
    public Admin getAdmin(){
        return admin[0];
    }

    public boolean cekAdmin(String nama, String pass){
        if(admin[0].getNama().equals(nama) && admin[0].getPass().equals(pass)){
            System.out.println("login berhasil");
            return true;
        }else {
            System.out.println("login gagal");
            return false;
        }
    }

}
