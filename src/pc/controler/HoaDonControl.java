/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc.controler;

import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import pc.model.HoaDonModel;
import pc.model.PhieuNhapModel;

/**
 *
 * @author Administrator
 */
public class HoaDonControl extends ConnectWithDatabase{
    public int themHoaDon(HoaDonModel hd) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            String sqlInsert = "insert into HOADON1 values (?,?,?,?,?)";
            PreparedStatement pre = con.prepareStatement(sqlInsert);
            pre.setString(1, hd.getMaHoaDon());
            pre.setString(2, hd.getMaNhanVien());
            pre.setString(3, hd.getMaKhacHang());
            pre.setString(4, dateFormat.format(hd.getNgayThang()));
            pre.setString(5, String.valueOf(hd.getThanhTien()));
            
            return pre.executeUpdate();
        } catch (Exception e) {
        }

        return -1;
    }
}
