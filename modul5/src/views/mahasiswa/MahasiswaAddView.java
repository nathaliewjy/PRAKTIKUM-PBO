package views.mahasiswa;

import util.CLIUtil;

public class MahasiswaAddView {

    // pake String[] biar semua data msk ke MhsView nnt
    public String[] render() {
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

        // if nya gimana? biar bisa if isSarjana, isMagister, isDoktor
        // eh ternyata di MahasiswaView nya lgsg deng if condinya

        System.out.println("yey add");

        return new String[]{nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon};
    }
}
