package controllers;

import models.Staff;
import repository.StaffRepository;

import java.util.List;

public class StaffController {
    private StaffRepository staffRepository;

    public List<Staff> getAllStfs() {
        return staffRepository.findAll();
    }

    public void addStaff(Staff stf) {
        StaffRepository.addStaff(stf);
    }
}
