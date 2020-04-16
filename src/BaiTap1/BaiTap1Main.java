/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author HaiNguyen
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien("Nguyễn Thanh Hải", 20, "Phú Yên", 50000, 100);
        NhanVien nhanVien2 = new NhanVien("Võ Trung", 21, "Nha Trang", 165000, 250);
        System.out.println(nhanVien1.getThongTin()+"Tiền Thưởng:"+nhanVien1.tinhThuong());
        System.out.println(nhanVien2.getThongTin()+"Tiền Thưởng:"+nhanVien2.tinhThuong());
    }
    
}
