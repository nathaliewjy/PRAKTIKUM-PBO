package views;

import controllers.DosenController;
import util.CLIUtil;

public class DosenNgajarView {
    private DosenController dosenController;

    public DosenNgajarView() {
        this.dosenController = new DosenController();
    }
    public void render() {
        System.out.println("NIK : ");
        String nik = CLIUtil.getString();

        int totalJam = dosenController.hitungJamNgajar(nik);

        System.out.println("Total jam ngajar : " + totalJam);
    }
}
