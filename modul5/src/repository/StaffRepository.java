package repository;

import models.Dosen;

import java.util.ArrayList;
import java.util.List;

public class StaffRepository {
    private static List<Dosen> dsns;

    static {
        dsns = new ArrayList<>();
    }

    public static List<Dosen> findAll() {
        return dsns;
    }

    public static Dosen findByNik(String nik) {
        for (Dosen dsn : dsns) {
            if (dsn.getNik().equals(nik)) {
                return dsn;
            }
        }
        return null;
    }

    public static void addDosen(Dosen dsn) {
        dsns.add(dsn);
    }
}
