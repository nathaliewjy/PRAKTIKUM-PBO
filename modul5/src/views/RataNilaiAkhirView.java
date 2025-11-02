package views;

import controllers.NilaiAkhirController;
import util.CLIUtil;

public class RataNilaiAkhirView {
    private NilaiAkhirController nilaiAkhirController;

    public RataNilaiAkhirView() {
        this.nilaiAkhirController = new NilaiAkhirController();
    }

    public void render() {
        String kodeMatkul = CLIUtil.getString("Kode matkul : ");

        double rataNA = nilaiAkhirController.hitungRataNA(kodeMatkul);

        System.out.println("yey ada ratarata NA nya segini " + rataNA);
    }
}
