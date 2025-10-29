package controllers;

import models.Staff;
import repository.StaffRepository;

import java.util.List;

public class StaffController {

    public List<Staff> getAllStfs() {
        return StaffRepository.findAll();
    }

    public void addStaff(Staff stf) {
        StaffRepository.addStaff(stf);
    }

    public Staff findByNik(String nik) {
        return StaffRepository.findByNik(nik);
    }

    public double getGaji(String nik) {
        Staff stf = findByNik(nik);

        return stf.hitungGaji();
    }
}
