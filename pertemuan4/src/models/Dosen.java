package models;

import java.util.ArrayList;

public class Dosen extends Staff {
    private String departemen;
    private ArrayList<MatkulAjar> matkulAjar;

    public Dosen(UserType type, String nik, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(type, nik, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.departemen = departemen;
        this.matkulAjar = new ArrayList<>();
    }

    public ArrayList<MatkulAjar> getListMatkulAjar() {
        return this.matkulAjar;
    }

    public void addMatkulAjar(String kodeMatkul, String namaMatkul, int sks) {
        this.matkulAjar.add(new MatkulAjar(kodeMatkul, namaMatkul, sks));
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.departemen + " " + this.matkulAjar;
    }
}
