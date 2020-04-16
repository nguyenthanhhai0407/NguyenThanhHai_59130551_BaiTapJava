/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

/**
 *
 * @author HaiNguyen
 */
public class BaiTap4Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Khởi tạo
        ChuyenXe cx1 = new XeNoiThanh("1", 100, "1", "Nguyễn Thanh Hải", "78-n288888", 2100000);
        ChuyenXe cx2 = new XeNoiThanh("2", 200, "2", "Võ Trung", "78-n112345", 2340000);
        ChuyenXe cx3 = new XeNoiThanh("3", 300, "3", "Lê Qúy", "78-n311111", 25400000);
        ChuyenXe cx4 = new XeNgoaiThanh("Nghệ An", 4, "004", "Lê Văn Hùnh", "TH1010", 2450000);
        ChuyenXe cx5 = new XeNgoaiThanh("Hà Tỉnh", 2, "005", "Lê Quang Hưởng", "TH33333", 2130000);
        ChuyenXe cx6 = new XeNgoaiThanh("Hà Nội", 3, "006", "", "Trần Cao Thái", 8980000);
        
        // Thêm vào DS
        QuanLyChuyenXe quanlychuyenxe = new QuanLyChuyenXe();
        quanlychuyenxe.themChuyenXe(cx1);
        quanlychuyenxe.themChuyenXe(cx2);
        quanlychuyenxe.themChuyenXe(cx3);
        quanlychuyenxe.themChuyenXe(cx4);
        quanlychuyenxe.themChuyenXe(cx5);
        quanlychuyenxe.themChuyenXe(cx6);
        
        // Xuất DS
        quanlychuyenxe.xuatDS();
        
        // Tính Doanh thu
        System.out.println("Tổng doanh thu xe ngoại thành: "+quanlychuyenxe.tinhDoanhThuNgoaiThanh());
        System.out.println("Tổng doanh thu xe nội thành: "+quanlychuyenxe.tinhDoanhThuNoiThanh());
        System.out.println("Tổng doanh thu cả 2 loại xe: "+(quanlychuyenxe.tinhDoanhThuNoiThanh()+quanlychuyenxe.tinhDoanhThuNgoaiThanh()));
    }
    
}
