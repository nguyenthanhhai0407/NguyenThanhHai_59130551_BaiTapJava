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
public abstract class SinhVienPoly {
    private String hoTen;
    private String nganh;
    public abstract double getDiem();
    public String getHocLuc() {     
        if(getDiem()<5) {
            return "Yếu";
        }
        else if((getDiem()>=5) && (getDiem()<6.5)) {
            return "Trung bình";
        }
        else if((getDiem()>=6.5) && (getDiem()<7.5)) {
            return "Khá";
        }
        else if((getDiem()>=7.5) && (getDiem()<9)) {
            return "Giỏi";
        }        
        return "Xuất sắc";
    }

    public SinhVienPoly(){        
    }
    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    /*
    public void xuat() {
        super.xuat(); 
        System.out.println("Họ tên:"+hoTen+"\n"+"Ngành học:"+nganh);
    }*/   
    public void xuat() {       
        System.out.println("Họ tên:"+hoTen+"\n"+"Ngành học:"+nganh);
    }
}
