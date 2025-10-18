package views.mahasiswa;

import controllers.MahasiswaController;
import models.Mahasiswa;

import java.util.List;

public class MahasiswaListView {
    private MahasiswaController mahasiswaController;

    public MahasiswaListView() {
        this.mahasiswaController = new MahasiswaController();
    }

    public void render(List<Mahasiswa> mhss) {
        for (int i = 0; i < mhss.size(); i++) {
            Mahasiswa mhs = mhss.get(i);
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

    public void render() {
        var mhss = mahasiswaController.findAll();
        render(mhss);
    }
}
