package models;

import java.util.ArrayList;

public abstract class Staff extends User {
    private String nik;
    private ArrayList<PresensiStaff> presensiStaff;

    // usertype ga masuk parameter krn usertype cmn bs 1
    // kl udh jd staff gbs jd mhs -> mknya lgsg dideclare aja di super
    public Staff(UserType type, String nik, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(type, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.nik = nik;
        this.presensiStaff = new ArrayList<>();
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public ArrayList<PresensiStaff> getPresensiStaff() {
        return this.presensiStaff;
    }

    public void addPresensi(int jam, String tanggal, Status status) {
        this.presensiStaff.add(new PresensiStaff(jam, tanggal, status));
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.nik;
    }

    // 7. Print gaji seorang staff tertentu dengan ketentuan : (unit teh jumlah hadir)
    public abstract double hitungGaji();

    public int hitungUnit() {
        int totalHadir = 0;

        for (PresensiStaff pres : this.presensiStaff) {
            if (pres.getStatus() == Status.HADIR)  {
                totalHadir++;
            }
        }

        return totalHadir;
    }
}
