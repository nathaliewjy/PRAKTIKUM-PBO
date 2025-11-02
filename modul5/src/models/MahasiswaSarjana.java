package models;

import java.util.ArrayList;
import java.util.List;

public class MahasiswaSarjana extends Mahasiswa {
    private ArrayList<MatkulAmbil> matkulAmbil;

    public MahasiswaSarjana(String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(UserType.MAHASISWA_SARJANA, nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.matkulAmbil = new ArrayList<>();
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.matkulAmbil;
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
