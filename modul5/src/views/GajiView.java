package views;

import controllers.StaffController;
import models.Staff;
import util.CLIUtil;

public class GajiView {
    private StaffController staffController;

    public GajiView()  {
        this.staffController = new StaffController();
    }

    public void render()  {
        String nik = CLIUtil.getString("NIK : ");

        double gaji = staffController.getGaji(nik);

        Staff stf = staffController.findByNik(nik);

        System.out.println("Gaji staff " + stf.getNik() + " : " + gaji);
    }
}
