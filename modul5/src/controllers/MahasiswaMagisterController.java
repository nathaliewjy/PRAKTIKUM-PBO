package controllers;

import models.Mahasiswa;
import models.MahasiswaMagister;
import models.MahasiswaSarjana;
import repository.MahasiswaRepository;

import java.util.List;

public class MahasiswaMagisterController {
    private MahasiswaRepository mahasiswaRepository;

    public List<MahasiswaMagister> getAllMhssS2() {
        return MahasiswaRepository.findAllMagister();
    }

    public void addMagister(String tesis, String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        MahasiswaRepository.addMahasiswaMagister(tesis, nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon);
    }

    // pake array krn nampilin semua mhs masuk ke list
    public MahasiswaMagister[] findAllMagister() {
        // conn prepstat get all mhs
        // conn prepstat get all jurusan (ada di JurusanController.findAll())
        // resolve object 1 per 1
        List<MahasiswaMagister> mhssS2 = MahasiswaRepository.findAllMagister();
        return new MahasiswaMagister[0];
    }

    // kl ini cmn nampilin 1 mhs aja brdsrkn nim
    public MahasiswaMagister get(String nim) {
        return null;
    }
}
