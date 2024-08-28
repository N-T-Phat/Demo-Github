/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc.controler;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import pc.model.HangModel;

/**
 *
 * @author Administrator
 */
public class HangControl extends ConnectWithDatabase {

    public ArrayList<HangModel> layThongTinHang(String maHang) {
        ArrayList<HangModel> ds = new ArrayList<HangModel>();
        try {
            String sql = "select * from HANG where MaHang = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, maHang);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                HangModel hang = new HangModel();
                hang.setMaHang(rs.getString(1));
                hang.setTenHang(rs.getString(2));
                hang.setDonViTinh(rs.getString(3));
                hang.setSoLuong(Integer.parseInt(rs.getString(4)));
                hang.setDonGia(Double.parseDouble(rs.getString(5)));
                hang.setMaTang(rs.getString(6));
                ds.add(hang);
            }
        } catch (Exception e) {
        }
        return ds;
    }

    public ArrayList<HangModel> layThongTinComBoBoxHang() {
        ArrayList<HangModel> ds = new ArrayList<HangModel>();
        try {
            String sql = "select * from HANG";
            Statement sta = con.createStatement();
            ResultSet rs = sta.executeQuery(sql);
            while (rs.next()) {
                HangModel hang = new HangModel();
                hang.setMaHang(rs.getString(1));
                hang.setTenHang(rs.getString(2));
                hang.setDonViTinh(rs.getString(3));
                
                hang.setSoLuong(rs.getInt(4));
                hang.setDonGia(rs.getDouble(5));
                hang.setMaTang(rs.getString(6));
                ds.add(hang);

            }

        } catch (Exception e) {
        }
        return ds;
    }
//    public void loadComBoBoxMaHang(){
//        DefaultComboBoxModel<HangModel> model = new DefaultComboBoxModel<>(layThongTinComBoBox());
//    }
    public int suaSoLuongHangSauKhiNhapHang(String maHang, int soLuong) {
        try {
            String sql = "update HANG set SoLuong = ? where MaHang = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, soLuong);
            pre.setString(2, maHang);
            return pre.executeUpdate();
        } catch (Exception e) {
        }
        return -1;
    }
      
    
    ////////////Tuan///////////////////
    public ArrayList<HangModel> timThongTinHang(String mahang){
        ArrayList<HangModel> ds = new ArrayList<HangModel>();
        try {
            String sql = "select * from Hang where MaHang = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, mahang);
            ResultSet rs = pre.executeQuery();
            if(rs.next()){
                HangModel hg = new HangModel();
                hg.setMaHang(rs.getString(1));
                hg.setTenHang(rs.getString(2));
                hg.setDonViTinh(rs.getString(3));
                hg.setSoLuong(rs.getInt(4));
                hg.setDonGia(rs.getInt(5));
                hg.setMaTang(rs.getString(6));
                ds.add(hg);
            }
            else
                JOptionPane.showMessageDialog(null, "Không tồn tại hàng!!!");
        } catch (Exception e) {
        }
        return ds;
    }  
    
    public ArrayList<HangModel> timThongTinHang2(String matang){
        ArrayList<HangModel> ds = new ArrayList<HangModel>();
        try {
            String sql = "select * from Hang where MaTang = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, matang);
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
                HangModel hg = new HangModel();
                hg.setMaHang(rs.getString(1));
                hg.setTenHang(rs.getString(2));
                hg.setDonViTinh(rs.getString(3));
                hg.setSoLuong(rs.getInt(4));
                hg.setDonGia(rs.getInt(5));
                hg.setMaTang(rs.getString(6));
                ds.add(hg);
            }
        } catch (Exception e) {
        }
        return ds;
    } 
    
    public int suaThongTinHang(HangModel hg){
        try {
            String sql = "update Hang set TenHang = ? , DonViTinh = ?, SoLuong = ?,"
                    + "DonGia = ?, MaTang = ? where MaHang = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            
            pre.setString(1, hg.getTenHang());
            pre.setString(2, hg.getDonViTinh());
            pre.setString(3, Integer.toString(hg.getSoLuong()));
            pre.setString(4, Double.toString(hg.getDonGia()));
            pre.setString(5, hg.getMaTang());
            pre.setString(6, hg.getMaHang());           
            return pre.executeUpdate();
        } catch (Exception e) {
        }
        return -1;
    }
    
    public int themThongTinHang(HangModel hg){
        try {
            String sql = "INSERT INTO HANG VALUES(?,?,?,?,?,?)";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, hg.getMaHang());
            pre.setString(2, hg.getTenHang());
            pre.setString(3, hg.getDonViTinh());
            pre.setString(4, Integer.toString(hg.getSoLuong()));
            pre.setString(5, Double.toString(hg.getDonGia()));
            pre.setString(6, hg.getMaTang());
            return pre.executeUpdate();
        } catch (Exception e) {
        }
        return -1;
    }
    
    public boolean xoaThongTinHang(String mahang){
        try {
            String sql = "DELETE from Hang Where MaHang = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, mahang);
            return pre.executeUpdate() > 0;
        } catch (Exception e) {
        }
        return false;
    }
    
    public ArrayList<HangModel> docThongTinHang(){
        ArrayList<HangModel> ds = new ArrayList<HangModel>();
        try {
            String sql = "select * from Hang";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
                HangModel hgmodel = new HangModel();
                hgmodel.setMaHang(rs.getString(1));
                hgmodel.setTenHang(rs.getString(2));
                hgmodel.setDonViTinh(rs.getString(3));
                hgmodel.setSoLuong(rs.getInt(4));
                hgmodel.setDonGia(rs.getInt(5));
                hgmodel.setMaTang(rs.getString(6));
                ds.add(hgmodel);
            }
        } catch (Exception e) {
        }
        return ds;
    }
}
