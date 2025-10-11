package models;

import java.util.ArrayList;

public class Karyawan extends Staff {
    private int salary;
    private ArrayList<PresensiStaff> presensiStaff;

    public Karyawan(int salary, String nik, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(nik, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.salary = salary;
        this.presensiStaff = new ArrayList<>();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;;
    }

    public ArrayList<PresensiStaff> getPresensiStaff() {
        return this.presensiStaff;
    }


}
