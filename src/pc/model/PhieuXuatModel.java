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
public class PhieuXuatModel {
    private String maPhieuXuat ;
    private String maNhanVien ;
    private Date ngayXuat;
    private double tongGiaTri;

    public PhieuXuatModel() {
    }

    public PhieuXuatModel(String maPhieuXuat, String maNhanVien, Date ngayXuat, double tongGiaTri) {
        this.maPhieuXuat = maPhieuXuat;
        this.maNhanVien = maNhanVien;
        this.ngayXuat = ngayXuat;
        this.tongGiaTri = tongGiaTri;
    }

    public String getMaPhieuXuat() {
        return maPhieuXuat;
    }

    public void setMaPhieuXuat(String maPhieuXuat) {
        this.maPhieuXuat = maPhieuXuat;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public Date getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(Date ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public double getTongGiaTri() {
        return tongGiaTri;
    }

    public void setTongGiaTri(double tongGiaTri) {
        this.tongGiaTri = tongGiaTri;
    }
    
}
