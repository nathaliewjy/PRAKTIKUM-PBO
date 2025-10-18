package views.mahasiswa;

import controllers.MahasiswaSarjanaController;
import repository.MahasiswaRepository;
import util.CLIUtil;

public class MatkulAmbilAddView {
    private MahasiswaSarjanaController mahasiswaSarjanaController;
    private MahasiswaRepository mahasiswaRepository;

    public MatkulAmbilAddView() {
        this.mahasiswaSarjanaController = new MahasiswaSarjanaController();
        this.mahasiswaRepository = new MahasiswaRepository();
    }

    public void render() {
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

            mahasiswaRepository.(new );


        }
    }
}
