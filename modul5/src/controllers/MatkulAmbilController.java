package controllers;

import models.MahasiswaSarjana;
import models.MatkulAmbil;
import repository.MahasiswaRepository;

public class MatkulAmbilController {
    private MahasiswaRepository mahasiswaRepository;

    public void addMatkulKeMhs(String nim, int n1, int n2, int n3, String kodeMatkul, String namaMatkul, int sks) {
        MahasiswaSarjana mhsS1 = MahasiswaRepository.findByNimS1(nim);
        MatkulAmbil matkul = new MatkulAmbil(n1, n2, n3, kodeMatkul, namaMatkul, sks);

        mhsS1.addMatkulAmbil(matkul);
    }
}
