package models;

import java.util.ArrayList;

public class MahasiswaSarjana extends Mahasiswa {
    private ArrayList<Matkul> matkul;

    public MahasiswaSarjana(String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.matkul = new ArrayList<>();
    }

    public ArrayList<Matkul> getListMatkul() {
        return this.matkul;
    }
}
