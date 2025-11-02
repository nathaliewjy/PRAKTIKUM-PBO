package views.mahasiswa;

import controllers.MahasiswaController;

import models.Mahasiswa;
import models.MahasiswaDoktor;
import models.MahasiswaMagister;
import models.MahasiswaSarjana;

import java.util.List;

public class MahasiswaListView {
    private MahasiswaController mahasiswaController;

    public MahasiswaListView() {
        this.mahasiswaController = new MahasiswaController();
    }

    public void renderMhs() {
        List<Mahasiswa> mhss = mahasiswaController.getAllMhss();

        for (int i = 0; i < mhss.size(); i++) {
            Mahasiswa mhs = mhss.get(i);

            System.out.println("NIM : " + mhs.getNim());
            System.out.println("Kode jurusan : " + mhs.getKodeJurusan());
            System.out.println("Nama : " + mhs.getNama());
            System.out.println("Alamat : " + mhs.getAlamat());
            System.out.println("Tempat lahir : " + mhs.getTempatLahir());
            System.out.println("Tanggal lahir : " + mhs.getTanggalLahir());
            System.out.println("Telpon : " + mhs.getTelepon());

            if (mhs instanceof MahasiswaSarjana) {
                MahasiswaSarjana mhsS1 = (MahasiswaSarjana) mhs;
                System.out.println("Matkul ambil : " + mhsS1.getListMatkulAmbil());
            } else if (mhs instanceof MahasiswaMagister) {
                MahasiswaMagister mhsS2 = (MahasiswaMagister) mhs;
                System.out.println("Tesis : " + mhsS2.getTesis());
            } else if (mhs instanceof MahasiswaDoktor) {
                MahasiswaDoktor mhsS3 = (MahasiswaDoktor) mhs;
                System.out.println("Disertasi : " + mhsS3.getDisertasi());
                System.out.println("Sid 1 : " + mhsS3.getSidang1());
                System.out.println("Sid 2 : " + mhsS3.getSidang2());
                System.out.println("Sid 3 : " + mhsS3.getSidang3());
            }
        }
    }
}
