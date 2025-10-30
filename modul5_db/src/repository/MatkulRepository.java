package repository;

import models.Matkul;
import util.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MatkulRepository {
    public static final Connection conn;

    static {
        conn = Database.connect();
    }

    private static Matkul resultSetMatkul(ResultSet rs) {
        String kodeMatkul = rs.getString("kodeMatkul");
        String namaMatkul = rs.getString("namaMatkul");
        int sks = rs.getInt("sks");

        int minMhs = rs.getInt("minimumMahasiswa");

        return new Matkul(kodeMatkul, namaMatkul, sks, minMhs);
    }

    public static List<Matkul> findAll() {
        List<Matkul> mtkl = new ArrayList<>();

        String sql = "SELECT * FROM matakuliah";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                mtkl.add(resultSetMatkul(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return mtkl;
    }

    public static Matkul findByKode(String kodeMatkul) {
        String sql = "SELECT * FROM matakuliah WHERE kodeMatkul = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                return resultSetMatkul(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
