/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc.controler;

import java.text.SimpleDateFormat;
import pc.model.PhieuXuatModel;
import java.sql.PreparedStatement;

/**
 *
 * @author Administrator
 */
public class PhieuXuatControl extends ConnectWithDatabase{
    public int themPhieuXuat(PhieuXuatModel px) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            String sqlInsert = "insert into PHIEUXUAT1 values(?,?,?,?)";
            PreparedStatement pre = con.prepareStatement(sqlInsert);
            pre.setString(1,px.getMaPhieuXuat());
            pre.setString(2, px.getMaNhanVien());
            pre.setString(3, dateFormat.format(px.getNgayXuat()));
            pre.setString(4, String.valueOf(px.getTongGiaTri()));
            return pre.executeUpdate();
        } catch (Exception e) {
        }
        return -1;
    }
}
