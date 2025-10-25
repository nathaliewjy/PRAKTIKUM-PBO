package views;

import controllers.NilaiAkhirController;
import util.CLIUtil;

public class NilaiAkhirView {
    private NilaiAkhirController nilaiAkhirController;

    public NilaiAkhirView() {
        this.nilaiAkhirController = new NilaiAkhirController();
    }

    public void render() {
        System.out.print("NIM : ");
        String nim = CLIUtil.getString();

        System.out.print("Kode matkul : ");
        String kodeMatkul = CLIUtil.getString();

        double NA = nilaiAkhirController.hitungNA(nim, kodeMatkul);

        System.out.println("yey ada NA nya segini " + NA);
    }
}
