import Controller.Transaksicontroller;
import Entity.*;
import Helper.KoneksiDb;
import Controller.Produkcontroller;
import Controller.Kategoricontroller;
import Controller.Detailprodukcontroller;
import Controller.Viewcontroller;
import Model.Adminmodel;
import Model.Viewmodel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static Produkcontroller produkcontroller = new Produkcontroller();
    public static Kategoricontroller kategoricontroller = new Kategoricontroller();
    public static Detailprodukcontroller detailprodukcontroller = new Detailprodukcontroller();
    public static Viewcontroller viewcontroller = new Viewcontroller();
    public static Produk produk = new Produk();
    public static Kategori kategori = new Kategori();
    public static View view = new View();
    public static Transaksicontroller transaksicontroller = new Transaksicontroller();
    public static Adminmodel adminmodel = new Adminmodel();
    public static boolean cek;
    public static int memilih;
    public static void main(String[] args) {
        dataAdmin();
        System.out.println("SELAMAT DATANG");
        System.out.println("LOGIN");
        System.out.println("Nama    : ");
        String nama = input.next();
        System.out.println("Password: ");
        String pass = input.next();
        cek = adminmodel.cekAdmin(nama, pass);
        while (cek) {

            //int memilih;
            do {
                System.out.println("""
                        =============================
                        |       FROZEN FOOD         |
                        =============================
                        Menu :
                        1. Produk Makanan
                        2. Kategori Jenis Makanan
                        3. Transaksi
                        4. Detail Produk
                        5. View Data
                        6. Exit
                        Enter your choices:        
                        """);
                memilih = input.nextInt();

                switch (memilih) {
                    case 1 -> {
                        do {
                            System.out.print("""
                                    =================
                                    Data Admin Menu:
                                    =================
                                    1. Insert Produk
                                    2. Update Produk
                                    3. Delete Produk
                                    4. View
                                    5. Exit
                                    Enter your choices:
                                    """);
                            memilih = input.nextInt();
                            switch (memilih) {
                                case 1 -> insertProduk();
                                case 2 -> updateProduk();
                                case 3 -> deleteProduk();
                                case 4 -> viewProduk();
                                case 5 -> System.out.println("Logging out...");
                                default -> System.out.println("Invalid Input");
                            }
                        } while (memilih != 5);
                    }
                    case 2 -> {
                        do {
                            System.out.print("""
                                    Data Admin Menu:
                                    1. Insert Kategori Makanan
                                    2. Update Kategori Makanan
                                    3. Delete Kategori Makanan
                                    4. Exit
                                    Enter your choices:
                                    """);
                            memilih = input.nextInt();
                            switch (memilih) {
                                case 1 -> insertKategori();
                                case 2 -> updateKategori();
                                case 3 -> deleteKategori();
                                case 4 -> System.out.println("Logging out...");
                                default -> System.out.println("Invalid Input");
                            }
                        } while (memilih != 4);
                    }
                    case 3 -> {
                        do {
                            System.out.print("""
                                    Data Admin Menu:
                                    1. Insert Transaksi
                                    2. View Transaksi
                                    3. Exit
                                    Enter your choices:
                                    """);
                            memilih = input.nextInt();
                            switch (memilih) {
                                case 1 -> insertTransaksi();
                                case 2 -> viewTransaksi();
                                case 3 -> System.out.println("Logging out...");
                                default -> System.out.println("Invalid Input");
                            }
                        } while (memilih != 3);
                    }
                    case 4 -> {
                        do {
                            System.out.print("""
                                    Data Admin Menu:
                                    1. Insert Jumlah produk
                                    2. Exit
                                    Enter your choices:
                                    """);
                            memilih = input.nextInt();
                            switch (memilih) {
                                case 1 -> insertDetailproduk();
                                case 2 -> System.out.println("Logging out...");
                                default -> System.out.println("Invalid Input");
                            }
                        } while (memilih != 2);
                    }
                    case 5 -> {
                        do{
                            System.out.print("""
                                    Data Admin Menu:
                                    1.View
                                    2.Exit
                                    Enter your choices:
                                    """);
                            memilih = input.nextInt();
                            switch (memilih){
                                case 1 -> view();
                                case 2 -> System.out.println("Logging out...");
                                default -> System.out.println("Invalid Input");
                            }
                        }while (memilih != 2);
                    }
                }
            } while (memilih != 6);
        }
    }

        static void dataAdmin () {
            String nama[] = {"Krisna"};
            String pass[] = {"123"};
            adminmodel.insert(nama, pass);
        }

        public static void insertDetailproduk () {
            Detailproduk detailproduk = new Detailproduk();
            System.out.print("Masukan Id Produk     :");
            detailproduk.setId_produk(input.nextInt());
            System.out.print("Masukan Id transaksi  :");
            detailproduk.setId_transaksi(input.nextInt());
            System.out.print("Masukan Jumlah produk :");
            detailproduk.setJumlah_produk(input.nextFloat());

            Detailprodukcontroller detailprodukcontroller = new Detailprodukcontroller();
            detailprodukcontroller.insertDetailproduk(detailproduk.getId_produk(), detailproduk.getId_transaksi(), detailproduk.getJumlah_produk());
        }
        public static void insertTransaksi () {
            Transaksi transaksi = new Transaksi();
            System.out.print("Masukan total transaksi   :");
            transaksi.setTotal_transaksi(input.nextFloat());

            Transaksicontroller transaksicontroller = new Transaksicontroller();
            transaksicontroller.insertTransaksi(transaksi.gettgl_transaksi(), transaksi.gettotal_transaksi());
        }

        public static void insertKategori () {
            Kategori kategori1 = new Kategori();
            System.out.print("Masukan Nama Kategori Makanan: ");
            kategori1.setnama_kategori(input.next());

            Kategoricontroller kategoricontroller1 = new Kategoricontroller();
            kategoricontroller1.insertKategori(kategori1.getnama_kategori());
        }

        public static void insertProduk () {
            Produk produk1 = new Produk();
            System.out.print("Masukan id kategori   : ");
            produk1.setId_kategori(input.nextInt());
            System.out.print("Masukan Nama Makanan  : ");
            produk1.setnama_produk(input.next());
            System.out.print("Masukan Harga Makanan : ");
            produk1.setharga_produk(input.nextFloat());

            Produkcontroller produkcontroller1 = new Produkcontroller();
            produkcontroller1.insertProduk(produk1.getId_produk(), produk1.getId_kategori(), produk1.getnama_produk(), produk1.getharga_produk());
        }

        public static void updateProduk () {
            System.out.println("Masukan ID Produk: ");
            int id_produk = input.nextInt();
            System.out.println("Masukan ID Kategori baru: ");
            int id_kategori = input.nextInt();
            System.out.println("Masukan Nama Produk Baru: ");
            String nama_produk = input.next();
            System.out.println("Masukan Harga Produk Baru: ");
            float harga_produk = input.nextFloat();

            Produkcontroller cont = new Produkcontroller();
            cont.updateProduk(id_produk, id_kategori, nama_produk, harga_produk);
        }

        private static void updateKategori () {
            System.out.println("Masukan ID Kategori baru: ");
            int id_kategori = input.nextInt();
            System.out.println("Masukan Nama Produk Baru: ");
            String nama_kategori = input.next();

            Kategoricontroller cont = new Kategoricontroller();
            cont.updateKategori(id_kategori, nama_kategori);
        }
        private static void deleteProduk () {
            int currentId = 0;
            System.out.println("Masukan Id Makanan yang ingin dihapus : ");
            currentId = input.nextInt();
            Produkcontroller cont = new Produkcontroller();
            cont.deleteProduk(currentId);
        }
        private static void deleteKategori () {
            int currentId = 0;
            System.out.println("Masukan Id Kategori Makanan yang ingin dihapus : ");
            currentId = input.nextInt();
            Kategoricontroller cont = new Kategoricontroller();
            cont.deleteKategori(currentId);
        }

    private static void viewTransaksi() {
        ArrayList<Transaksi> transaksi = transaksicontroller.getTransaksi();
        if (transaksi.size() == 0) {
            System.out.println("There is no data");
            return;
        }
        for (Transaksi index : transaksi) {
            //TransaksiEntity transaksiEntity = transaksiEntities.get();
            System.out.println("tgl transaksi :" + index.gettgl_transaksi());
            System.out.println("id transaksi : " + index.getId_transaksi());
            System.out.println("total transaksi :" + index.gettotal_transaksi());
            System.out.println(" ");
        }

        //transaksiController.getTransaksi();
    }
    private static void view() {
        ArrayList<View> views = viewcontroller.getView();
        if (views.size() == 0) {
            System.out.println("There is no data");
            return;
        }
        for (View index : views) {
            //TransaksiEntity transaksiEntity = transaksiEntities.get();
            System.out.println("id_transaksi    :" + index.getId_transaksi());
            System.out.println("tgl_transaksi   :" + index.getTgl_transaksi());
            System.out.println("nama produuk    :" + index.getNama_produk());
            System.out.println("jumlah produk   :" + index.getJumlah_produk());
            System.out.println("total transaksi :"+ index.getTotal_transaksi());
            System.out.println(" ");
        }

        //transaksiController.getTransaksi();
    }
    private static void viewProduk() {
        ArrayList<Produk> produks = produkcontroller.viewProduk();
        if (produks.size() == 0) {
            System.out.println("There is no data");
            return;
        }
        for (Produk index : produks) {
            //TransaksiEntity transaksiEntity = transaksiEntities.get();
            System.out.println("id_produk      :" + index.getId_produk());
            System.out.println("id_kategori    :" + index.getId_kategori());
            System.out.println("nama produk    :" + index.getnama_produk());
            System.out.println("harga produk   :" + index.getharga_produk());
            System.out.println(" ");
        }

        //transaksiController.getTransaksi();



    }


}
