package controllers;

import models.*;
import repository.StaffRepository;

public class PresensiStaffController {
    public void addPresensiKeMatAjar(String nik, String kodeMatkul, int jam, String tanggal, int statusInt) {
        Staff stf = StaffRepository.findByNikDsn(nik);
        Dosen dsn = (Dosen) stf;

        // nyari mat ajar di list dsn
        MatkulAjar matAjar = null;
        for (MatkulAjar matkul : dsn.getListMatkulAjar()) {
            if (matkul.getKodeMatkul().equalsIgnoreCase(kodeMatkul)) {
                matAjar = matkul;
            }
        }

        Status status;
        if (statusInt == 1) {
            status = Status.HADIR;
        } else {
            status = Status.ALPHA;
        }

        matAjar.getListPresensiStaff().add(new PresensiStaff(jam, tanggal, status));

        System.out.println("yey add presensi");
    }
}
