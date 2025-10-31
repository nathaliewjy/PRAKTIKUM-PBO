package models;

import java.util.ArrayList;
import java.util.List;

public class MahasiswaMagister extends Mahasiswa {
    private ArrayList<MatkulAmbil> matkulAmbil;
    private String tesis;

    public MahasiswaMagister(String tesis, String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(UserType.MAHASISWA_MAGISTER, nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.matkulAmbil = new ArrayList<>();
        this.tesis = tesis;
    }

    public String getTesis() {
        return tesis;
    }

    public void setTesis(String tesis) {
        this.tesis = tesis;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.matkulAmbil + " " + this.tesis;
    }

    @Override
    public List<MatkulAmbil> getListMatkulAmbil() {
        return matkulAmbil;
    }

    @Override
    public void addMatkulAmbil(MatkulAmbil matkul) {
        matkulAmbil.add(matkul);
    }
}
