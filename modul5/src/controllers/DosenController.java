package controllers;

import models.Dosen;
import models.Staff;
import repository.StaffRepository;

import java.util.ArrayList;
import java.util.List;

public class DosenController {

    public List<Dosen> getAllDsns() {
        List<Staff> stfs = StaffRepository.findAll();
        List<Dosen> dsns = new ArrayList<>();

        for (Staff stf : stfs) {
            if (stf instanceof Dosen) {
                dsns.add((Dosen) stf);
            }
        }

        return dsns;
    }

    public void addDosen(Dosen dsn) {
        StaffRepository.addStaff(dsn);
    }
}
