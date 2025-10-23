package views.mahasiswa;

import controllers.MahasiswaController;
import controllers.MahasiswaDoktorController;
import controllers.MahasiswaMagisterController;
import controllers.MahasiswaSarjanaController;
import models.MahasiswaMagister;
import util.CLIUtil;

public class MahasiswaAddView {
    private MahasiswaController mahasiswaController;
    private MahasiswaSarjanaController mahasiswaSarjanaController;
    private MahasiswaMagisterController mahasiswaMagisterController;
    private MahasiswaDoktorController mahasiswaDoktorController;

    public MahasiswaAddView() {
        this.mahasiswaController = new MahasiswaController();
        this.mahasiswaSarjanaController = new MahasiswaSarjanaController();
        this.mahasiswaMagisterController = new MahasiswaMagisterController();
        this.mahasiswaDoktorController = new MahasiswaDoktorController();
    }

    public String render() {
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

        // if nya gimana?

        System.out.println("yey add");

        return nim;
    }
}
