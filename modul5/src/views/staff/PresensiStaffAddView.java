package views.staff;

import controllers.PresensiStaffController;
import util.CLIUtil;

public class PresensiStaffAddView {
    private PresensiStaffController presensiStaffController;

    public PresensiStaffAddView() {
        this.presensiStaffController = new PresensiStaffController();
    }

    public void render() {
        String nik = CLIUtil.getString("NIK : ");
        String kodeMatkul = CLIUtil.getString("Kode mk buat add pres : ");
        int jam = CLIUtil.getInt("Jam : ");
        String tanggal = CLIUtil.getString("Tangga : ");
        int statusInt = CLIUtil.getInt("Status (0/1) : ");

        presensiStaffController.addPresensiKeMatAjar(nik, kodeMatkul, jam, tanggal, statusInt);
    }
}
