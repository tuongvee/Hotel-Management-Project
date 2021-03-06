/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.miniPop;

import bus.ChiTietDichVuBUS;
import dto.ChiTietDichVuDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import newClass.JPanelPhong;

/**
 *
 * @author Tuan
 */
public class ThongTinDichVu_PhongJPanel extends javax.swing.JPanel {

    JPanelPhong selecJPanelPhong;
    ArrayList <ChiTietDichVuDTO> listDichVu;
    DefaultTableModel dtmDichVu;
    public ThongTinDichVu_PhongJPanel(JPanelPhong selectedJPanelPhong) {
        setVisible(true);
        initComponents();
        this.selecJPanelPhong=selectedJPanelPhong;       
        chuyenDuLieuLenForm();
    }

    private void chuyenDuLieuLenForm(){
        dtmDichVu=new DefaultTableModel();
        listDichVu= new ArrayList<>();
        listDichVu=ChiTietDichVuBUS.getChiTietDichVuCuaKhachHang(selecJPanelPhong.getMaHoaDon());
        //JOptionPane.showMessageDialog(null, selecJPanelPhong.getMaPhong());
        dtmDichVu=(DefaultTableModel) jtbDichVu.getModel();
        for (ChiTietDichVuDTO ctdvdto:listDichVu){
            Vector<Object> vec=new Vector<Object>();
            vec.add(ctdvdto.getTenDichVu());
            vec.add(ctdvdto.getSoLuong());
            vec.add(ctdvdto.getThanhTien());
            dtmDichVu.addRow(vec);
        }
        jtbDichVu.setModel(dtmDichVu);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbDichVu = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Th??ng tin chi ti???t d???ch v???"));
        jPanel1.setToolTipText("");

        jtbDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "T??n d???ch v???", "S??? l?????ng", "Th??nh ti???n"
            }
        ));
        jtbDichVu.setColumnSelectionAllowed(true);
        jtbDichVu.setEnabled(false);
        jtbDichVu.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(jtbDichVu);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbDichVu;
    // End of variables declaration//GEN-END:variables
}
