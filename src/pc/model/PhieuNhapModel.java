/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc.model;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class PhieuNhapModel {

    private String MaPN;
    private String MaNV;
    private Date ngayLap;
    private double tongGiaTri;
    private String MaNCC;

    public PhieuNhapModel() {
    }

    public PhieuNhapModel(String MaPN, String MaNV, Date ngayLap, double tongGiaTri, String MaNCC) {
        this.MaPN = MaPN;
        this.MaNV = MaNV;
        this.ngayLap = ngayLap;
        this.tongGiaTri = tongGiaTri;
        this.MaNCC = MaNCC;
    }

    public String getMaPN() {
        return MaPN;
    }

    public void setMaPN(String MaPN) {
        this.MaPN = MaPN;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public double getTongGiaTri() {
        return tongGiaTri;
    }

    public void setTongGiaTri(double tongGiaTri) {
        this.tongGiaTri = tongGiaTri;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

}
