package views.mahasiswa;

import controllers.MahasiswaController;
import controllers.MahasiswaSarjanaController;
import models.Mahasiswa;
import models.MahasiswaSarjana;

import java.util.List;

public class MahasiswaListView {
    private MahasiswaController mahasiswaController;
    private MahasiswaSarjanaController mahasiswaSarjanaController;

    public MahasiswaListView() {
        this.mahasiswaController = new MahasiswaController();
        this.mahasiswaSarjanaController = new MahasiswaSarjanaController();
    }

    // ini buat S1
    public void renderMhs(List<MahasiswaSarjana> mhssS1) {
        for (int i = 0; i < mhssS1.size(); i++) {
            Mahasiswa mhs = mhssS1.get(i);
            String nim = mhs.getNim();
            String kodeJurusan = mhs.getKodeJurusan();
            String nama = mhs.getNama();
            String alamat = mhs.getAlamat();
            String tempatLahir = mhs.getTempatLahir();
            String tanggalLahir = mhs.getTanggalLahir();
            String telepon = mhs.getTelepon();

            System.out.println("NIM : " + nim);
            System.out.println("Kode jurusan : " + kodeJurusan);
            System.out.println("Nama : " + nama);
            System.out.println("Alamat : " + alamat);
            System.out.println("Tempat lahir : " + tempatLahir);
            System.out.println("Tanggal lahir : " + tanggalLahir);
            System.out.println("Telpon : " + telepon);
        }
    }

    public void renderMhs() {
        var mhssS1 = mahasiswaSarjanaController.getAllMhssS1();
        renderMhs(mhssS1);
    }

}
