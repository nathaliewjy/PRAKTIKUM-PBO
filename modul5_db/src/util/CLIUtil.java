package util;

import javax.swing.*;
import java.util.Scanner;

public class CLIUtil {
//    private static Scanner sc;
//
//    static {
//        sc = new Scanner(System.in);
//    }
//
//    public static int getInt() {
//        int input = sc.nextInt();
//        sc.nextLine();
//
//        return input;
//    }
//
//    public static String getString() {
//        return sc.nextLine();
//    }

    public static String getString(String mess) {
        String input = JOptionPane.showInputDialog(null, mess);
        return input;
    }

    public static int getInt(String mess) {
        int input = Integer.parseInt(JOptionPane.showInputDialog(null, mess));
        return input;
    }
}
