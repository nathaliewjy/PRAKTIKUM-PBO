package repository;

import models.Dosen;
import models.Staff;
import models.Staff;

import java.util.ArrayList;
import java.util.List;

public class StaffRepository {
    private static List<Staff> stfs;

    static {
        stfs = new ArrayList<>();
    }

    public static List<Staff> findAll() {
        return stfs;
    }

    public static Staff findByNik(String nik) {
        for (Staff stf : stfs) {
            if (stf.getNik().equals(nik)) {
                return stf;
            }
        }
        return null;
    }

    public static void addStaff(Staff stf) {
        stfs.add(stf);
    }

    public static Dosen findByNikDsn(String nik) {
        Staff stf = findByNik(nik);
        if (stf instanceof Dosen) {
            return (Dosen) stf;
        }
        return null;
    }
}
