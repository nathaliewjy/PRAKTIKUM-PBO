package views.staff;

import controllers.PresensiStaffController;
import util.CLIUtil;

public class PresensiStaffAddView {
    private PresensiStaffController presensiStaffController;

    public PresensiStaffAddView() {
        this.presensiStaffController = new PresensiStaffController();
    }

    public void render() {
        System.out.println("NIK : ");
        String nik = CLIUtil.getString();
        System.out.println("Kode mk buat add pres : ");
        String kodeMatkul = CLIUtil.getString();
        System.out.println("Jam : ");
        int jam = CLIUtil.getInt();
        System.out.println("Tangga : ");
        String tanggal = CLIUtil.getString();
        System.out.println("Status (0/1) : ");
        int statusInt = CLIUtil.getInt();

        presensiStaffController.addPresensiKeMatAjar(nik, kodeMatkul, jam, tanggal, statusInt);
    }
}
