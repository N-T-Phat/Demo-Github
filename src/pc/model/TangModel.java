/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc.model;

/**
 *
 * @author LENOVO
 */
public class TangModel {
    private String maTang;
    private String tenTang;

    public TangModel() {
    }

    public TangModel(String maTang, String tenTang) {
        this.maTang = maTang;
        this.tenTang = tenTang;
    }

    public String getMaTang() {
        return maTang;
    }

    public void setMaTang(String maTang) {
        this.maTang = maTang;
    }

    public String getTenTang() {
        return tenTang;
    }

    public void setTenTang(String tenTang) {
        this.tenTang = tenTang;
    }

    @Override
    public String toString() {
        return this.maTang;
    }
}
