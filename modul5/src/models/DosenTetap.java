package models;

public class DosenTetap extends Dosen{
    private int salary;

    public DosenTetap(int salary, String nik, String departemen, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(UserType.DOSEN_TETAP, nik, departemen, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.salary;
    }

    @Override
    public double hitungGaji(int unit) {
        return salary + (unit* 25000);
    }
}
