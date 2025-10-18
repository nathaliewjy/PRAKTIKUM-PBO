package controllers;

import models.Mahasiswa;

import repository.MahasiswaRepository;

import java.util.List;


public class MahasiswaController {
    private MahasiswaRepository mahasiswaRepository;

    public MahasiswaController() {
        this.mahasiswaRepository = new MahasiswaRepository();
    }

    public List<Mahasiswa> getAllMhss() {
        return this.mahasiswaRepository.findAll();
    }

//    public void add(String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
//        MahasiswaRepository.add(nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon);
//    }

    public void add(Mahasiswa mhs) {
        this.mahasiswaRepository.addMahasiswa(mhs);
    }

    public void delete() {

    }

    public void update(String nim, Mahasiswa mhs) {

    }

    // pake array krn nampilin semua mhs masuk ke list
    public Mahasiswa[] findAll() {
        // conn prepstat get all mhs
        // conn prepstat get all jurusan (ada di JurusanController.findAll())
        // resolve object 1 per 1

        return new Mahasiswa[];
    }

    // kl ini cmn nampilin 1 mhs aja brdsrkn nim
    public Mahasiswa get(String nim) {
        return null;
    }
}
