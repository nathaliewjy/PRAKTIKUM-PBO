package controllers;

import models.Dosen;
import repository.StaffRepository;

import java.util.List;

public class DosenController {
    private StaffRepository staffRepository;

    public List<Dosen> getAllDsns() {
        return staffRepository.findAll();
    }

    public void addDosen(Dosen dsn) {
        StaffRepository.addDosen(dsn);
    }
}
