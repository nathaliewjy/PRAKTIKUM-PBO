package models;

import java.util.ArrayList;

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

    public ArrayList<MatkulAmbil> getListMatkulAmbil() {
        return this.matkulAmbil;
    }

    public void addMatkulAmbil(int n1, int n2, int n3, String kodeMatkul, String namaMatkul, int sks) {
//        MatkulAmbil matkulAmbil1 = new MatkulAmbil(n1, n2, n3, kodeMatkul, namaMatkul, sks);
//        this.matkulAmbil.add(matkulAmbil1);
        this.matkulAmbil.add(new MatkulAmbil(n1, n2, n3, kodeMatkul, namaMatkul, sks));
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.matkulAmbil + " " + this.tesis;
    }
}
