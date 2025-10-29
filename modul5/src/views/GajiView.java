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
        System.out.print("NIK : ");
        String nik = CLIUtil.getString();

        double gaji = staffController.getGaji(nik);

        Staff stf = staffController.findByNik(nik);

        System.out.println("Gaji staff " + stf.getNik() + " : " + gaji);
    }
}
