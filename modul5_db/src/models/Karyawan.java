package models;

import java.util.ArrayList;

public class Karyawan extends Staff {
    private int salary;

    public Karyawan(int salary, String nik, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(UserType.KARYAWAN, nik, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.salary + " " + this.getPresensiStaff();
    }

    @Override
    public double hitungGaji() {
        int unit = this.hitungUnit();
        return ((double) unit * 22.0) * salary;
    }
}
