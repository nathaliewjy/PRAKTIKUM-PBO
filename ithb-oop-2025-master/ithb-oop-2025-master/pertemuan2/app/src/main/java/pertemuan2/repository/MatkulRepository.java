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
        String sql = "INSERT INTO matkul (kodeMK, namaMK, SKS) VALUES (?, ?, ?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, mtkl.kodeMK);
            preparedStatement.setString(2, mtkl.namaMK);
            preparedStatement.setInt(3, mtkl.SKS);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ ALL
    public static List<Matkul> getAllMatkul() {
        List<Matkul> result = new ArrayList<>();
        String sql = "SELECT kodeMK, namaMK, SKS FROM matkul";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                result.add(new Matkul(resultSet.getString("kodeMK"), resultSet.getString("namaMK"), resultSet.getInt("SKS")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    // UPDAET
    public static void updateMatkul(Matkul mtkl) {
        String sql = "UPDATE matkul SET namaMK = ? WHERE kodeMK = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, mtkl.kodeMK);
            preparedStatement.setString(2, mtkl.namaMK);
            preparedStatement.setInt(3, mtkl.SKS);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DEELTE
    public static void deleteMatkul(String kodeMK) {
        String sql = "DELETE FROM matkul WHERE kodeMK = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, kodeMK);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
