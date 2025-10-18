package controllers;

import models.Mahasiswa;
import models.MahasiswaSarjana;
import models.MatkulAmbil;

import repository.MahasiswaRepository;
import repository.MatkulAmbilRepository;

import java.util.ArrayList;
import java.util.List;

public class MahasiswaSarjanaController {
    private MahasiswaRepository mahasiswaRepository;
    private MatkulAmbilRepository matkulAmbilRepository;

    public MahasiswaSarjanaController() {
        this.matkulAmbilRepository = new MatkulAmbilRepository();
    }

//    // nyoba
//    public void print() {
//        System.out.println(mahasiswaRepository.findAllSarjana().getFirst().getNim());
//        System.out.println(mahasiswaRepository.findAllSarjana().getFirst().getNim());
//
//    }

    public List<MahasiswaSarjana> getAllMhssS1() {
        return MahasiswaRepository.findAllSarjana();
    }

    public void addSarjana(String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        MahasiswaRepository.addMahasiswaSarjana(nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon);
    }

    public void addMatkul(int n1, int n2, int n3, String kodeMatkul, String namaMatkul, int sks) {
        MahasiswaSarjana.addMatkulAmbil(new MatkulAmbil(n1, n2, n3, kodeMatkul, namaMatkul, sks));
    }

    public void delete() {

    }

    public void update(String nim, Mahasiswa mhs) {

    }

    // pake array krn nampilin semua mhs masuk ke list
    public MahasiswaSarjana[] findAllSarjana() {
        // conn prepstat get all mhs
        // conn prepstat get all jurusan (ada di JurusanController.findAll())
        // resolve object 1 per 1
        List<MahasiswaSarjana> mhssS2 = MahasiswaRepository.findAllSarjana();
        return new MahasiswaSarjana[0];
    }

    // kl ini cmn nampilin 1 mhs aja brdsrkn nim
    public MahasiswaSarjana get(String nim) {
        return null;
    }
}
