package views;

import util.CLIUtil;
import views.mahasiswa.MahasiswaView;

public class MenuView {
    private MahasiswaView mahasiswaView;

    public MenuView() {
        this.mahasiswaView = new MahasiswaView();
    }

    public void render() {
        System.out.println("Menu SIA");
        System.out.println("1. Menu views.mahasiswa");

        this.handleMenuInput();
    }

    private void handleMenuInput() {
        int pilihMenu = CLIUtil.getInt();

        switch (pilihMenu) {
            case 1:
                this.mahasiswaView.render();
                break;
        }
    }
}
