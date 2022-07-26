/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author anhkon
 */
public class SinhVien {
    public int id;
    private String ten_sinh_vien;
    private int diem;
    private int gioi_tinh;
    private String lop;

    public SinhVien() {
    }

    public SinhVien(int id, String ten_sinh_vien, int diem, int gioi_tinh, String lop) {
        this.id = id;
        this.ten_sinh_vien = ten_sinh_vien;
        this.diem = diem;
        this.gioi_tinh = gioi_tinh;
        this.lop = lop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen_sinh_vien() {
        return ten_sinh_vien;
    }

    public void setTen_sinh_vien(String ten_sinh_vien) {
        this.ten_sinh_vien = ten_sinh_vien;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public int getGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(int gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "id=" + id + ", ten_sinh_vien=" + ten_sinh_vien + ", diem=" + diem + ", gioi_tinh=" + gioi_tinh + ", lop=" + lop + '}';
    }
    
}
