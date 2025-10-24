package views.staff;

import controllers.StaffController;
import models.DosenHonorer;
import models.DosenTetap;
import models.Karyawan;
import util.CLIUtil;

public class StaffView {
    private StaffAddView staffAddView;
    private KaryawanAddView karyawanAddView;
    private StaffListView staffListView;
    private MatkulAjarAddView matkulAjarAddView;
    private PresensiStaffAddView presensiStaffAddView;

    private StaffController staffController;

    public StaffView() {
        this.staffAddView = new StaffAddView();
        this.karyawanAddView = new KaryawanAddView();
        this.staffListView = new StaffListView();
        this.matkulAjarAddView = new MatkulAjarAddView();
        this.presensiStaffAddView = new PresensiStaffAddView();
        this.staffController = new StaffController();
    }

    public void render() {
        int pilihMenu = 1;
        while (pilihMenu != 0) {
            System.out.println("Menu Staff");
            System.out.println("1. Show all stf");
            System.out.println("2. Add stf");
            System.out.println("3. Add matkul ajar");
            System.out.println("4. Add presensi ke matkul");
            System.out.println("0. Exit");
            System.out.print("Pilih menu : ");
            pilihMenu = CLIUtil.getInt();

            switch (pilihMenu) {
                case 1:
                    staffListView.renderStf();
                    break;
                case 2:
                    addStaff();
                    break;
                case 3:
                    matkulAjarAddView.render();
                    break;
                case 4:
                    presensiStaffAddView.render();
                default:
                    System.out.println("Exit");
            }
        }
    }

    public void addStaff() {
        System.out.println("Add staff");
        System.out.println("1. Karyawan");
        System.out.println("2. Dosen");
        System.out.print("Pilih staff : ");
        int pilihStaff = CLIUtil.getInt();

        String[] dataStf = staffAddView.render();

        if (pilihStaff == 1) {
            addKaryawan(dataStf);
        } else if (pilihStaff == 2) {
            addDosen(dataStf);
        } else {
            System.out.println("G valid");
        }
    }

    public void addKaryawan(String[] dataStf) {
        int salary = karyawanAddView.render();
        Karyawan kar = new Karyawan(salary, dataStf[0], dataStf[1], dataStf[2], dataStf[3], dataStf[4], dataStf[5]);
        staffController.addStaff(kar);
        System.out.println("yey add karyawam");
    }

    public void addDosen(String[] dataStf) {
        System.out.println("Add dosen");
        System.out.println("1. Tetap");
        System.out.println("2. Hororer");
        System.out.print("Pilih dosen (1/2) : ");
        int pilihDosen = CLIUtil.getInt();

        System.out.print("Departemen : ");
        String departemen = CLIUtil.getString();

        switch (pilihDosen) {
            case 1:
                System.out.print("Salary : ");
                int salary = CLIUtil.getInt();

                DosenTetap dsnTtp = new DosenTetap(salary, dataStf[0], departemen, dataStf[1], dataStf[2], dataStf[3], dataStf[4], dataStf[5]);
                staffController.addStaff(dsnTtp);
                System.out.println("yey add dosen tetap");
                break;
            case 2:
                System.out.print("Honor per sks : ");
                int honorPerSKS = CLIUtil.getInt();

                DosenHonorer dsnHnr = new DosenHonorer(honorPerSKS, dataStf[0], departemen, dataStf[1], dataStf[2], dataStf[3], dataStf[4], dataStf[5]);
                staffController.addStaff(dsnHnr);
                System.out.println("yey add dosen hororer");
                break;
            default:
                System.out.println("G valid");
        }
    }
}
