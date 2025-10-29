package views.mahasiswa;

import controllers.MatkulAmbilController;

import util.CLIUtil;

public class MatkulAmbilAddView {
    private MatkulAmbilController matkulAmbilController;

    public MatkulAmbilAddView() {
        this.matkulAmbilController = new MatkulAmbilController();
    }

    public void render(String nim, String s) {
        int jumlahMatkul = CLIUtil.getInt("Ambil berapa matkul : ");

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Matkul ke-" + (i+1));

            int n1 = CLIUtil.getInt("N1 : ");
            int n2 = CLIUtil.getInt("N2 : ");
            int n3 = CLIUtil.getInt("N3 : ");
            String kodeMatkul = CLIUtil.getString("Kode matkul : ");
            String namaMatkul = CLIUtil.getString("Nama matkul : ");
            int sks = CLIUtil.getInt("SKS : ");

            if (s.equals("S1")) {
                matkulAmbilController.addMatkulKeMhs(nim, n1, n2, n3, kodeMatkul, namaMatkul, sks);
            } else if (s.equals("S2")) {
                matkulAmbilController.addMatkulKeMhsS2(nim,n1, n2, n3, kodeMatkul, namaMatkul, sks);
            }
        }
        System.out.println("yey add mat ambil");
    }
}
