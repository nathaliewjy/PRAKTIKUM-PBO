package views.staff;

import util.CLIUtil;

public class StaffAddView {

    // pake String[] biar semua data msk ke DsnView nnt
    public String[] render() {
        System.out.print("NIK : ");
        String nik = CLIUtil.getString();
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

        System.out.println("yey add data staff");

        return new String[]{nik, nama, alamat, tempatLahir, tanggalLahir, telepon};
    }
}
