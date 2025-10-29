package models;

import java.util.ArrayList;

public abstract class Dosen extends Staff {
    private String departemen;
    private ArrayList<MatkulAjar> matkulAjar;

    public Dosen(UserType type, String nik, String departemen, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(type, nik, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.departemen = departemen;
        this.matkulAjar = new ArrayList<>();
    }

    public String getDepartemen() {
        return departemen;
    }

    public ArrayList<MatkulAjar> getListMatkulAjar() {
        return this.matkulAjar;
    }

    public void addMatkulAjar(MatkulAjar matkul) {
        this.matkulAjar.add(matkul);
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.departemen + " " + this.matkulAjar;
    }
}
