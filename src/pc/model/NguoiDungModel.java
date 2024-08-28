/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc.model;

/**
 *
 * @author Administrator
 */
public class NguoiDungModel {
    private String manv ;
    private String tenDangNhap ;
    private String matKhau ;

    public NguoiDungModel() {
    }

    public NguoiDungModel(String manv, String tenDangNhap, String matKhau) {
        this.manv = manv;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

   
}
