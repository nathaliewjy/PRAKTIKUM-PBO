package models;

public class Mahasiswa extends User {
    private String nim;
    private String kodeJurusan;

    // usertype ga masuk parameter krn usertype cmn bs 1
    // kl udh jd mhs gbs jd staff -> mknya lgsg dideclare aja di super
    public Mahasiswa(String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(UserType.MAHASISWA, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.nim = nim;
        this.kodeJurusan = kodeJurusan;
    }

    public String getNim() {
        return nim;
    }

}
