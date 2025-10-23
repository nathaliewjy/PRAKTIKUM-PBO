package repository;

import models.*;

import java.util.ArrayList;
import java.util.List;

public class MahasiswaRepository {
    private static List<Mahasiswa> mhss;
    private static List<MahasiswaSarjana> mhssS1;
    private static List<MahasiswaMagister> mhssS2;
    private static List<MahasiswaDoktor> mhssS3;

    static {
        mhss = new ArrayList<>();
        mhssS1 = new ArrayList<>();
        mhssS2 = new ArrayList<>();
        mhssS3 = new ArrayList<>();
    }

    public static List<Mahasiswa> findAll() {
        return mhss;
    }

    public static Mahasiswa findByNim(String nim) {
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
        mhss.add(new MahasiswaSarjana(nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon));
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

    public static List<MahasiswaMagister> findAllMagister() {
        return mhssS2;
    }

    public static void addMahasiswaMagister(String tesis, String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        mhss.add(new MahasiswaMagister(tesis, nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon));
        mhssS2.add(new MahasiswaMagister(tesis, nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon));
    }

    public static MahasiswaMagister findByNimS2(String nim) {
        for (MahasiswaMagister mhsS2 : mhssS2) {
            if (mhsS2.getNim().equals(nim)) {
                return mhsS2;
            }
        }
        return null;
    }

    public static List<MahasiswaDoktor> findAllDoktor() {
        return mhssS3;
    }

    public static void addMahasiswaDoktor(String disertasi, int sidang1, int sidang2, int sidang3, String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        mhss.add(new MahasiswaDoktor(disertasi, sidang1, sidang2, sidang3, nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon));
        mhssS3.add(new MahasiswaDoktor(disertasi, sidang1, sidang2, sidang3, nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon));
    }

    public static MahasiswaDoktor findByNimS3(String nim) {
        for (MahasiswaDoktor mhsS3 : mhssS3) {
            if (mhsS3.getNim().equals(nim)) {
                return mhsS3;
            }
        }
        return null;
    }


}
