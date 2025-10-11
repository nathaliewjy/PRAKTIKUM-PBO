package models;

public class Presensi {
    private String tanggal;
    private Status status;

    public Presensi(String tanggal, Status status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}
