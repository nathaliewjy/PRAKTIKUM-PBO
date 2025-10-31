package controllers;

import models.Dosen;
import models.MatkulAjar;
import models.Staff;
import repository.StaffRepository;

public class MatkulAjarController {
    public void addMatkulKeDsn(String nik, String kodeMatkul, String namaMatkul, int sks) {
        Staff stf = StaffRepository.findByNik(nik);
        Dosen dsn = (Dosen) stf;
        // inite casting, jadi stf kan awalnya Staff trs mo diganti ke Dosen, tujuannua biar bs akses method" yg cmn dipunya Dosen

        if (dsn == null) {
            System.out.println("NIK nya g ada");
            return;
        }

        dsn.addMatkulAjar(new MatkulAjar(kodeMatkul, namaMatkul, sks));
    }
}
