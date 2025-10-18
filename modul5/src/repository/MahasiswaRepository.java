package repository;

import models.*;

import java.util.ArrayList;
import java.util.List;

public class MahasiswaRepository {
    private static List<Mahasiswa> mhss;
    private static List<MahasiswaSarjana> mhssS1;

    static {
        mhss = new ArrayList<>();
        mhssS1 = new ArrayList<>();
    }

    public static List<Mahasiswa> findAll() {
        return mhss;
    }

    public Mahasiswa findByNim(String nim) {
        for (Mahasiswa mhs : mhss) {
            if (mhs.getNim().equals(nim)) {
                return mhs;
            }
        }
        return null;
    }


    public static List<MahasiswaSarjana> findAllSarjana() {
        return mhssS1;
    }

    public static void addMahasiswaSarjana(String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        mhssS1.add(new MahasiswaSarjana(nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon));
    }

    public static MahasiswaSarjana findByNimS1(String nim) {
        for (MahasiswaSarjana mhsS1 : mhssS1) {
            if (mhsS1.getNim().equals(nim)) {
                return mhsS1;
            }
        }
        return null;
    }
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
