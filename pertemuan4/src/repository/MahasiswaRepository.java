//package repository;
//
//import util.Database;
//import models.Mahasiswa;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class MahasiswaRepository {
//    public void add(String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
//        Connection conn = Database.connect();
//        String sql = "INSERT INTO mahasiswa (nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon) VALUES (?, ?, ?, ?, ?, ?, ?)";
//
//        try {
//            PreparedStatement preparedStatement = conn.prepareStatement(sql);
//            preparedStatement.setString(1, nim);
//            preparedStatement.setString(2, kodeJurusan);
//            preparedStatement.setString(3, nama);
//            preparedStatement.setString(4, alamat);
//            preparedStatement.setString(5, tempatLahir);
//            preparedStatement.setString(6, tanggalLahir);
//            preparedStatement.setString(7, telepon);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
