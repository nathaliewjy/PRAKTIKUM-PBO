package views;

import controllers.UserController;
import models.User;
import util.CLIUtil;

public class UserSearchView {
    private UserController userController;

    public UserSearchView() {
        this.userController = new UserController();
    }

    // 1. Print UserData apabila diberi input nama, tampilkan juga statusnya (mahasiswa, dosen tetap, honorer, karyawan, dst.)
    public void render() {
        String cariNama = CLIUtil.getString("Cari nama : ");

        User user = userController.findByNama(cariNama);

        if (user != null) {
            System.out.println("Data user : " + user.toString());
        } else {
            System.out.println("G ktmu namanya");
        }
    }
}
