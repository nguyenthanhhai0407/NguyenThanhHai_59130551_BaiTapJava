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
public class SinhVienIT extends SinhVienPoly{
    private double diemJava;
    private double diemCss;
    private double diemHtml;
    public SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoTen) {
        super(hoTen, "IT");
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }


    @Override
    public double getDiem() {
        return (2*diemJava+diemHtml+diemCss)/4;
    }
    @Override
    public void xuat() {
        super.xuat(); 
        System.out.println("Điểm:"+getDiem()+"\n"+"Học lực:"+ super.getHocLuc()+"\n");
    }  
}
