package controllers;

import models.Mahasiswa;
import models.Staff;
import models.User;
import repository.MahasiswaRepository;
import repository.StaffRepository;

public class UserController {
    public User findByNama(String nama) {
        Staff stf = StaffRepository.findByNama(nama);
        if (stf != null) {
            return stf;
        }

        Mahasiswa mhs = MahasiswaRepository.findByNama(nama);
        if (mhs != null) {
            return mhs;
        }

        return null;
    }
}
