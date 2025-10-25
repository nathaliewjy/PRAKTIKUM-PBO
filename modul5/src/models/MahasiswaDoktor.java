package models;

import java.util.ArrayList;

public class MahasiswaDoktor extends Mahasiswa {
    private String disertasi;
    private int sidang1;
    private int sidang2;
    private int sidang3;

    public MahasiswaDoktor(String disertasi, int sidang1, int sidang2, int sidang3, String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
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

    @Override
    public String toString() {
        return super.toString() + " " + this.disertasi + " " + this.sidang1 + " " + this.sidang2 + " " + this.sidang3;
    }

    //     // 2. Print Nilai Akhir (NA) untuk seorang mahasiswa apabila diinput NIM dan KodeMK-nya.
    public double hitungNA() {
        return (sidang1 + sidang2 + sidang3) / 3.0;
    }
}
