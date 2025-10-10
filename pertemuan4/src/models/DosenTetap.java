package models;

public class DosenTetap extends Dosen{
    private int salary;

    public DosenTetap(int salary, String nik, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(nik, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
