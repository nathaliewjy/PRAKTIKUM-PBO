package controllers;

import models.Dosen;
import models.MatkulAjar;
import models.PresensiStaff;
import models.Status;
import repository.StaffRepository;

public class PresensiStaffController {
    public void addPresensiKeMatAjar(String nik, String kodeMatkul, int jam, String tanggal, int statusInt) {
        Dosen dsn = StaffRepository.findByNikDsn(nik);

        // nyari mat ajar di list dsn
        MatkulAjar matAjar = null;
        for (MatkulAjar matkul : dsn.getListMatkulAjar()) {
            if (matkul.getKodeMatkul().equals(kodeMatkul)) {
                matAjar = matkul;
            }
        }

        Status status;
        if (statusInt == 1) {
            status = Status.HADIR;
        } else {
            status = Status.ALPHA;
        }

        PresensiStaff pres = new PresensiStaff(jam, tanggal, status);

        matAjar.getListPresensiStaff().add(pres);

        System.out.println("yey add presensi");
    }
}
