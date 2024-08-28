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
public class HoaDonModel {

    private String maHoaDon;
    private String maNhanVien;
    private String maKhacHang;
    private Date ngayThang;
    private double thanhTien;

    public HoaDonModel() {
    }

    public HoaDonModel(String maHoaDon, String maNhanVien, String maKhacHang, Date ngayThang, double thanhTien) {
        this.maHoaDon = maHoaDon;
        this.maNhanVien = maNhanVien;
        this.maKhacHang = maKhacHang;
        this.ngayThang = ngayThang;
        this.thanhTien = thanhTien;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getMaKhacHang() {
        return maKhacHang;
    }

    public void setMaKhacHang(String maKhacHang) {
        this.maKhacHang = maKhacHang;
    }

    public Date getNgayThang() {
        return ngayThang;
    }

    public void setNgayThang(Date ngayThang) {
        this.ngayThang = ngayThang;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    
}
