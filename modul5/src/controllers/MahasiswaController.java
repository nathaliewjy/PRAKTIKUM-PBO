package controllers;

import models.Mahasiswa;

import repository.MahasiswaRepository;

import java.util.List;


public class MahasiswaController {
    private MahasiswaRepository mahasiswaRepository;

    public List<Mahasiswa> getAllMhss() {
        return mahasiswaRepository.findAll();
    }

    public void addMahasiswa(Mahasiswa mhs) {
        MahasiswaRepository.addMahasiswa(mhs);
    }
}
