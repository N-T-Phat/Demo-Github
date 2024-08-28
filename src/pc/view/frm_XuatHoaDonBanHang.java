/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class frm_XuatHoaDonBanHang extends JFrame{
    private JTable table;
    private DefaultTableModel tableModel;

    public frm_XuatHoaDonBanHang(Object[][] data, String[] columnNames) {
        setTitle("Hóa Đơn Bán Hàng");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        tableModel = new DefaultTableModel(data, columnNames);
        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        Object[][] data = {
            {"Sản phẩm A", 2, 50000, 100000},
            {"Sản phẩm B", 1, 150000, 150000},
            {"Sản phẩm C", 5, 30000, 150000}
        };
        String[] columnNames = {"Tên Hàng", "Số Lượng", "Đơn Giá", "Thành Tiền"};
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                frm_XuatHoaDonBanHang frame = new frm_XuatHoaDonBanHang(data, columnNames);
                frame.setVisible(true);
            }
        });
    }
}
