package views.staff;

import controllers.StaffController;
import models.*;

import java.util.List;

public class StaffListView {
    private StaffController staffController;

    public StaffListView() {
        this.staffController = new StaffController();
    }

    public void renderStf() {
        List<Staff> stfs = staffController.getAllStfs();

        for (int i = 0; i < stfs.size(); i++) {
            Staff stf = stfs.get(i);

            System.out.println("NIK : " + stf.getNik());
            System.out.println("Nama : " + stf.getNama());
            System.out.println("Alamat : " + stf.getAlamat());
            System.out.println("Tempat lahir : " + stf.getTempatLahir());
            System.out.println("Tanggal lahir : " + stf.getTanggalLahir());
            System.out.println("Telpon : " + stf.getTelepon());

            if (stf instanceof Karyawan) {
                Karyawan kar = (Karyawan) stf;
                System.out.println("Salaary : " + kar.getSalary());
            } else if (stf instanceof Dosen) {
                Dosen dsn = (Dosen) stf;
                System.out.println("Departmen : " + dsn.getDepartemen());
                System.out.println("Matkul ajar : " + dsn.getListMatkulAjar());

                if (stf instanceof DosenTetap) {
                    DosenTetap dsnTtp = (DosenTetap) stf;
                    System.out.println("Salary : " + dsnTtp.getSalary());
                } else if (stf instanceof DosenHonorer) {
                    DosenHonorer dsnHnr = (DosenHonorer) stf;
                    System.out.println("Honor per sks : " + dsnHnr.getHonorPerSKS());
                }
            }
        }
    }
}
