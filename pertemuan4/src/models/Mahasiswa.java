package models;

public class Mahasiswa extends User {
    private String nim;
    private String kodeJurusan;

    public Mahasiswa(UserType type, String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(type, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.nim = nim;
        this.kodeJurusan = kodeJurusan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKodeJurusan() {
        return kodeJurusan;
    }

    public void setKodeJurusan(String kodeJurusan) {
        this.kodeJurusan = kodeJurusan;
    }



    @Override
    public String toString() {
        return super.toString() + " " + this.nim + " " + this.kodeJurusan;
    }
}
