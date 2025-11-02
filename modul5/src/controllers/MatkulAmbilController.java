package controllers;

import models.*;
import repository.MahasiswaRepository;

public class MatkulAmbilController {

    public void addMatkulKeMhs(String nim, int n1, int n2, int n3, String kodeMatkul, String namaMatkul, int sks) {
        Mahasiswa mhs = MahasiswaRepository.findByNim(nim);
        MatkulAmbil matkul = new MatkulAmbil(n1, n2, n3, kodeMatkul, namaMatkul, sks);

        mhs.addMatkulAmbil(matkul);
    }

    public void addMatkulKeMhsS2(String nim, int n1, int n2, int n3, String kodeMatkul, String namaMatkul, int sks) {
        Mahasiswa mhs = MahasiswaRepository.findByNim(nim);
        MatkulAmbil matkul = new MatkulAmbil(n1, n2, n3, kodeMatkul, namaMatkul, sks);

        if (mhs.getUserType() == UserType.MAHASISWA_MAGISTER) {
            ((MahasiswaMagister) mhs).addMatkulAmbil(matkul);
        }
    }
}
