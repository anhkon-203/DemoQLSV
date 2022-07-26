/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.SinhVien;
import java.sql.*;
import java.util.ArrayList;

public class SinhVienRepository {

    private DBconnection connection;

    public ArrayList<SinhVien> getListFromDB() {

        ArrayList<SinhVien> lstSinhViens = new ArrayList<>();
        String sql = "SELECT id,ten_sinh_vien,diem,gioi_tinh,lop\n"
                + "	FROM dbo.SINH_VIEN";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setId(rs.getInt(1));
                sv.setTen_sinh_vien(rs.getString(2));
                sv.setDiem(rs.getInt(3));
                sv.setGioi_tinh(rs.getInt(4));
                sv.setLop(rs.getString(5));
                lstSinhViens.add(sv);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lstSinhViens;
    }

    public boolean Them(SinhVien sv) {
        String sql = "INSERT INTO Sinh_Vien( ten_sinh_vien,diem,gioi_tinh,lop)VALUES (?,?,?,?)";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, sv.getTen_sinh_vien());
            ps.setInt(2, sv.getDiem());
            ps.setInt(3, sv.getGioi_tinh());
            ps.setString(4, sv.getLop());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean Xoa(int id) {
        String sql = "	DELETE dbo.SINH_VIEN\n"
                + "	WHERE id = ?";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean Sua(int id, SinhVien sinhVien) {
        String sql = "UPDATE dbo.SINH_VIEN\n"
                + "SET ten_sinh_vien= ?,diem = ?, gioi_tinh =?,lop = ?\n"
                + "WHERE id = ?";
        try ( Connection con = connection.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, sinhVien.getTen_sinh_vien());
            ps.setInt(2, sinhVien.getDiem());
            ps.setInt(3, sinhVien.getGioi_tinh());
            ps.setString(4, sinhVien.getLop());
            ps.setInt(5, id);
             ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }

    public static void main(String[] args) {
        ArrayList<SinhVien> list = new SinhVienRepository().getListFromDB();
        for (SinhVien x : list) {
            System.out.println(x.toString());
        }
    }
}
