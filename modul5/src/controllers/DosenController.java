package controllers;

import models.*;
import repository.StaffRepository;

import java.util.ArrayList;
import java.util.List;

public class DosenController {

    public List<Dosen> getAllDsns() {
        List<Staff> stfs = StaffRepository.findAll();
        List<Dosen> dsns = new ArrayList<>();

        for (Staff stf : stfs) {
            if (stf.getUserType() == UserType.DOSEN_TETAP || stf.getUserType() == UserType.DOSEN_HONORER) {
                dsns.add((Dosen) stf);
                // inite casting, jadi stf kan awalnya Staff trs mo diganti ke Dosen, tujuannua biar bs akses method" yg cmn dipunya Dosen
            }
        }

        return dsns;
    }

    public void addDosen(Dosen dsn) {
        StaffRepository.addStaff(dsn);
    }

    // 6. Print total berapa jam seorang dosen (input NIK Dosen) masuk kelas dan mengajar (akumulasidari seluruh MK yang diajar)
    public int hitungJamNgajar(String nik) {
        int totalJam = 0;

        Staff stf = StaffRepository.findByNik(nik);
        Dosen dsn = (Dosen) stf;

        // ni ngeloop matkul yg dia ajar, trs loop presensinua
        for (MatkulAjar matkulAjar : dsn.getListMatkulAjar()) {
            for (PresensiStaff pres : matkulAjar.getListPresensiStaff()) {
                if (pres.getStatus() == Status.HADIR) {
                    totalJam += pres.getJam();
                }
            }
        }

        return totalJam;
    }
}
