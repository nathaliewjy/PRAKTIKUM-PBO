package views.staff;

import util.CLIUtil;

public class KaryawanAddView {
    public int render() {
        System.out.println("Salary : ");
        int salary = CLIUtil.getInt();

        return salary;
    }
}
