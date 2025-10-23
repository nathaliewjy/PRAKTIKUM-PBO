package views;

import util.CLIUtil;
import views.mahasiswa.MahasiswaView;
import views.staff.DosenView;

public class MenuView {
    private MahasiswaView mahasiswaView;
    private DosenView dosenView;

    public MenuView() {
        this.mahasiswaView = new MahasiswaView();
        this.dosenView =  new DosenView();
    }

    public void render() {
        System.out.println("Menu SIA");
        System.out.println("1. views.mahasiswa");
        System.out.println("2. views.dosen");
        System.out.print("Pilih menu : ");

        this.handleMenuInput();
    }

    private void handleMenuInput() {
        int pilihMenu = CLIUtil.getInt();

        switch (pilihMenu) {
            case 1:
                this.mahasiswaView.render();
                break;
            case 2:
                this.dosenView.render();
        }
    }
}
