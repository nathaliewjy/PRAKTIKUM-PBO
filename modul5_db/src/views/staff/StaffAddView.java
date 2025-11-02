package views.staff;

import util.CLIUtil;

public class StaffAddView {

    // pake String[] biar semua data msk ke DsnView nnt
    public String[] render() {
        String nik = CLIUtil.getString("NIK : ");
        String nama = CLIUtil.getString("Nama : ");
        String alamat = CLIUtil.getString("Alamat : ");
        String tempatLahir = CLIUtil.getString("Tempat lahir : ");
        String tanggalLahir = CLIUtil.getString("Tanggal lahir : ");
        String telepon = CLIUtil.getString("Telepon : ");

        System.out.println("yey add data staff");

        return new String[]{nik, nama, alamat, tempatLahir, tanggalLahir, telepon};
    }
}
