package views;

import controllers.NilaiAkhirController;
import util.CLIUtil;

public class NilaiAkhirView {
    private NilaiAkhirController nilaiAkhirController;

    public NilaiAkhirView() {
        this.nilaiAkhirController = new NilaiAkhirController();
    }

    public void render() {
        String nim = CLIUtil.getString("NIM : ");
        String kodeMatkul = CLIUtil.getString("Kode matkul : ");

        double NA = nilaiAkhirController.hitungNA(nim, kodeMatkul);

        System.out.println("yey ada NA nya segini " + NA);
    }
}
