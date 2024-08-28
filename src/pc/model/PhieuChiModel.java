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
public class PhieuChiModel {
    private String MaPC;
    private String MaNV;
    private Date NgayChi;
    private BigDecimal Tong;

    public PhieuChiModel() {
    }

    public PhieuChiModel(String MaPC, String MaNV, Date NgayChi, BigDecimal Tong) {
        this.MaPC = MaPC;
        this.MaNV = MaNV;
        this.NgayChi = NgayChi;
        this.Tong = Tong;
    }

    public String getMaPC() {
        return MaPC;
    }

    public String getMaNV() {
        return MaNV;
    }

    public Date getNgayChi() {
        return NgayChi;
    }

    public BigDecimal getTong() {
        return Tong;
    }

    public void setMaPC(String MaPC) {
        this.MaPC = MaPC;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public void setNgayChi(Date NgayChi) {
        this.NgayChi = NgayChi;
    }

    public void setTong(BigDecimal Tong) {
        this.Tong = Tong;
    }

    @Override
    public String toString() {
        return "PhieuChi{" + "MaPC=" + MaPC + ", MaNV=" + MaNV + ", NgayChi=" + NgayChi + ", Tong=" + Tong + '}';
    }
}
