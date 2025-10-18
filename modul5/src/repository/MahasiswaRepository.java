package repository;

import models.Mahasiswa;
import models.MahasiswaDoktor;
import models.MahasiswaMagister;
import models.MahasiswaSarjana;

import java.util.ArrayList;
import java.util.List;

public class MahasiswaRepository {
    private List<Mahasiswa> mhss;

    public MahasiswaRepository() {
        this.mhss = new ArrayList<>();
    }

    public List<Mahasiswa> findAll() {
        return this.mhss;
    }

    public void addMahasiswa(Mahasiswa mhs) {
        this.mhss.add(mhs);
    }

    public Mahasiswa findByNim(String nim) {
        for (Mahasiswa mhs : this.mhss) {
            if (mhs.getNim().equals(nim)) {
                return mhs;
            }
        }
        return null;
    }

//
//    public List<MahasiswaSarjana> findAllSarjana() {
//        return this.mhssS1;
//    }
//
//    public void addSarjana(MahasiswaSarjana mhsS1) {
//        this.mhssS1.add(mhsS1);
//    }
//
//    public List<MahasiswaMagister> findAllMagister() {
//        return this.mhssS2;
//    }
//
//    public void addMagister(MahasiswaMagister mhsS2) {
//        this.mhssS2.add(mhsS2);
//    }
//
//    public List<MahasiswaDoktor> findAllDoktor() {
//        return this.mhssS3;
//    }
//
//    public void addDoktor(MahasiswaDoktor mhsS3) {
//        this.mhssS3.add(mhsS3);
//    }

}
