/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.SinhVien;
import java.util.ArrayList;

/**
 *
 * @author anhkon
 */
public interface SinhVienService {

    public ArrayList<SinhVien> getList();

    public boolean Them(SinhVien sinhVien);

    public boolean Sua(int id, SinhVien sinhVien);

    public boolean Xoa(int id);

    public ArrayList<SinhVien> timKiem(String ten);

}
