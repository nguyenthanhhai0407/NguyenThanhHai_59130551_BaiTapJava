/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;
import BaiTap1.NhanVien;
/**
 *
 * @author HaiNguyen
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IQuanLy qlnv = new QuanLyNhanVien();
        NhanVien nv1 = new NhanVien("Nguyễn Thanh Hải", 21, "Phú Yên", 220000, 210);
        NhanVien nv2 = new NhanVien("Võ Trung", 22, "Nha Trang", 4200000, 140);
        NhanVien nv3 = new NhanVien("Lê Nam", 23, "Khánh Hòa", 250000, 220);
        NhanVien nv4 = new NhanVien("Nguyễn Qúy", 24, "Phú Yên", 560000, 250);
        NhanVien nv5 = new NhanVien("Quang Hải", 25, "Khánh Hòa", 230000, 210);
        qlnv.them(nv1);
        qlnv.them(nv2);
        qlnv.them(nv3);
        qlnv.them(nv4);
        qlnv.them(nv5);
        qlnv.inDS();
    }
    
}
