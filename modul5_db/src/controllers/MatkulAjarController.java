package controllers;

import models.Dosen;
import models.MatkulAjar;
import repository.StaffRepository;

public class MatkulAjarController {
    public void addMatkulKeDsn(String nik, String kodeMatkul, String namaMatkul, int sks) {
        Dosen dsn = StaffRepository.findByNikDsn(nik);

        if (dsn == null) {
            System.out.println("NIK nya g ada");
            return;
        }

        dsn.addMatkulAjar(new MatkulAjar(kodeMatkul, namaMatkul, sks));
    }
}
