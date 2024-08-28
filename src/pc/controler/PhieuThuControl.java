/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.PhieuThuModel;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import pc.controler.ConnectWithDatabase;
/**
 *
 * @author ADmin
 */
public class PhieuThuControl extends ConnectWithDatabase{
    public ArrayList<PhieuThuModel> docPhieuThu(){
        ArrayList<PhieuThuModel> arrpt = new ArrayList<PhieuThuModel>();
        try {
            String sql = "select * from phieuthu";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next())
            {
                PhieuThuModel pt = new PhieuThuModel();
                pt.setMaPT(rs.getString(1));
//                pc.setNgayThu(dateFormat.parse(rs.getString(3)));
                pt.setNgayThu(rs.getDate(3));
                pt.setTong(rs.getBigDecimal(4));
                pt.setMaNV(rs.getString(2));
                arrpt.add(pt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrpt;
    }
    public int themPT(PhieuThuModel pt){
        try {
            String sql="insert into phieuthu values(?,?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, pt.getMaPT());
            pstm.setString(2, pt.getMaNV());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(pt.getNgayThu());
            java.util.Date parsedDate = dateFormat.parse(formattedDate);
            java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());
            pstm.setDate(3, sqlDate);
            pstm.setBigDecimal(4, pt.getTong());
            return pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    public int suaPT(PhieuThuModel pt){
        try {
            String sql="update phieuthu set manv=?, ngaythu=?, tonggiatri=? where mapt=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(4, pt.getMaPT());
            pstm.setString(1, pt.getMaNV());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(pt.getNgayThu());
            java.util.Date parsedDate = dateFormat.parse(formattedDate);
            java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());
            pstm.setDate(2, sqlDate);
            pstm.setBigDecimal(3, pt.getTong());
            return pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    public boolean xoaPT(String maPT){
        try {
            String sql="delete from phieuthu where mapt=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, maPT);
            return pstm.executeUpdate() >0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public ArrayList<PhieuThuModel> timPT(String maPT){
        ArrayList<PhieuThuModel> dspt = new ArrayList<PhieuThuModel>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            String sql ="select * from phieuthu where mapt ='" + maPT + "'";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next())
            {
                PhieuThuModel pt = new PhieuThuModel();
                pt.setMaPT(rs.getString(1));
                pt.setNgayThu(rs.getDate(3));
                pt.setTong(rs.getBigDecimal(4));
                pt.setMaNV(rs.getString(2));
                dspt.add(pt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dspt;
    }
}
