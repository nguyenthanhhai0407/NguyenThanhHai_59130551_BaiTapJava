/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author HaiNguyen
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinhVienPoly sinhvienpoly = new SinhVienIT(2, 7, 4,"Nguyễn Thanh Hải");
        SinhVienIT sinhvienit = new SinhVienIT(1, 5, 4, "Võ Trung");
        SinhVienBiz sinhvienbiz = new SinhVienBiz(5, 6, "Lê Qúy");
        sinhvienpoly.xuat();
        sinhvienit.xuat();
        sinhvienbiz.xuat();
    }
    
}
