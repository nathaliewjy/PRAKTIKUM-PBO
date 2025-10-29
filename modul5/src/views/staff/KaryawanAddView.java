package views.staff;

import util.CLIUtil;

public class KaryawanAddView {
    public int render() {
        int salary = CLIUtil.getInt("Salary : ");

        return salary;
    }
}
