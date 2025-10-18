package views.mahasiswa;

import controllers.MahasiswaController;
import util.CLIUtil;

public class MahasiswaAddView {
    private MahasiswaController mahasiswaController;

    public MahasiswaAddView() {
        this.mahasiswaController = new MahasiswaController();
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

        mahasiswaController.add(nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon);
    }
}
