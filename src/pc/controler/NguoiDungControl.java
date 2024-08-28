/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc.controler;

import com.sun.jdi.connect.spi.Connection;
import java.io.FileWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import pc.model.NguoiDungModel;

/**
 *
 * @author Administrator
 */
public class NguoiDungControl extends ConnectWithDatabase {

    public NguoiDungModel dangNhap(String userName, String passWord) {
        NguoiDungModel nd = null;
        try {
            String sql = "select * from NGUOIDUNG where tendangnhap = ? and matkhau = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, userName);
            pre.setString(2, passWord);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                nd = new NguoiDungModel();
                nd.setManv(rs.getString(1));
                nd.setTenDangNhap(rs.getString(2));
                nd.setMatKhau(rs.getString(3));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nd;
    }
    
    public void ghiTaiKhoanDangNhap(String userName, String passWord) {
        NguoiDungControl nd = new NguoiDungControl();
        NguoiDungModel ndModel = nd.dangNhap(userName, passWord);
        if(ndModel!= null) {
            try {
                FileWriter fw = new FileWriter("luuTaiKhoan.txt");
                fw.write(userName);
                fw.close();
            } catch (Exception e) {
            }
        }
    }

    public NguoiDungModel doiMatKhau(String tenDangNhap, String matkhauMoi) {
        NguoiDungModel nd = null;
        try {
            String sql = "update NGUOIDUNG SET matkhau = ? where tendangnhap = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, matkhauMoi);
            pre.setString(2, tenDangNhap);
            int rowUpdate = pre.executeUpdate();
            if (rowUpdate > 0) {
                JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Đổi mật khẩu thất bại!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            pre.close();
            con.close();
        } catch (Exception e) {
        }
        return nd;
    }
   
       
}
