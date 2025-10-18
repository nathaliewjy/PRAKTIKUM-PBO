package views.mahasiswa;

import controllers.MahasiswaController;
import controllers.MahasiswaSarjanaController;
import util.CLIUtil;

public class MahasiswaAddView {
    private MahasiswaController mahasiswaController;
    private MahasiswaSarjanaController mahasiswaSarjanaController;

    public MahasiswaAddView() {
        this.mahasiswaController = new MahasiswaController();
        this.mahasiswaSarjanaController = new MahasiswaSarjanaController();
    }

    public void render() {
        System.out.print("NIM : ");
        String nim = CLIUtil.getString();
        System.out.print("Kode jurusan : ");
        String kodeJurusan = CLIUtil.getString();
        System.out.print("Nama : ");
        String nama = CLIUtil.getString();
        System.out.print("Alamat : ");
        String alamat = CLIUtil.getString();
        System.out.print("Tempat lahir : ");
        String tempatLahir = CLIUtil.getString();
        System.out.print("Tanggal lahir : ");
        String tanggalLahir = CLIUtil.getString();
        System.out.print("Telepon : ");
        String telepon = CLIUtil.getString();

        mahasiswaSarjanaController.addSarjana(nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon);
    }
}
