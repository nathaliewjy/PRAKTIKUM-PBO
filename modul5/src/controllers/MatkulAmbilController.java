package controllers;

import models.MahasiswaMagister;
import models.MahasiswaSarjana;
import models.MatkulAmbil;
import repository.MahasiswaRepository;

public class MatkulAmbilController {
    private MahasiswaRepository mahasiswaRepository;

    public void addMatkulKeMhs(String nim, int n1, int n2, int n3, String kodeMatkul, String namaMatkul, int sks) {
        MahasiswaSarjana mhsS1 = MahasiswaRepository.findByNimS1(nim);

        if (mhsS1 == null) {
            System.out.println("NIM nya g ada");
            return;
        }

        MatkulAmbil matkul = new MatkulAmbil(n1, n2, n3, kodeMatkul, namaMatkul, sks);

        mhsS1.addMatkulAmbil(matkul);
    }

    public void addMatkulKeMhsS2(String nim, int n1, int n2, int n3, String kodeMatkul, String namaMatkul, int sks) {
        MahasiswaMagister mhsS2 = MahasiswaRepository.findByNimS2(nim);

        if (mhsS2 == null) {
            System.out.println("NIM nya g ada");
            return;
        }

        MatkulAmbil matkul = new MatkulAmbil(n1, n2, n3, kodeMatkul, namaMatkul, sks);

        mhsS2.addMatkulAmbil(matkul);
    }
}
