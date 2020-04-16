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
public class ChuyenXe {
    private String MaSoChuyen;
    private String HoTenTX;
    private String SoXe;
    double DoanhThu;
    public ChuyenXe(){
    }
    public ChuyenXe(String MaSoChuyen, String HoTenTX, String SoXe, double DoanhThu) {
        this.MaSoChuyen = MaSoChuyen;
        this.HoTenTX = HoTenTX;
        this.SoXe = SoXe;
        this.DoanhThu = DoanhThu;
    }

    public double getDoanhThu() {
        return DoanhThu;
    }

    public void setDoanhThu(double DoanhThu) {
        this.DoanhThu = DoanhThu;
    }
    public void xuat() {
        System.out.println("Mã số chuyến:"+MaSoChuyen+"\n"+"Họ tên tài xế:"+HoTenTX
                            +"\n"+"Số xe:"+SoXe+"\n"+"Doanh thu:"+DoanhThu);
    }
}
