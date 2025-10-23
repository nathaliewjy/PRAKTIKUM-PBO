package views.mahasiswa;

import controllers.MahasiswaSarjanaController;
import views.mahasiswa.MahasiswaAddView;
import views.mahasiswa.MahasiswaListView;

import controllers.MahasiswaController;

import util.CLIUtil;

public class MahasiswaView {
    private MahasiswaAddView mahasiswaAddView;
    private MatkulAmbilAddView matkulAmbilAddView;
    private MahasiswaListView mahasiswaListView;

    private MahasiswaController mahasiswaController;
    private MahasiswaSarjanaController mahasiswaSarjanaController;

    public MahasiswaView() {
        this.mahasiswaAddView = new MahasiswaAddView();
        this.matkulAmbilAddView = new MatkulAmbilAddView();
        this.mahasiswaListView = new MahasiswaListView();
        this.mahasiswaController = new MahasiswaController();
        this.mahasiswaSarjanaController = new MahasiswaSarjanaController();
    }

    public void render() {
        int pilihMenu = 1;
        while (pilihMenu != 0) {
            System.out.println("Menu Mahasiswa");
            System.out.println("1. Show all mhs");
            System.out.println("2. Add mhs");
            System.out.println("0. Exit");
            System.out.print("Pilih menu : ");
            pilihMenu = CLIUtil.getInt();

            switch (pilihMenu) {
                case 1:
                    mahasiswaListView.renderMhs();
                    break;
                case 2:
                    addMahasiswa();
                    break;
                default:
                    System.out.println("Exit");
            }
        }

    }

    public void addMahasiswa() {
        System.out.println("Add Mahasiswa");
        System.out.println("1. Sarjana ");
        System.out.println("2. Magister ");
        System.out.println("3. Doktor");
        System.out.println("Pilih mahasiawa : ");
        int pilihMhs = CLIUtil.getInt();

        switch (pilihMhs) {
            case 1:
                String nim = mahasiswaAddView.render();
                if (nim != null) {
                    matkulAmbilAddView.render();
                }
        }
    }


}
