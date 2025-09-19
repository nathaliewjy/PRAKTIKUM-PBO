package pertemuan2.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pertemuan2.database.Database;
import pertemuan2.models.Mahasiswa;
import pertemuan2.models.Matkul;

public class MatkulRepository {

    private static final Connection conn;

    static {
        conn = Database.connect();
    }

    // CREATE
    public static void addMatkul(Matkul mtkl) {
        String sql = "INSERT INTO matakuliah (kode_matakuliah, nama, sks) VALUES (?, ?, ?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, mtkl.kode_matakuliah);
            preparedStatement.setString(2, mtkl.nama);
            preparedStatement.setInt(3, mtkl.sks);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ ALL
    public static List<Matkul> getAllMatkul() {
        List<Matkul> result = new ArrayList<>();
        String sql = "SELECT kode_matakuliah, nama, sks FROM matakuliah";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                result.add(new Matkul(resultSet.getString("kode_matakuliah"), resultSet.getString("nama"), resultSet.getInt("sks"), resultSet.getString("kode_jurusan")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    // UPDAET
    public static void updateMatkul(Matkul mtkl) {
        String sql = "UPDATE matakuliah SET nama = ? WHERE kode_matakuliah = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, mtkl.kode_matakuliah);
            preparedStatement.setString(2, mtkl.nama);
            preparedStatement.setInt(3, mtkl.sks);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DEELTE
    public static void deleteMatkul(String kode_matakuliah) {
        String sql = "DELETE FROM matakuliah WHERE kode_matakuliah = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, kode_matakuliah);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
