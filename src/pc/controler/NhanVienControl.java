/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc.controler;

import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import pc.model.HangModel;
import pc.model.NhanVienModel;
import pc.view.frm_MeNu;

/**
 *
 * @author Administrator
 */
public class NhanVienControl extends ConnectWithDatabase {

    public ArrayList<NhanVienModel> layThongTinTaiKhoan(String userName) {
        ArrayList<NhanVienModel> ds = new ArrayList<NhanVienModel>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            String sql = "select * from NHANVIEN where MaNV = (select MaNV from NGUOIDUNG where tendangnhap = ?)";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, userName);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                NhanVienModel nv = new NhanVienModel();
                nv.setMaNhanVien(rs.getString(1));
                nv.setTenNhanVien(rs.getString(2));
                nv.setNgaySinh(dateFormat.parse(rs.getString(3)));
                nv.setDiaChi(rs.getString(4));
                nv.setSoDienThoai(rs.getString(5));
                nv.setChucVu(rs.getString(6));
                ds.add(nv);
            }
        } catch (Exception e) {

        }
        return ds;
    }
    
    public ArrayList<NhanVienModel> layThongTinComBoBoxNhanVien() {
        ArrayList<NhanVienModel> ds = new ArrayList<NhanVienModel>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            String sql = "select * from NHANVIEN";
            java.sql.Statement sta = con.createStatement();
            ResultSet rs = sta.executeQuery(sql);
            while (rs.next()) {
                NhanVienModel nv = new NhanVienModel();
                nv.setMaNhanVien(rs.getString(1));
                nv.setTenNhanVien(rs.getString(2));
                nv.setNgaySinh(dateFormat.parse(rs.getString(3)));
                nv.setDiaChi(rs.getString(4));
                nv.setSoDienThoai(rs.getString(5));
                nv.setChucVu(rs.getString(6));
                ds.add(nv);
            }

        } catch (Exception e) {
        }
        return ds;
    }

    public int suaThongTinTaiKhoan(NhanVienModel nv) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            String sql = "update NHANVIEN set TenNV = ? , NgaySinh = ?, DiaChi=?,"
                    + "SDT = ?,ChucVu=? where MaNV = ?";
            PreparedStatement pre = con.prepareStatement(sql);

            pre.setString(1, nv.getTenNhanVien());
            pre.setString(2, dateFormat.format(nv.getNgaySinh()));
            pre.setString(3, nv.getDiaChi());
            pre.setString(4, nv.getSoDienThoai());
            pre.setString(5, nv.getChucVu());
            pre.setString(6, nv.getMaNhanVien());
            return pre.executeUpdate();

        } catch (Exception e) {
        }
        return -1;
    }
    
    public int insertNhanVien(NhanVienModel nv) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            String sql= "insert into NHANVIEN values(?,?,?,?,?,?)";
            PreparedStatement prepStm = con.prepareStatement(sql);
            prepStm.setString(1, nv.getMaNhanVien());
            prepStm.setString(2, nv.getTenNhanVien());
            
            prepStm.setString(3, dateFormat.format(nv.getNgaySinh()));
            prepStm.setString(4, nv.getDiaChi());
            prepStm.setString(5, nv.getSoDienThoai());
            prepStm.setString(6, nv.getChucVu());
            return prepStm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public int updateNhanVien(NhanVienModel nv) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            String sql = "update NHANVIEN set TenNV= ?,NgaySinh=?,DiaChi=?,SDT=?,ChucVu=? WHERE MaNV=?";
            PreparedStatement prepStm = con.prepareStatement(sql);
            
            prepStm.setString(1, nv.getTenNhanVien());
            prepStm.setString(2, dateFormat.format(nv.getNgaySinh()));
            prepStm.setString(3, nv.getDiaChi());
            prepStm.setString(4, nv.getSoDienThoai());
            prepStm.setString(5, nv.getChucVu());
            prepStm.setString(6, nv.getMaNhanVien());
            return prepStm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public boolean deleteNhanVien(String maNV) {
        try {
            String sql = "delete from NHANVIEN where MaNV=?";
            PreparedStatement prepStm = con.prepareStatement(sql);
            prepStm.setString(1,maNV);
            return prepStm.executeUpdate() > 0;

        } catch (Exception e) {
            
            e.printStackTrace();
        }
        return false;
    }
    
}
