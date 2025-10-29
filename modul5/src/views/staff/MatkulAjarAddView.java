package views.staff;

import controllers.MatkulAjarController;
import util.CLIUtil;

public class MatkulAjarAddView {
    private MatkulAjarController matkulAjarController;

    public MatkulAjarAddView() {
        this.matkulAjarController = new MatkulAjarController();
    }

    public void render() {
        String nik = CLIUtil.getString("NIK : ");
        int jumlahMatkul = CLIUtil.getInt("Ajar berapa matkul : ");

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Matkul ke-" + (i+1));

            String kodeMatkul = CLIUtil.getString("Kode matkul : ");
            String namaMatkul = CLIUtil.getString("Nama matkul : ");
            int sks = CLIUtil.getInt("SKS : ");

            matkulAjarController.addMatkulKeDsn(nik, kodeMatkul, namaMatkul, sks);
        }
        System.out.println("yey add mat ajar");
    }
}
