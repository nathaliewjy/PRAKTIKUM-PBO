package controllers;

import models.Mahasiswa;
import models.MahasiswaSarjana;

import repository.MahasiswaRepository;

import java.util.List;

public class MahasiswaSarjanaController {
    private MahasiswaRepository mahasiswaRepository;

    public MahasiswaSarjanaController(MahasiswaRepository mhsRepo) {
        this.mahasiswaRepository = new MahasiswaRepository();
    }

    public List<MahasiswaSarjana> getAllMhssS1() {
        return this.mahasiswaRepository.findAllSarjana();
    }

    public void addSarjana(String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        mahasiswaRepository.addSarjana(new MahasiswaSarjana(nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon));
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
        List<MahasiswaSarjana> mhssS2 = this.mahasiswaRepository.findAllSarjana();
        return new MahasiswaSarjana[0];
    }

    // kl ini cmn nampilin 1 mhs aja brdsrkn nim
    public MahasiswaSarjana get(String nim) {
        return null;
    }
}
