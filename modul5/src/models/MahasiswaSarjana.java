package models;

import java.util.ArrayList;

public class MahasiswaSarjana extends Mahasiswa {
    private ArrayList<MatkulAmbil> matkulAmbil;

    public MahasiswaSarjana(String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(UserType.MAHASISWA_SARJANA, nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.matkulAmbil = new ArrayList<>();
    }

    public ArrayList<MatkulAmbil> getListMatkulAmbil() {
        return this.matkulAmbil;
    }

    public void addMatkulAmbil(int n1, int n2, int n3, String kodeMatkul, String namaMatkul, int sks) {
        this.matkulAmbil.add(new MatkulAmbil(n1, n2, n3, kodeMatkul, namaMatkul, sks));
    }

//    public void addMatkulAmbil(MatkulAmbil matkul) {
//        this.matkulAmbil.add(matkul);
//    }

    @Override
    public String toString() {
        return super.toString() + " " + this.matkulAmbil;
    }
}
