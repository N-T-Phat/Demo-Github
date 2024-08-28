/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc.controler;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import pc.model.HangModel;
import pc.model.NCCModel;

/**
 *
 * @author Administrator
 */
public class NCCControl extends ConnectWithDatabase{
     public ArrayList<NCCModel> layThongTinComBoBoxNCC() {
        ArrayList<NCCModel> ds = new ArrayList<NCCModel>();
        try {
            String sql = "select * from NCC";
            Statement sta = con.createStatement();
            ResultSet rs = sta.executeQuery(sql);
            while (rs.next()) {
                NCCModel ncc = new NCCModel();
                ncc.setMaNCC(rs.getString(1));
                ncc.setTenNCC(rs.getString(2));
                ncc.setDiaChi(rs.getString(3));
                ncc.setSoDienThoai(rs.getString(4));
                ds.add(ncc);

            }

        } catch (Exception e) {
        }
        return ds;
    } 
}
