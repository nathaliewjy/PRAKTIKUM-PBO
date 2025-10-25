package views;

import controllers.NilaiAkhirController;
import util.CLIUtil;

public class RataNilaiAkhirView {
    private NilaiAkhirController nilaiAkhirController;

    public RataNilaiAkhirView() {
        this.nilaiAkhirController = new NilaiAkhirController();
    }

    public void render() {
        System.out.print("Kode matkul : ");
        String kodeMatkul = CLIUtil.getString();

        double rataNA = nilaiAkhirController.hitungRataNA(kodeMatkul);

        System.out.println("yey ada ratarata NA nya segini " + rataNA);
    }
}
