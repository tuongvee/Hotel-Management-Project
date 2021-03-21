/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.miniPop;

import bus.KhachHangBus;
import bus.LoaiKhachHangBUS;
import dto.KhachHangDTO;
import dto.LoaiKhachHangDTO;
import dto.PhieuDatPhongDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tuan
 */
public class HienThiListDanhSachKhachHang_DatPhongJDialog extends javax.swing.JDialog {

    /**
     * Creates new form HienThiListDanhSachKhachHang_ThuePhongJDialog
     */
    ArrayList<KhachHangDTO> listKH;
    DefaultTableModel dtmKH;
    public static KhachHangDTO selectedKhachHang;
    
    private JTextField jtfTimKiem;
    
    public HienThiListDanhSachKhachHang_DatPhongJDialog(JTextField jtfTimKiem){
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        
        this.jtfTimKiem=jtfTimKiem;
        hienThiDanhSachKhachHang();
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
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbtChon = new javax.swing.JButton();
        jbtHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Họ và tên", "Ngày sinh", "CMND", "Giới tính", "Địa chỉ", "Email", "Số điện thoại", "Trạng thái", "Loại khách hàng"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("DANH SÁCH KHÁCH HÀNG");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jbtChon.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtChon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save.png"))); // NOI18N
        jbtChon.setText("Lưu");
        jbtChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtChonActionPerformed(evt);
            }
        });

        jbtHuy.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Huy.png"))); // NOI18N
        jbtHuy.setText("Hủy");
        jbtHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtChon)
                        .addGap(25, 25, 25)
                        .addComponent(jbtHuy)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtChon)
                    .addComponent(jbtHuy))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtHuyActionPerformed
       dispose();
    }//GEN-LAST:event_jbtHuyActionPerformed

    private void jbtChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtChonActionPerformed
        //xuLyChuyenTenLoaiKHThanhMaLoaiKH();
        chuyenThongTinKhachHangDaChonXuongForm();
    }//GEN-LAST:event_jbtChonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        luuThongTinKhiClick1KhachHang();
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtChon;
    private javax.swing.JButton jbtHuy;
    // End of variables declaration//GEN-END:variables

    private void hienThiDanhSachKhachHang(){
        listKH=new ArrayList<>();
        listKH=KhachHangBus.timKiemKhachHangDaRoiDi(jtfTimKiem.getText());
        dtmKH=new DefaultTableModel();
        dtmKH=(DefaultTableModel) jTable1.getModel();
        dtmKH.setRowCount(0);
        for (KhachHangDTO khachHangDTO:listKH){
            Vector<Object> vec=new Vector<Object>();
            vec.add(khachHangDTO.getMaKH());
            vec.add(khachHangDTO.getHoTen());
            vec.add(khachHangDTO.getNgaySinh());
            vec.add(khachHangDTO.getCMND());
            vec.add(khachHangDTO.getGioiTinh());
            vec.add(khachHangDTO.getDiaChi());
            vec.add(khachHangDTO.getEmail());
            vec.add(khachHangDTO.getSDT());
            vec.add(khachHangDTO.getTrangThai());
            vec.add(khachHangDTO.getLoaiKH());
            dtmKH.addRow(vec);
        }
        jTable1.setModel(dtmKH);
    }

    private void luuThongTinKhiClick1KhachHang() {
        selectedKhachHang=new KhachHangDTO();
        int selectedRow=jTable1.getSelectedRow();
        if (selectedRow==-1)
            return;
        selectedKhachHang=listKH.get(selectedRow);
    }
    
        public static KhachHangDTO getSelectedKhachHang() {
        return selectedKhachHang;
    }
        

//    private void xuLyChuyenTenLoaiKHThanhMaLoaiKH() {
//        ArrayList<LoaiKhachHangDTO> listLoaiKhachHang=LoaiKhachHangBUS.layDuLieuLoaiKhachHang();
//        for(LoaiKhachHangDTO loaiKH:listLoaiKhachHang){
//            if (selectedKhachHang.getLoaiKH().equals(loaiKH.getTenLoaiKhachHang())){
//                selectedKhachHang.setMaLoaiKH(loaiKH.getMaLoaiKhachHang());
//            }
//        }
//    }

    private void chuyenThongTinKhachHangDaChonXuongForm() {
        HienThiFormDienThongTinDatPhongJDialog.layThongTinKhachHangDaChonTuDanhSach();
        dispose();
    }
        
}