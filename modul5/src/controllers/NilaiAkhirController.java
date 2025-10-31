package controllers;

import models.*;
import repository.MahasiswaRepository;

import java.util.ArrayList;
import java.util.List;

public class NilaiAkhirController {
    public double hitungNA(String nim, String kodeMatkul) {
        Mahasiswa mhs = MahasiswaRepository.findByNim(nim);

        if (mhs == null) {
            System.out.println("G ada mhs nua");
        }

        if (mhs.getUserType() == UserType.MAHASISWA_SARJANA || mhs.getUserType() == UserType.MAHASISWA_MAGISTER) {
            List<MatkulAmbil> matkuls = new ArrayList<>();

            if(mhs.getUserType() == UserType.MAHASISWA_SARJANA) {
                matkuls = ((MahasiswaSarjana) mhs).getListMatkulAmbil();
            } else if (mhs.getUserType() == UserType.MAHASISWA_MAGISTER) {
                matkuls = ((MahasiswaMagister) mhs).getListMatkulAmbil();
            }

            for (MatkulAmbil matkul : matkuls) {
                if (matkul.getKodeMatkul().equalsIgnoreCase(kodeMatkul)) {
                    return matkul.hitungNA();
                }
            }
        }

        if (mhs.getUserType() == UserType.MAHASISWA_DOKTOR) {
            return ((MahasiswaDoktor) mhs).hitungNA();
        }

        return -1.0;
    }

    public double hitungRataNA(String kodeMatkul) {
        List<Mahasiswa> mhss = MahasiswaRepository.findAll();
        double totalNA =  0.0;
        int semuaMhs = 0;

        for (Mahasiswa mhs : mhss) {
            if (mhs.getUserType() == UserType.MAHASISWA_SARJANA || mhs.getUserType() == UserType.MAHASISWA_MAGISTER) {
                List<MatkulAmbil> matkuls = new ArrayList<>();

                if (mhs.getUserType() == UserType.MAHASISWA_SARJANA) {
                    matkuls = ((MahasiswaSarjana) mhs).getListMatkulAmbil();
                } else if (mhs.getUserType() == UserType.MAHASISWA_MAGISTER) {
                    matkuls = ((MahasiswaMagister) mhs).getListMatkulAmbil();
                }

                for (MatkulAmbil matkul : matkuls) {
                    if (matkul.getKodeMatkul().equalsIgnoreCase(kodeMatkul)) {
                        totalNA += matkul.hitungNA(); // kl yg di atas lgsg return, ini ditaro biar ngumpulsmua
                        semuaMhs++; // ni jg sama biar mhs nya keitung smua
                    }
                }
            }
        }

        return totalNA / semuaMhs;
    }

    public int[] hitungMahasiswaGagal(String kodeMatkul) {
        List<Mahasiswa> mhss = MahasiswaRepository.findAll();
        double NA  = 0.0;
        int mhsGagal = 0;
        int semuaMhs = 0;

        for (Mahasiswa mhs : mhss) {
            if (mhs.getUserType() == UserType.MAHASISWA_SARJANA || mhs.getUserType() == UserType.MAHASISWA_MAGISTER) {
                List<MatkulAmbil> matkuls = new ArrayList<>();

                if (mhs.getUserType() == UserType.MAHASISWA_SARJANA) {
                    matkuls = ((MahasiswaSarjana) mhs).getListMatkulAmbil();
                } else if (mhs.getUserType() == UserType.MAHASISWA_MAGISTER) {
                    matkuls = ((MahasiswaMagister) mhs).getListMatkulAmbil();
                }

                for (MatkulAmbil matkul : matkuls) {
                    if (matkul.getKodeMatkul().equalsIgnoreCase(kodeMatkul)) {
                        NA = matkul.hitungNA();

                        if (NA < 56.0) {
                            mhsGagal++; // konsepnua sama, biar mhs nya keitung smua
                        }

                        semuaMhs++;

                        break;
                    }
                }
            }
        }

        return new int[]{mhsGagal, semuaMhs};
    }
}
