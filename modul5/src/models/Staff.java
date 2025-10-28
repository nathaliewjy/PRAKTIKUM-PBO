package models;

public abstract class Staff extends User {
    private String nik;

    // usertype ga masuk parameter krn usertype cmn bs 1
    // kl udh jd staff gbs jd mhs -> mknya lgsg dideclare aja di super
    public Staff(UserType type, String nik, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(type, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.nik;
    }

    // 7. Print gaji seorang staff tertentu dengan ketentuan : (unit teh jumlah hadir)
    public abstract double hitungGaji(int unit);
}
