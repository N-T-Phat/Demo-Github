/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc.controler;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import pc.model.TangModel;

/**
 *
 * @author LENOVO
 */
public class TangControl extends ConnectWithDatabase{
    public ArrayList<TangModel> docThongTinTang(){
        ArrayList<TangModel> ds = new ArrayList<TangModel>();
        try {
            String sql = "select * from Tang";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
                TangModel tgmodel = new TangModel();
                tgmodel.setMaTang(rs.getString(1));
                tgmodel.setTenTang(rs.getString(2));
                ds.add(tgmodel);
            }
        } catch (Exception e) {
        }
        return ds;
    }
    
    public Vector<TangModel> docThongTinTang2(){
        Vector<TangModel> ds = new Vector<TangModel>();
        try {
            String sql = "select * from Tang";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
                TangModel tgmodel = new TangModel();
                tgmodel.setMaTang(rs.getString(1));
                tgmodel.setTenTang(rs.getString(2));
                ds.add(tgmodel);
            }
        } catch (Exception e) {
        }
        return ds;
    }
}
