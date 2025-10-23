package controllers;

import models.MahasiswaDoktor;
import repository.MahasiswaRepository;

import java.util.List;

public class MahasiswaDoktorController {
    private MahasiswaRepository mahasiswaRepository;

    public List<MahasiswaDoktor> getAllMhssS3() {
        return MahasiswaRepository.findAllDoktor();
    }

    public void addDoktor(String disertasi, int sidang1, int sidang2, int sidang3, String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        MahasiswaRepository.addMahasiswaDoktor(disertasi, sidang1, sidang2, sidang3, nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon);
    }

    // pake array krn nampilin semua mhs masuk ke list
    public MahasiswaDoktor[] findAllDoktor() {
        // conn prepstat get all mhs
        // conn prepstat get all jurusan (ada di JurusanController.findAll())
        // resolve object 1 per 1
        List<MahasiswaDoktor> mhssS3 = MahasiswaRepository.findAllDoktor();
        return new MahasiswaDoktor[0];
    }

    // kl ini cmn nampilin 1 mhs aja brdsrkn nim
    public MahasiswaDoktor get(String nim) {
        return null;
    }
}
