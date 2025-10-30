package controllers;

import models.Mahasiswa;

import repository.MahasiswaRepository;

import java.util.List;


public class MahasiswaController {

    public List<Mahasiswa> getAllMhss() {
        return MahasiswaRepository.findAll();
    }

    public void addMahasiswa(Mahasiswa mhs) {
        MahasiswaRepository.addMahasiswa(mhs);
    }
}
