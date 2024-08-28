/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.PhieuChiModel;
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
public class PhieuChiControl extends ConnectWithDatabase{
    public ArrayList<PhieuChiModel> docPhieuChi(){
        ArrayList<PhieuChiModel> arrpc = new ArrayList<PhieuChiModel>();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            String sql = "select * from phieuchi";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next())
            {
                PhieuChiModel pc = new PhieuChiModel();
                pc.setMaPC(rs.getString(1));
//                pc.setNgayThu(dateFormat.parse(rs.getString(3)));
                pc.setNgayChi(rs.getDate(3));
                pc.setTong(rs.getBigDecimal(4));
                pc.setMaNV(rs.getString(2));
                arrpc.add(pc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrpc;
    }   
    public ArrayList<PhieuChiModel> timPC(String maPC){
        ArrayList<PhieuChiModel> dspc = new ArrayList<PhieuChiModel>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            String sql ="select * from phieuchi where mapc ='" + maPC + "'";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next())
            {
                PhieuChiModel pc = new PhieuChiModel();
                pc.setMaPC(rs.getString(1));
                pc.setNgayChi(rs.getDate(3));
                pc.setTong(rs.getBigDecimal(4));
                pc.setMaNV(rs.getString(2));
                dspc.add(pc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dspc;
    }
    public int themPC(PhieuChiModel pc){
        try {
            String sql="insert into phieuchi values(?,?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, pc.getMaPC());
            pstm.setString(2, pc.getMaNV());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(pc.getNgayChi());
            java.util.Date parsedDate = dateFormat.parse(formattedDate);
            java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());
            pstm.setDate(3, sqlDate);
            pstm.setBigDecimal(4, pc.getTong());
            return pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    public int suaPC(PhieuChiModel pc){
        try {
            String sql="update phieuchi set manv=?, ngaychi=?, tonggiatri=? where mapc=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(4, pc.getMaPC());
            pstm.setString(1, pc.getMaNV());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(pc.getNgayChi());
            java.util.Date parsedDate = dateFormat.parse(formattedDate);
            java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());
            pstm.setDate(2, sqlDate);
            pstm.setBigDecimal(3, pc.getTong());
            return pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    public boolean xoaPC(String maPC){
        try {
            String sql="delete from phieuchi where mapc=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, maPC);
            return pstm.executeUpdate() >0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
