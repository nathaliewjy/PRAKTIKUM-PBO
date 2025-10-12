//package views.mahasiswa;
//
//import util.CLIUtil;
//
//public class MahasiswaView {
//    private MahasiswaAddView mahasiswaAddView;
//
//    public MahasiswaView() {
//        this.mahasiswaAddView = new MahasiswaAddView();
//    }
//
//    public void render() {
//        System.out.println("Menu Mahasiswa");
//        System.out.println("1. Show all mhs");
//        System.out.println("2. Add mhs");
//        System.out.println("3. Edit mhs");
//        System.out.println("4. Delete mhs");
//        System.out.println("0. Exit");
//
//        handleMenuInput();
//    }
//
//    private void handleMenuInput() {
//        int pilihMenu = CLIUtil.getInt();
//
//        switch (pilihMenu) {
//            case 2:
//                mahasiswaAddView.render();
//                break;
//        }
//    }
//}
