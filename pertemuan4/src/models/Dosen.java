package models;

import java.util.ArrayList;

public class Dosen extends Staff {
    private String departemen;
    private ArrayList<MatkulAjar> matkulAjar;

    public Dosen(String nik, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(nik, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.departemen = departemen;
        this.matkulAjar = new ArrayList<>();
    }

    public ArrayList<MatkulAjar> getListMatkul() {
        return this.matkulAjar;
    }
}
