/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc.controler;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import pc.model.KhachHangModel;
import pc.model.NhanVienModel;

/**
 *
 * @author Administrator
 */
public class KhachHangControl extends ConnectWithDatabase {

    public ArrayList<KhachHangModel> layThongTinComBoBoxKhachHang() {
        ArrayList<KhachHangModel> ds = new ArrayList<KhachHangModel>();

        try {
            String sql = "select * from KHACHHANG";
            java.sql.Statement sta = con.createStatement();
            ResultSet rs = sta.executeQuery(sql);
            while (rs.next()) {
                KhachHangModel kh = new KhachHangModel();
                kh.setMaKhachHang(rs.getString(1));
                kh.setTenKhachHang(rs.getString(2));
                kh.setSoDienThoai(rs.getString(3));
                kh.setDiaChi(rs.getString(4));

                ds.add(kh);
            }

        } catch (Exception e) {
        }
        return ds;
    }

    public int insertKhachHang(KhachHangModel kh) {
        try {
            String sql = "insert into KHACHHANG values(?,?,?,?)";
            PreparedStatement prepStm = con.prepareStatement(sql);
            prepStm.setString(1, kh.getMaKhachHang());
            prepStm.setString(2, kh.getTenKhachHang());
            prepStm.setString(3, kh.getSoDienThoai());
            prepStm.setString(4, kh.getDiaChi());
            return prepStm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int updateKhachhang(KhachHangModel kh) {
        try {
            String sql = "update KHACHHANG set TenKH = ?, SDT = ?, DiaChi = ? where MaKH = ?";
            PreparedStatement prepStm = con.prepareStatement(sql);
            prepStm.setString(1, kh.getTenKhachHang()); // Tham số 1 là TenKH
            prepStm.setString(2, kh.getSoDienThoai());    // Tham số 2 là SDT
            prepStm.setString(3, kh.getDiaChi()); // Tham số 3 là DiaChi
            prepStm.setString(4, kh.getMaKhachHang());   // Tham số 4 là MaKH
            return prepStm.executeUpdate();

        } catch (Exception e) {
            //e.printStackTrace();
        }
        return -1;
    }
    
    public boolean deleteKhachHang(String MaKH) {
        try {
            String sql = "delete from KHACHHANG where MaKH = ?";
            PreparedStatement prep = con.prepareStatement(sql);
            prep.setString(1,MaKH);
            
            return prep.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
