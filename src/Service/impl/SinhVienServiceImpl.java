/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import Model.SinhVien;
import Repository.SinhVienRepository;
import Service.SinhVienService;
import java.util.ArrayList;

/**
 *
 * @author anhkon
 */
public class SinhVienServiceImpl implements SinhVienService{

        private SinhVienRepository lstRepo = new SinhVienRepository();
        private ArrayList<SinhVien> list;

    public SinhVienServiceImpl() {
        list = new  ArrayList<>();
    }
        
    @Override
    public ArrayList<SinhVien> getList() {
        return lstRepo.getListFromDB();
    }

    @Override
    public boolean Them(SinhVien sinhVien) {
        return lstRepo.Them(sinhVien);
    }

    @Override
    public boolean Sua(int id, SinhVien sinhVien) {
        return lstRepo.Sua(id, sinhVien);
        
    }

    @Override
    public boolean Xoa(int id) {
         return lstRepo.Xoa(id);
    }

 

    @Override
       public ArrayList<SinhVien> timKiem(String ten) {
      ArrayList<SinhVien> listOutPut = new ArrayList<>();
        for (SinhVien sinhVien : lstRepo.getListFromDB()) {
            if (sinhVien.getTen_sinh_vien().contains(ten)) {
                listOutPut.add(sinhVien);
            }
        }
        return listOutPut;
    }


    
}
