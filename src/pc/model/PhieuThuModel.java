/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author ADmin
 */
public class PhieuThuModel {
    private String MaPT;
    private String MaNV;
    private Date NgayThu;
    private BigDecimal Tong;

    public PhieuThuModel() {
    }

    public PhieuThuModel(String MaPT, String MaNV, Date NgayThu, BigDecimal Tong) {
        this.MaPT = MaPT;
        this.MaNV = MaNV;
        this.NgayThu = NgayThu;
        this.Tong = Tong;
    }

    public String getMaPT() {
        return MaPT;
    }

    public String getMaNV() {
        return MaNV;
    }

    public Date getNgayThu() {
        return NgayThu;
    }

    public BigDecimal getTong() {
        return Tong;
    }

    public void setMaPT(String MaPT) {
        this.MaPT = MaPT;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public void setNgayThu(Date NgayThu) {
        this.NgayThu = NgayThu;
    }

    public void setTong(BigDecimal Tong) {
        this.Tong = Tong;
    }

    @Override
    public String toString() {
        return "PhieuThu{" + "MaPT=" + MaPT + ", MaNV=" + MaNV + ", NgayThu=" + NgayThu + ", Tong=" + Tong + '}';
    }
    
}
