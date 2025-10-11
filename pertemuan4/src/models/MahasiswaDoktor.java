package models;

import java.util.ArrayList;

public class MahasiswaDoktor extends Mahasiswa {
    private String disertasi;
    private int sidang1;
    private int sidang2;
    private int sidang3;

    public MahasiswaDoktor(String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(UserType.MAHASISWA_DOKTOR, nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.disertasi = disertasi;
        this.sidang1 = sidang1;
        this.sidang2 = sidang2;
        this.sidang3 = sidang3;
    }

    public String getDisertasi() {
        return disertasi;
    }

    public void setDisertasi(String disertasi) {
        this.disertasi = disertasi;
    }

    public int getSidang1() {
        return sidang1;
    }

    public void setSidang1(int sidang1) {
        this.sidang1 = sidang1;
    }

    public int getSidang2() {
        return sidang2;
    }

    public void setSidang2(int sidang2) {
        this.sidang2 = sidang2;
    }

    public int getSidang3() {
        return sidang3;
    }

    public void setSidang3(int sidang3) {
        this.sidang3 = sidang3;
    }
}
