package repository;

import models.*;

import java.util.ArrayList;
import java.util.List;

public class MahasiswaRepository {
    private static List<Mahasiswa> mhss;

    static {
        mhss = new ArrayList<>();
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

    public static MahasiswaSarjana findByNimS1(String nim) {
        Mahasiswa mhs = findByNim(nim);

        if (mhs instanceof MahasiswaSarjana) {
            return (MahasiswaSarjana) mhs;
        }

        return null;
    }

    public static MahasiswaMagister findByNimS2(String nim) {
        Mahasiswa mhs = findByNim(nim);

        if (mhs instanceof MahasiswaMagister) {
            return (MahasiswaMagister) mhs;
        }

        return null;
    }

    public static void addMahasiswa(Mahasiswa mhs) {
        mhss.add(mhs);
    }

    // 1. Print UserData apabila diberi input nama, tampilkan juga statusnya (mahasiswa, dosen tetap, honorer, karyawan, dst.)
    public static Mahasiswa findByNama(String nama) {
        for (Mahasiswa mhs : mhss) {
            if (mhs.getNama().equalsIgnoreCase(nama)) {
                return mhs;
            }
        }
        return null;
    }
}
