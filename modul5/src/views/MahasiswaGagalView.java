package views;

import controllers.NilaiAkhirController;
import util.CLIUtil;

public class MahasiswaGagalView {
    private NilaiAkhirController nilaiAkhirController;

    public MahasiswaGagalView() {
        this.nilaiAkhirController = new NilaiAkhirController();
    }

    public void render() {
        String kodeMatkul = CLIUtil.getString("Kode matkul : ");

        int[] semua = nilaiAkhirController.hitungMahasiswaGagal(kodeMatkul);
        int semuaMhsGagal = semua[0];
        int semuaMhs = semua[1];

        System.out.println(semuaMhsGagal + " dari " + semuaMhs + " mhs tdk lulus matkul " + kodeMatkul);
    }
}
