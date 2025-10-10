package models;

public class Staff extends User {
    private String nik;

    public String getNik() {
        return nik;
    }

    // usertype ga masuk parameter krn usertype cmn bs 1
    // kl udh jd staff gbs jd mhs -> mknya lgsg dideclare aja di super
    public Staff(String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(UserType.STAFF, nama, alamat, tempatLahir, tanggalLahir, telepon);
    }
}
