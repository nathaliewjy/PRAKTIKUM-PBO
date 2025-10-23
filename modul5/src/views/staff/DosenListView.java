package views.staff;

import controllers.DosenController;
import models.*;

import java.util.List;

public class DosenListView {
    private DosenController dosenController;

    public DosenListView() {
        this.dosenController = new DosenController();
    }

    public void renderDsn() {
        List<Dosen> dsns = dosenController.getAllDsns();

        for (int i = 0; i < dsns.size(); i++) {
            Dosen dsn = dsns.get(i);

            System.out.println("NIK : " + dsn.getNik());
            System.out.println("Departemen : " + dsn.getDepartemen());
            System.out.println("Nama : " + dsn.getNama());
            System.out.println("Alamat : " + dsn.getAlamat());
            System.out.println("Tempat lahir : " + dsn.getTempatLahir());
            System.out.println("Tanggal lahir : " + dsn.getTanggalLahir());
            System.out.println("Telpon : " + dsn.getTelepon());

            if (dsn instanceof DosenTetap) {
                DosenTetap dsnTtp = (DosenTetap) dsn;
                System.out.println("Saalry : " + dsnTtp.getSalary());
            } else if (dsn instanceof DosenHonorer) {
                DosenHonorer dsnHnr = (DosenHonorer) dsn;
                System.out.println("Horor per sks : " + dsnHnr.getHonorPerSKS());
            }
        }
    }
}
