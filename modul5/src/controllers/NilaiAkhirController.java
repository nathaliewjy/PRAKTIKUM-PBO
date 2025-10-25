package controllers;

import models.*;
import repository.MahasiswaRepository;

import java.util.List;

public class NilaiAkhirController {
    public double hitungNA(String nim, String kodeMatkul) {
        Mahasiswa mhs = MahasiswaRepository.findByNim(nim);

        if (mhs instanceof MahasiswaSarjana || mhs instanceof MahasiswaMagister) {
            List<MatkulAmbil> matkulAmbil;

            if (mhs instanceof MahasiswaSarjana) {
                matkulAmbil = ((MahasiswaSarjana) mhs).getListMatkulAmbil();
            } else {
                matkulAmbil = ((MahasiswaMagister) mhs).getListMatkulAmbil();
            }

            for (MatkulAmbil matkul : matkulAmbil) {
                if (matkul.getKodeMatkul().equalsIgnoreCase(kodeMatkul)) {
                    return matkul.hitungNA();
                }
            }
        }

        if (mhs instanceof MahasiswaDoktor) {
            MahasiswaDoktor mhsS3 = (MahasiswaDoktor) mhs;
            return mhsS3.hitungNA();
        }

        return -1.0;
    }

    public double hitungRataNA(String kodeMatkul) {
        List<Mahasiswa> mhss = MahasiswaRepository.findAll();
        double totalNA =  0.0;
        int semuaMhs = 0;

        for (Mahasiswa mhs : mhss) {
            if (mhs instanceof MahasiswaSarjana || mhs instanceof MahasiswaMagister) {
                List<MatkulAmbil> matkulAmbil;

                if (mhs instanceof MahasiswaSarjana) {
                    matkulAmbil = ((MahasiswaSarjana) mhs).getListMatkulAmbil();
                } else {
                    matkulAmbil = ((MahasiswaMagister) mhs).getListMatkulAmbil();
                }

                for (MatkulAmbil matkul : matkulAmbil) {
                    if (matkul.getKodeMatkul().equalsIgnoreCase(kodeMatkul)) {
                        totalNA += matkul.hitungNA(); // kl yg di atas lgsg return, ini ditaro biar ngumpulsmua
                        semuaMhs++; // ni jg sama biar mhs nya keitung smua

                        break;
                    }
                }
            }
        }

        return (totalNA / semuaMhs);
    }

    public int[] hitungMahasiswaGagal(String kodeMatkul) {
        List<Mahasiswa> mhss = MahasiswaRepository.findAll();
        double NA  = 0.0;
        int mhsGagal = 0;
        int semuaMhs = 0;

        for (Mahasiswa mhs : mhss) {
            if (mhs instanceof MahasiswaSarjana || mhs instanceof MahasiswaMagister) {
                List<MatkulAmbil> matkulAmbil;

                if (mhs instanceof MahasiswaSarjana) {
                    matkulAmbil = ((MahasiswaSarjana) mhs).getListMatkulAmbil();
                } else {
                    matkulAmbil = ((MahasiswaMagister) mhs).getListMatkulAmbil();
                }

                for (MatkulAmbil matkul : matkulAmbil) {
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
