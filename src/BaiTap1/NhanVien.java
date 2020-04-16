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
public class NhanVien {
    private String Ten;
    private int Tuoi;
    private String Diachi;
    private double Tienluong;
    private int Tongsogiolam;
    public String getThongTin() {
        return "Tên:"+Ten+"\n"+"Tuổi:"+Tuoi+"\n"+"Địa chỉ:"+Diachi+
                "\n"+"Tiền lương:"+Tienluong+"\n"+"Tổng số giờ làm:"+Tongsogiolam+"\n";
    }
    public double tinhThuong() {
        if(Tongsogiolam>=200) {
            return Tienluong*0.2;
        }
        else if(Tongsogiolam<200 && Tongsogiolam>=100){
            return Tienluong*0.1;
        }
        else if(Tongsogiolam<100) {
            return 0;
        }
        return 0;
    }
    public NhanVien() {
    }
    public NhanVien(String Ten, int Tuoi, String Diachi, double Tienluong, int Tongsogiolam) {
        this.Ten = Ten;
        this.Tuoi = Tuoi;
        this.Diachi = Diachi;
        this.Tienluong = Tienluong;
        this.Tongsogiolam = Tongsogiolam;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public double getTienluong() {
        return Tienluong;
    }

    public void setTienluong(double Tienluong) {
        this.Tienluong = Tienluong;
    }

    public int getTongsogiolam() {
        return Tongsogiolam;
    }

    public void setTongsogiolam(int Tongsogiolam) {
        this.Tongsogiolam = Tongsogiolam;
    }
}
