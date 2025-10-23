package views.staff;

import controllers.DosenController;
import models.DosenHonorer;
import models.DosenTetap;
import util.CLIUtil;

public class DosenView {
    private DosenAddView dosenAddView;
    private DosenListView dosenListView;

    private DosenController dosenController;

    public DosenView() {
        this.dosenAddView = new DosenAddView();
        this.dosenListView = new DosenListView();
        this.dosenController = new DosenController();
    }

    public void render() {
        int pilihMenu = 1;
        while (pilihMenu != 0) {
            System.out.println("Menu Dosen");
            System.out.println("1. Show all dsn");
            System.out.println("2. Add dsn");
            System.out.println("0. Exit");
            System.out.print("Pilih menu : ");
            pilihMenu = CLIUtil.getInt();

            switch (pilihMenu) {
                case 1:
                    dosenListView.renderDsn();
                    break;
                case 2:
                    addDosen();
                    break;
                default:
                    System.out.println("Exit");
            }
        }
    }

    public void addDosen() {
        System.out.println("Add dosen");
        System.out.println("1. Tetap");
        System.out.println("2. Hororer");
        System.out.print("Pilih dosen (1/2) : ");
        int pilihDosen = CLIUtil.getInt();

        String[] dataDsn = dosenAddView.render();

        switch (pilihDosen) {
            case 1:
                System.out.println("Salary : ");
                int salary = CLIUtil.getInt();

                DosenTetap dsnTtp = new DosenTetap(salary, dataDsn[0], dataDsn[1], dataDsn[2], dataDsn[3], dataDsn[4], dataDsn[5], dataDsn[6]);
                dosenController.addDosen(dsnTtp);
                System.out.println("yey add dosen tetap");
                break;
            case 2:
                System.out.println("Honor per sks : ");
                int honorPerSKS = CLIUtil.getInt();

                DosenHonorer dsnHnr = new DosenHonorer(honorPerSKS, dataDsn[0], dataDsn[1], dataDsn[2], dataDsn[3], dataDsn[4], dataDsn[5], dataDsn[6]);
                dosenController.addDosen(dsnHnr);
                System.out.println("yey add dosen tetap");
                break;
        }
    }
}
