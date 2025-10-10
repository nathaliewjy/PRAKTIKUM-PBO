package models;

import java.util.ArrayList;

public class MahasiswaMagister extends Mahasiswa {
    private ArrayList<Matkul> matkul;
    private String tesis;

    public MahasiswaMagister(String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.matkul = new ArrayList<>();
        this.tesis = tesis;
    }

    public String getTesis() {
        return tesis;
    }

    public void setTesis(String tesis) {
        this.tesis = tesis;
    }

    public ArrayList<Matkul> getListMatkul() {
        return this.matkul;
    }
}
