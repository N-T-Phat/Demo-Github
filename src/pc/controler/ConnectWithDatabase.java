/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc.controler;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Administrator
 */
public class ConnectWithDatabase {
    protected Connection con = null;

    public ConnectWithDatabase() {
        try {
            String DriverClass, DriverURL;
            String UserName = "sa";
            String PassWord = "123456";
            String DataBaseName = "QuanLySieuThi";
            String ServerName = "21AK22-COM\\SQLEXPRESS";

            String IntegratedSecurity = "IntegratedSecurity=false";
            DriverClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            DriverURL = "jdbc:sqlserver://" + ServerName + ":1433;databaseName=" + DataBaseName + ";user=" + UserName + " ;password=" + PassWord + ";encrypt=false;trustServerCertificate=true";
            Class.forName(DriverClass);
            // this.cnn=DriverManager.getConnection(DriverURL,UserName,PassWord);
            con = DriverManager.getConnection(DriverURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
