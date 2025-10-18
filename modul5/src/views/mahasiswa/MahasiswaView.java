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
        System.out.println("Menu Mahasiswa");
        System.out.println("1. Show all mhs");
        System.out.println("2. Add mhs");
        System.out.println("3. Edit mhs");
        System.out.println("4. Delete mhs");
        System.out.println("0. Exit");
        System.out.print("Pilih menu : ");

        handleMenuInput();
    }

    private void handleMenuInput() {
        int pilihMenu = CLIUtil.getInt();

        switch (pilihMenu) {
            case 1:
                mahasiswaListView.render();
                break;
            case 2:
                addMahasiswa();
                break;
        }
    }

    public void addMahasiswa() {
        System.out.println("Add Mahasiswa");
        System.out.println("S1 / S2 / S3 (1 / 2 / 3) : ");

        handleMenuAddMahasiswa();
    }

    private void handleMenuAddMahasiswa() {
        int pilihMhs = CLIUtil.getInt();

        switch (pilihMhs) {
            case 1:
               mahasiswaAddView.render();
               matkulAmbilAddView.render();
        }
    }


}
