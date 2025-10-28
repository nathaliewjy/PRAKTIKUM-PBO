package models;

import java.util.ArrayList;

public class Karyawan extends Staff {
    private int salary;
    private ArrayList<PresensiStaff> presensiStaff;

    public Karyawan(int salary, String nik, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(UserType.KARYAWAN, nik, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.salary = salary;
        this.presensiStaff = new ArrayList<>();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return this.presensiStaff;
    }

    public void addPresensiStaff(int jam, String tanggal, Status status) {
//        PresensiStaff presensiStaff1 = new PresensiStaff(jam, tanggal, status);
//        this.presensiStaff.add(presensiStaff1);
        this.presensiStaff.add(new PresensiStaff(jam, tanggal, status));
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.salary + " " + this.presensiStaff;
    }

    @Override
    public double hitungGaji(int unit) {
        return (unit * 22.0) * salary;
    }
}
