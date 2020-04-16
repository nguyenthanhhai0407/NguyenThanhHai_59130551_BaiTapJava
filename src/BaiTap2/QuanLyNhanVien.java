/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;
import BaiTap1.NhanVien;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HaiNguyen
 */
public class QuanLyNhanVien implements IQuanLy{
    List<NhanVien> dsNhanVien = new ArrayList<>();

    @Override
    public void them(NhanVien nv) {
        dsNhanVien.add(nv);
    }

    @Override
    public void inDS() {
        for(NhanVien nhanVien: dsNhanVien) {
            System.out.println(nhanVien.getThongTin());
        }
    }
}
