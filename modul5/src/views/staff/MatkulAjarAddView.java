package views.staff;

import controllers.MatkulAjarController;
import util.CLIUtil;

public class MatkulAjarAddView {
    private MatkulAjarController matkulAjarController;

    public MatkulAjarAddView() {
        this.matkulAjarController = new MatkulAjarController();
    }

    public void render() {
        System.out.println("NIK : ");
        String nik = CLIUtil.getString();
        System.out.println("Ajar berapa matkul : ");
        int jumlahMatkul = CLIUtil.getInt();

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Matkul ke-" + (i+1));

            System.out.println("Kode matkul : ");
            String kodeMatkul = CLIUtil.getString();
            System.out.println("Nama matkul : ");
            String namaMatkul = CLIUtil.getString();
            System.out.println("SKS : ");
            int sks = CLIUtil.getInt();

            matkulAjarController.addMatkulKeDsn(nik, kodeMatkul, namaMatkul, sks);
        }
        System.out.println("yey add mat ajar");
    }
}
