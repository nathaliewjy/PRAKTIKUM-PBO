package views.mahasiswa;

import models.MahasiswaDoktor;
import models.MahasiswaMagister;
import models.MahasiswaSarjana;
import views.mahasiswa.MahasiswaAddView;
import views.mahasiswa.MahasiswaListView;

import controllers.MahasiswaController;

import util.CLIUtil;

public class MahasiswaView {
    private MahasiswaAddView mahasiswaAddView;
    private MahasiswaListView mahasiswaListView;
    private MatkulAmbilAddView matkulAmbilAddView;

    private MahasiswaController mahasiswaController;

    public MahasiswaView() {
        this.mahasiswaAddView = new MahasiswaAddView();
        this.matkulAmbilAddView = new MatkulAmbilAddView();
        this.mahasiswaListView = new MahasiswaListView();
        this.mahasiswaController = new MahasiswaController();
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
        System.out.println("Add mahasiswa");
        System.out.println("1. Sarjana ");
        System.out.println("2. Magister ");
        System.out.println("3. Doktor");
        System.out.print("Pilih mahasiawa : ");
        int pilihMhs = CLIUtil.getInt();

        String[] dataMhs = mahasiswaAddView.render();

        switch (pilihMhs) {
            case 1:
                MahasiswaSarjana mhsS1 = new MahasiswaSarjana(dataMhs[0], dataMhs[1], dataMhs[2], dataMhs[3], dataMhs[4], dataMhs[5], dataMhs[6]);
                mahasiswaController.addMahasiswa(mhsS1);
                System.out.println("yey add mhsS1, trs input matkul yea");

                String nim = dataMhs[0];
                matkulAmbilAddView.render(nim);
                break;
            case 2:
                System.out.print("Tesis : ");
                String tesis = CLIUtil.getString();

                MahasiswaMagister mhsS2 = new MahasiswaMagister(tesis, dataMhs[0], dataMhs[1], dataMhs[2], dataMhs[3], dataMhs[4], dataMhs[5], dataMhs[6]);
                mahasiswaController.addMahasiswa(mhsS2);
                System.out.println("yey add mhsS2");
                break;
            case 3:
                System.out.print("Disertasi: ");
                String disertasi = CLIUtil.getString();
                System.out.print("Sid 1 : ");
                int sidang1 = CLIUtil.getInt();
                System.out.print("Sid 2 : ");
                int sidang2 = CLIUtil.getInt();
                System.out.print("Sid 3 : ");
                int sidang3 = CLIUtil.getInt();

                MahasiswaDoktor mhsS3 = new MahasiswaDoktor(disertasi, sidang1, sidang2, sidang3, dataMhs[0], dataMhs[1], dataMhs[2], dataMhs[3], dataMhs[4], dataMhs[5], dataMhs[6]);
                mahasiswaController.addMahasiswa(mhsS3);
                System.out.println("yey add mhsS3");
                break;
            default:
                System.out.println("Ga add apa apa");
        }
    }
}
