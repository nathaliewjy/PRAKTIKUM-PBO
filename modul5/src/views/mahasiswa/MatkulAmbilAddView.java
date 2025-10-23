package views.mahasiswa;

import controllers.MahasiswaSarjanaController;
import controllers.MatkulAmbilController;
import repository.MahasiswaRepository;
import repository.MatkulAmbilRepository;
import util.CLIUtil;

public class MatkulAmbilAddView {
    private MahasiswaSarjanaController mahasiswaSarjanaController;
    private MahasiswaRepository mahasiswaRepository;
    private MatkulAmbilRepository matkulAmbilRepository;
    private MatkulAmbilController matkulAmbilController;

    public MatkulAmbilAddView() {
        this.mahasiswaSarjanaController = new MahasiswaSarjanaController();
        this.matkulAmbilRepository = new MatkulAmbilRepository();
        this.matkulAmbilController = new MatkulAmbilController();
    }

    public void render() {
        System.out.println("NIM : ");
        String nim = CLIUtil.getString();
        System.out.println("Ambil berapa matkul : ");
        int jumlahMatkul = CLIUtil.getInt();

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Matkul ke-" + i);

            System.out.println("N1 : ");
            int n1 = CLIUtil.getInt();
            System.out.println("N2 : ");
            int n2 = CLIUtil.getInt();
            System.out.println("N3 : ");
            int n3 = CLIUtil.getInt();
            System.out.println("Kode matkul : ");
            String kodeMatkul = CLIUtil.getString();
            System.out.println("Nama matkul : ");
            String namaMatkul = CLIUtil.getString();
            System.out.println("SKS : ");
            int sks = CLIUtil.getInt();

            matkulAmbilController.addMatkulKeMhs(nim, n1, n2, n3, kodeMatkul, namaMatkul, sks);
        }
        System.out.println("yey add");
    }
}
