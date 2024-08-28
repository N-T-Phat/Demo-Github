/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc.controler;

import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import pc.model.PhieuNhapModel;

/**
 *
 * @author Administrator
 */
public class PhieuNhapControl extends ConnectWithDatabase {

    public int themPhieuNhap(PhieuNhapModel pn) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            String sqlInsert = "insert into PHIEUNHAP1 values (?,?,?,?,?)";
            PreparedStatement pre = con.prepareStatement(sqlInsert);
            pre.setString(1, pn.getMaPN());
            pre.setString(2, pn.getMaNV());
            pre.setString(3, dateFormat.format(pn.getNgayLap()));
            pre.setString(4, String.valueOf(pn.getTongGiaTri()));
            pre.setString(5, pn.getMaNCC());
            return pre.executeUpdate();
        } catch (Exception e) {
        }

        return -1;
    }
}
