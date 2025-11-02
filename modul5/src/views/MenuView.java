package views;

import util.CLIUtil;
import views.mahasiswa.MahasiswaView;
import views.staff.StaffView;

public class MenuView {
    private MahasiswaView mahasiswaView;
    private StaffView staffView;
    private UserSearchView userSearchView;
    private NilaiAkhirView nilaiAkhirView;
    private RataNilaiAkhirView rataNilaiAkhirView;
    private MahasiswaGagalView mahasiswaGagalView;
    private MatkulPresensiView matkulPresensiView;
    private DosenNgajarView dosenNgajarView;
    private GajiView gajiView;

    public MenuView() {
        this.mahasiswaView = new MahasiswaView();
        this.staffView =  new StaffView();
        this.userSearchView = new UserSearchView();
        this.nilaiAkhirView = new NilaiAkhirView();
        this.rataNilaiAkhirView = new RataNilaiAkhirView();
        this.mahasiswaGagalView = new MahasiswaGagalView();
        this.matkulPresensiView = new MatkulPresensiView();
        this.dosenNgajarView = new DosenNgajarView();
        this.gajiView = new GajiView();
    }

    public void render() {
        System.out.println("Menu SIA");
        System.out.println("1. views.mahasiswa");
        System.out.println("2. views.staff");
        System.out.println("3. Print UserData apabila diberi input nama (no 1)");
        System.out.println("4. Print Nilai Akhir (NA) untuk seorang mahasiswa apabila diinput NIM dan KodeMK-nya (no 2)");
        System.out.println("5. Print Rata-Rata Nilai Akhir (NR) seluruh mahasiswa apabila diinput KodeMK (no 3)");
        System.out.println("6. Print berapa banyak mahasiswa yang tidak lulus (NA < 56) apabila diinput KodeMK (no 4");
        System.out.println(" 7. Print Matkul Ambil apa saja untuk mahasiswa tertentu (input NIM) beserta total presensinya (no 5)");
        System.out.println("8. Print total berapa jam seorang dosen (input NIK Dosen) masuk kelas dan mengajar (no 6)");
        System.out.println("9. 7. Print gaji seorang staff tertentu dengan ketentuan (no 7)");

        this.handleMenuInput();
    }

    private void handleMenuInput() {
        int pilihMenu = CLIUtil.getInt("Pilih menu : ");

        switch (pilihMenu) {
            case 1:
                this.mahasiswaView.render();
                break;
            case 2:
                this.staffView.render();
                break;
            case 3:
                this.userSearchView.render();
                break;
            case 4:
                this.nilaiAkhirView.render();
                break;
            case 5:
                this.rataNilaiAkhirView.render();
                break;
            case 6:
                this.mahasiswaGagalView.render();
                break;
            case 7:
                this.matkulPresensiView.render();
                break;
            case 8:
                this.dosenNgajarView.render();
                break;
            case 9:
                this.gajiView.render();
                break;
        }
    }
}
