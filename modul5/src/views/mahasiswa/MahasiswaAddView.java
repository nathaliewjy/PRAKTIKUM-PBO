package views.mahasiswa;

import util.CLIUtil;

public class MahasiswaAddView {

    // pake String[] biar semua data msk ke MhsView nnt
    public String[] render() {
        String nim = CLIUtil.getString("NIM : ");
        String kodeJurusan = CLIUtil.getString("Kode jurusan : ");
        String nama = CLIUtil.getString("Nama : ");
        String alamat = CLIUtil.getString("Alamat : ");
        String tempatLahir = CLIUtil.getString("Tempat lahir : ");
        String tanggalLahir = CLIUtil.getString("Tanggal lahir : ");
        String telepon = CLIUtil.getString("Telepon : ");

        // if nya gimana? biar bisa if isSarjana, isMagister, isDoktor
        // eh ternyata di MahasiswaView nya lgsg deng if condinya

        System.out.println("yey add");

        return new String[]{nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon};
    }
}
