package views;

import controllers.MahasiswaController;
import models.*;
import repository.MahasiswaRepository;
import util.CLIUtil;

import java.util.List;

public class MatkulPresensiView {
    public void render() {
        System.out.print("NIM : ");
        String nim = CLIUtil.getString();

        Mahasiswa mhs = MahasiswaRepository.findByNim(nim);

        if (mhs instanceof MahasiswaSarjana || mhs instanceof MahasiswaMagister) {
            List<MatkulAmbil> matkulAmbil;

            if (mhs instanceof MahasiswaSarjana) {
                matkulAmbil = ((MahasiswaSarjana) mhs).getListMatkulAmbil();
            } else {
                matkulAmbil = ((MahasiswaMagister) mhs).getListMatkulAmbil();
            }

            for (MatkulAmbil matkul : matkulAmbil) {
                int totalPres = matkul.hitungTotalPresensi();

                System.out.printf("Matkul : " + matkul.getKodeMatkul() + matkul.getNamaMatkul());
                System.out.printf("Total presensi : " + totalPres);
            }
        }
    }
}
