/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import controller.DAO;
import model.hoaDon;
import model.ngayThang;
import model.nguyenLieu;
import model.thucDon;
import model.CTTD;
import model.CTHD;
import model.QUAYCAFE;
import java.awt.Font;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author nghia
 */
public class NhanVien extends javax.swing.JFrame {
    
    private Connection conn;
    private ArrayList<hoaDon> dshd;
    private ArrayList<nguyenLieu> dsnl;
    private ArrayList<thucDon> dstd;
    private ArrayList<thucDon> dstddk;
    private ArrayList<CTTD> cttd;
    private ArrayList<CTHD> dscthd;
    private ArrayList<QUAYCAFE> dsquaycafe;
    DefaultTableModel model;
    
    
    
    public NhanVien() {
        initComponents();  
        
        dsnl = new DAO().getListNL();
        dstd = new DAO().getListTD();             
        dscthd = new ArrayList<>();
        dshd = new ArrayList<>();
        dsquaycafe = new DAO().getListQUAYCAFE();
        showTableNguyenLieu();
        showTableThucDon();
        showComboTENDOUONGData();
        showComboMAQUAY();
        overRide();      
        long millis=System.currentTimeMillis();   
        java.sql.Date date=new java.sql.Date(millis);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = dateFormat.format(date);  
        txtNGAYLAP.setText(strDate);
        
        //------------
        
        
    }
    
    
    public void showTableThucDon() {
        int i = 1;
        model = (DefaultTableModel) tableThucDon.getModel();
        for(thucDon td : dstd){
            model.addRow(new Object[]{
            i++, td.getTENDOUONG(), td.getGIATIEN()
        });
        }
    }
    
    
    public void showComboTENDOUONGData(){      
        for(thucDon td : dstd){
            comboTenDoUong.addItem(td.getTENDOUONG());
            comboTENDOUONG.addItem(td.getTENDOUONG());
        }
    }
    
    public void showComboMAQUAY(){       
        for(QUAYCAFE quaycafe : dsquaycafe){
            comboMAQUAY.addItem(Integer.toString(quaycafe.getMAQUAY()));
        }
    }
        
        
    public void showTableDSHD() {
        for(hoaDon hd : dshd){
            model.addRow(new Object[]{
            hd.getMAHD(), hd.getNGAYTAO(), hd.getMANV(), hd.getMAQUAY()
        });
        }
    }
    
    public void showTableNguyenLieu() {
        model = (DefaultTableModel) tableNguyenLieu.getModel();
        for(nguyenLieu nl : dsnl){
            model.addRow(new Object[]{
            nl.getMANL(), nl.getTENNGUYENLIEU(), nl.getDVT()
        });
        }
    }
    
    private void overRide(){
        this.setLocationRelativeTo(null);
        textTienLuong.setEditable(false);
        tableLapHoaDon.getTableHeader().setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        tableCTTD.getTableHeader().setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        tableDSHD.getTableHeader().setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        tableNguyenLieu.getTableHeader().setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        tableThucDon.getTableHeader().setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane4 = new javax.swing.JScrollPane();
        jFrame1 = new javax.swing.JFrame();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        tabLapHoaDon = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        comboMAQUAY = new javax.swing.JComboBox<>();
        LuuButton = new javax.swing.JButton();
        ThemButton = new javax.swing.JButton();
        XoaButton = new javax.swing.JButton();
        label1 = new java.awt.Label();
        SuaButton = new javax.swing.JButton();
        huyButton = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtMAHD = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtNGAYLAP = new javax.swing.JTextField();
        jPanel42 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        comboTENDOUONG = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        spinnerSoLuong = new javax.swing.JSpinner();
        jLabel25 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        jPanel40 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        labelTongTien = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        txtTienKhachDua = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        labelTienTraLai = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tableLapHoaDon = new javax.swing.JTable();
        tabHoaDonDaLap = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        txtTUNGAY = new java.awt.TextField();
        txtDENNGAY = new java.awt.TextField();
        jPanel36 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableDSHD = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textTienLuong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tabThonTinThucDon = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        tableCTTD = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        comboTenDoUong = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableThucDon = new javax.swing.JTable();
        tabNguyenLieu = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableNguyenLieu = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        tabLapHoaDon.setLayout(new java.awt.BorderLayout());

        jPanel37.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        comboMAQUAY.setMinimumSize(new java.awt.Dimension(63, 25));
        comboMAQUAY.setPreferredSize(new java.awt.Dimension(63, 30));
        comboMAQUAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMAQUAYActionPerformed(evt);
            }
        });

        LuuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/floppy-disk-16.png"))); // NOI18N
        LuuButton.setText("Lưu");
        LuuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuuButtonActionPerformed(evt);
            }
        });

        ThemButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add-to-cart-16.png"))); // NOI18N
        ThemButton.setText("Thêm");
        ThemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemButtonActionPerformed(evt);
            }
        });

        XoaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-16.png"))); // NOI18N
        XoaButton.setText("Xóa");
        XoaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaButtonActionPerformed(evt);
            }
        });

        label1.setName("Quầy"); // NOI18N
        label1.setText("Quầy");

        SuaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh-16.png"))); // NOI18N
        SuaButton.setText("Sửa");
        SuaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaButtonActionPerformed(evt);
            }
        });

        huyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel-16.png"))); // NOI18N
        huyButton.setText("Hủy");
        huyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(9, 14, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboMAQUAY, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SuaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(XoaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LuuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(huyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboMAQUAY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(huyButton)
                .addGap(18, 18, 18)
                .addComponent(SuaButton)
                .addGap(18, 18, 18)
                .addComponent(XoaButton)
                .addGap(18, 18, 18)
                .addComponent(ThemButton)
                .addGap(18, 18, 18)
                .addComponent(LuuButton)
                .addContainerGap())
        );

        tabLapHoaDon.add(jPanel37, java.awt.BorderLayout.LINE_END);

        jPanel38.setLayout(new javax.swing.BoxLayout(jPanel38, javax.swing.BoxLayout.Y_AXIS));

        jPanel39.setMaximumSize(new java.awt.Dimension(2147483647, 120));
        jPanel39.setPreferredSize(new java.awt.Dimension(690, 120));
        jPanel39.setLayout(new javax.swing.BoxLayout(jPanel39, javax.swing.BoxLayout.X_AXIS));

        jPanel41.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hóa Đơn", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel41.setPreferredSize(new java.awt.Dimension(300, 190));

        jLabel20.setText("Mã Hóa Đơn");
        jLabel20.setPreferredSize(new java.awt.Dimension(100, 25));

        txtMAHD.setMinimumSize(new java.awt.Dimension(50, 20));
        txtMAHD.setPreferredSize(new java.awt.Dimension(100, 25));
        txtMAHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMAHDActionPerformed(evt);
            }
        });

        jLabel21.setText("Ngày Lập");
        jLabel21.setPreferredSize(new java.awt.Dimension(100, 25));

        txtNGAYLAP.setEditable(false);
        txtNGAYLAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNGAYLAPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMAHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNGAYLAP))
                .addGap(65, 65, 65))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMAHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNGAYLAP))
                .addGap(3, 3, 3))
        );

        jPanel39.add(jPanel41);

        jPanel42.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi Tiết", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 204))); // NOI18N
        jPanel42.setPreferredSize(new java.awt.Dimension(330, 190));

        jLabel23.setText("Tên Đồ Uống");

        comboTENDOUONG.setFocusTraversalPolicyProvider(true);
        comboTENDOUONG.setPreferredSize(new java.awt.Dimension(150, 24));
        comboTENDOUONG.setVerifyInputWhenFocusTarget(false);
        comboTENDOUONG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTENDOUONGActionPerformed(evt);
            }
        });

        jLabel24.setText("Số Lượng");

        spinnerSoLuong.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spinnerSoLuong.setMinimumSize(new java.awt.Dimension(50, 20));
        spinnerSoLuong.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel25.setText("Giá");

        txtGia.setEditable(false);
        txtGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spinnerSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboTENDOUONG, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtGia, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(comboTENDOUONG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(spinnerSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel39.add(jPanel42);

        jPanel38.add(jPanel39);

        jPanel40.setPreferredSize(new java.awt.Dimension(702, 250));
        jPanel40.setLayout(new javax.swing.BoxLayout(jPanel40, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel61.setMaximumSize(new java.awt.Dimension(2147483647, 50));
        jPanel61.setMinimumSize(new java.awt.Dimension(344, 30));
        jPanel61.setPreferredSize(new java.awt.Dimension(702, 30));
        jPanel61.setLayout(new java.awt.GridBagLayout());

        jLabel46.setForeground(new java.awt.Color(255, 0, 0));
        jLabel46.setText("Tổng Tiền: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel61.add(jLabel46, gridBagConstraints);

        labelTongTien.setText("5,000,000");
        labelTongTien.setPreferredSize(new java.awt.Dimension(80, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel61.add(labelTongTien, gridBagConstraints);

        jLabel48.setForeground(new java.awt.Color(255, 0, 0));
        jLabel48.setText("Tiền Khách Đưa: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel61.add(jLabel48, gridBagConstraints);

        txtTienKhachDua.setText("5,000,000");
        txtTienKhachDua.setMinimumSize(new java.awt.Dimension(60, 20));
        txtTienKhachDua.setPreferredSize(new java.awt.Dimension(80, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        jPanel61.add(txtTienKhachDua, gridBagConstraints);

        jLabel49.setForeground(new java.awt.Color(255, 0, 0));
        jLabel49.setText("Tiền Trả Lại: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        jPanel61.add(jLabel49, gridBagConstraints);

        labelTienTraLai.setText("2,000,000");
        labelTienTraLai.setPreferredSize(new java.awt.Dimension(80, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        jPanel61.add(labelTienTraLai, gridBagConstraints);

        jPanel40.add(jPanel61);

        tableLapHoaDon.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tableLapHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã thực đơn", "Số lượng", "Thành tiền"
            }
        ));
        tableLapHoaDon.setRowHeight(18);
        tableLapHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableLapHoaDonMouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(tableLapHoaDon);

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );

        jPanel40.add(jPanel62);

        jPanel38.add(jPanel40);

        tabLapHoaDon.add(jPanel38, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Lập Hóa Đơn", tabLapHoaDon);

        tabHoaDonDaLap.setLayout(new java.awt.BorderLayout());

        jPanel35.setMinimumSize(new java.awt.Dimension(100, 50));
        jPanel35.setPreferredSize(new java.awt.Dimension(810, 50));

        jLabel18.setText("Từ Ngày");
        jLabel18.setPreferredSize(new java.awt.Dimension(60, 26));

        jLabel19.setText("Đến Ngày");
        jLabel19.setMaximumSize(new java.awt.Dimension(1000, 222));
        jLabel19.setMinimumSize(new java.awt.Dimension(100, 26));
        jLabel19.setPreferredSize(new java.awt.Dimension(60, 26));

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/magnifying-glass-16.png"))); // NOI18N
        jButton18.setText("Tìm Kiếm");
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton18MouseClicked(evt);
            }
        });
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        txtTUNGAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTUNGAYActionPerformed(evt);
            }
        });

        txtDENNGAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDENNGAYActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTUNGAY, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtDENNGAY, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton18)
                .addGap(222, 222, 222))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtDENNGAY, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel35Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTUNGAY, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel35Layout.createSequentialGroup()
                                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton18))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(12, 12, 12))
        );

        tabHoaDonDaLap.add(jPanel35, java.awt.BorderLayout.PAGE_START);

        jPanel36.setLayout(new java.awt.BorderLayout());

        tableDSHD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tableDSHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hóa Đơn", "Ngày Lập", "Mã Nhân Viên", "Mã Quầy", "Mã Thực Đơn", "Số Lượng Ly"
            }
        ));
        tableDSHD.setEnabled(false);
        tableDSHD.setRowHeight(18);
        jScrollPane5.setViewportView(tableDSHD);

        jPanel36.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        jPanel3.setPreferredSize(new java.awt.Dimension(754, 40));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Tiền Lương");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel3.add(jLabel2, gridBagConstraints);

        textTienLuong.setText("5,000,000");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel3.add(textTienLuong, gridBagConstraints);

        jLabel3.setText("VNĐ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel3.add(jLabel3, gridBagConstraints);

        jPanel36.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        tabHoaDonDaLap.add(jPanel36, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Hóa Đơn Đã Lập", tabHoaDonDaLap);

        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.Y_AXIS));

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setMaximumSize(new java.awt.Dimension(2147483647, 2000));
        jPanel10.setMinimumSize(new java.awt.Dimension(54, 200));
        jPanel10.setPreferredSize(new java.awt.Dimension(758, 200));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setMaximumSize(new java.awt.Dimension(32767, 100));
        jPanel11.setMinimumSize(new java.awt.Dimension(50, 50));
        jPanel11.setPreferredSize(new java.awt.Dimension(754, 100));

        tableCTTD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tableCTTD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên Đồ Uống", "Mã Nguyên Liệu", "Tên Nguyên Liệu", "Đơn Vị Tính", "Số Lượng Cần"
            }
        ));
        tableCTTD.setEnabled(false);
        tableCTTD.setRowHeight(18);
        jScrollPane16.setViewportView(tableCTTD);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel12.setMinimumSize(new java.awt.Dimension(50, 50));
        jPanel12.setPreferredSize(new java.awt.Dimension(754, 50));

        jLabel59.setText("Tên Đồ Uống");
        jPanel12.add(jLabel59);

        comboTenDoUong.setPreferredSize(new java.awt.Dimension(200, 28));
        comboTenDoUong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTenDoUongActionPerformed(evt);
            }
        });
        jPanel12.add(comboTenDoUong);

        jPanel10.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel9.add(jPanel10);

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.setMaximumSize(new java.awt.Dimension(32767, 2000));
        jPanel13.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel13.setPreferredSize(new java.awt.Dimension(758, 170));

        tableThucDon.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tableThucDon.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tableThucDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên Đồ Uống", "Giá Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableThucDon.setEnabled(false);
        tableThucDon.setRowHeight(18);
        jScrollPane1.setViewportView(tableThucDon);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel13);

        jScrollPane3.setViewportView(jPanel9);

        javax.swing.GroupLayout tabThonTinThucDonLayout = new javax.swing.GroupLayout(tabThonTinThucDon);
        tabThonTinThucDon.setLayout(tabThonTinThucDonLayout);
        tabThonTinThucDonLayout.setHorizontalGroup(
            tabThonTinThucDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabThonTinThucDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabThonTinThucDonLayout.setVerticalGroup(
            tabThonTinThucDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabThonTinThucDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Thông Tin Thực Đơn", tabThonTinThucDon);

        tableNguyenLieu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tableNguyenLieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Nguyên Liệu", "Tên Nguyên Liệu", "Đơn Vị Tính"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableNguyenLieu.setEnabled(false);
        tableNguyenLieu.setFocusable(false);
        tableNguyenLieu.setOpaque(false);
        tableNguyenLieu.setRequestFocusEnabled(false);
        tableNguyenLieu.setRowHeight(18);
        tableNguyenLieu.setSurrendersFocusOnKeystroke(true);
        tableNguyenLieu.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(tableNguyenLieu);

        javax.swing.GroupLayout tabNguyenLieuLayout = new javax.swing.GroupLayout(tabNguyenLieu);
        tabNguyenLieu.setLayout(tabNguyenLieuLayout);
        tabNguyenLieuLayout.setHorizontalGroup(
            tabNguyenLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabNguyenLieuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabNguyenLieuLayout.setVerticalGroup(
            tabNguyenLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabNguyenLieuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Thông Tin Nguyên Liệu", tabNguyenLieu);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setPreferredSize(new java.awt.Dimension(58, 30));

        jMenu1.setText("Nhân Viên");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Thông Tin");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Đăng Xuất");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Đổi mật khẩu");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Quản Lý");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.out.println("action perform");
        ThongTinNhanVien t=new ThongTinNhanVien();
        t.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        t.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:     
        /*System.out.println("gọi form");
        formThongTinQL f = new formThongTinQL();
        f.nhanVien();
        f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f.setVisible(true);*/
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        /*this.dispose();
        DangNhap d=new DangNhap();
        d.setLocationRelativeTo(this);
        d.setVisible(true);*/
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtMAHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMAHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMAHDActionPerformed

    private void ThemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemButtonActionPerformed
        CTHD cthd = new CTHD();
        thucDon tddk = new thucDon();
        tddk = new DAO().findListTDwith((String)comboTENDOUONG.getSelectedItem());
        System.out.println(tddk.getGIATIEN());
        cthd.setMAHD(txtMAHD.getText());
        cthd.setMATD(tddk.getMATD());
        cthd.setSOLUONG_LY((int)spinnerSoLuong.getValue());  
        cthd.setGIATIEN(tddk.getGIATIEN()*cthd.getSOLUONG_LY());
        dscthd.add(cthd); 
        ((DefaultTableModel) tableLapHoaDon.getModel()).setRowCount(0);
        showTableCTHD();
    }//GEN-LAST:event_ThemButtonActionPerformed
    
    private void LuuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuuButtonActionPerformed
        //Them hoaDon
        hoaDon hd = new hoaDon();
        hd.setMAHD(txtMAHD.getText());
        try{
            hd.setNGAYTAO(new SimpleDateFormat("dd/MM/yyyy").parse(txtNGAYLAP.getText()));
        } catch(ParseException ex){
            ex.printStackTrace();
        }
        hd.setMANV("100");
        int selectedQuay = Integer.parseInt((String)comboMAQUAY.getSelectedItem());
        hd.setMAQUAY(selectedQuay);
        if (new DAO().addhoaDon(hd)) {
            JOptionPane.showMessageDialog(rootPane, "Them hoa don thanh cong!");
            dshd.add(hd);
        } else{
            JOptionPane.showMessageDialog(rootPane, "Khong the them vi trung MAHD! ");     
        }   
        //Them CTHD
        /*CTHD cthd = new CTHD();
        cthd.setMAHD(txtMAHD.getText());
        cthd.setMATD(comboTENDOUONG.getSelectedIndex());
        cthd.setSOLUONG_LY((int)spinnerSoLuong.getValue());*/
        addCTHD();
    }//GEN-LAST:event_LuuButtonActionPerformed
    
    public void addCTHD(){
        for (CTHD cthd : dscthd) {
            new DAO().addCTHD(cthd);
        }     
    }
    public void showTableCTHD() {
        model = (DefaultTableModel) tableLapHoaDon.getModel();
        for(CTHD cthd : dscthd){
            model.addRow(new Object[]{
            cthd.getMATD(), cthd.getSOLUONG_LY(), cthd.getGIATIEN()
        });
        }
        
    }
    private void txtNGAYLAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNGAYLAPActionPerformed
        // TODO add your handling code here:
        long millis=System.currentTimeMillis();   java.sql.Date date=new java.sql.Date(millis);
    }//GEN-LAST:event_txtNGAYLAPActionPerformed

    private void comboTenDoUongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTenDoUongActionPerformed
        // TODO add your handling code here:
        String selectedItem = (String) comboTenDoUong.getSelectedItem();
        ((DefaultTableModel) tableCTTD.getModel()).setRowCount(0);
        model = (DefaultTableModel) tableCTTD.getModel(); 
        cttd = new DAO().findListTD(selectedItem);
        showTableCTTD();
    }//GEN-LAST:event_comboTenDoUongActionPerformed
    
    public void showTableCTTD() {
        for(CTTD chitiet : cttd){
            model.addRow(new Object[]{
            chitiet.getTENDOUONG(), chitiet.getMANL(), chitiet.getSOLUONG_CAN(), chitiet.getTENNGUYENLIEU(), chitiet.getDVT()
        });
        }
    }
    
    
        
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        dshd = new DAO().getListHD(txtTUNGAY.getText(), txtDENNGAY.getText());
        //in tim kiem
        ((DefaultTableModel) tableDSHD.getModel()).setRowCount(0);
        model = (DefaultTableModel) tableDSHD.getModel(); 
        showTableDSHD();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jButton18MouseClicked

    private void tableLapHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableLapHoaDonMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tableLapHoaDonMouseClicked

    private void comboMAQUAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMAQUAYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMAQUAYActionPerformed

    private void comboTENDOUONGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTENDOUONGActionPerformed
        // TODO add your handling code here:
        thucDon tddk = new thucDon();
        tddk = new DAO().findListTDwith((String)comboTENDOUONG.getSelectedItem());
        txtGia.setText(Integer.toString(tddk.getGIATIEN()));
    }//GEN-LAST:event_comboTENDOUONGActionPerformed

    private void txtDENNGAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDENNGAYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDENNGAYActionPerformed

    private void txtTUNGAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTUNGAYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTUNGAYActionPerformed

    private void XoaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaButtonActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) tableLapHoaDon.getModel();
        int i = tableLapHoaDon.getSelectedRow();
        if ( i >= 0) {
            model.removeRow(i);
        }
        else{
            System.out.println("Delete Error!");
        }
    }//GEN-LAST:event_XoaButtonActionPerformed

    private void SuaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaButtonActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) tableLapHoaDon.getModel();
        int i = tableLapHoaDon.getSelectedRow();
        if ( i >= 0) {
            model.setValueAt(comboTENDOUONG.getSelectedItem(), i, 0);
            model.setValueAt(spinnerSoLuong.getValue(), i, 3);
        }
        else{
            System.out.println("Update Error!");
        }
    }//GEN-LAST:event_SuaButtonActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        System.out.println("action perform");
        DoiMatKhau t=new DoiMatKhau();
        t.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        t.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void huyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huyButtonActionPerformed
        // TODO add your handling code here:
        txtMAHD.setText("");
        comboTENDOUONG.setSelectedIndex(0);
        spinnerSoLuong.setValue(1);
        dscthd.removeAll(dscthd);
        ((DefaultTableModel) tableLapHoaDon.getModel()).setRowCount(0);
        showTableCTHD();
    }//GEN-LAST:event_huyButtonActionPerformed

    private void txtGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVien().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LuuButton;
    private javax.swing.JButton SuaButton;
    private javax.swing.JButton ThemButton;
    private javax.swing.JButton XoaButton;
    private javax.swing.JComboBox<String> comboMAQUAY;
    private javax.swing.JComboBox<String> comboTENDOUONG;
    private javax.swing.JComboBox<String> comboTenDoUong;
    private javax.swing.JButton huyButton;
    private javax.swing.JButton jButton18;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label label1;
    private javax.swing.JLabel labelTienTraLai;
    private javax.swing.JLabel labelTongTien;
    private javax.swing.JSpinner spinnerSoLuong;
    private javax.swing.JPanel tabHoaDonDaLap;
    private javax.swing.JPanel tabLapHoaDon;
    private javax.swing.JPanel tabNguyenLieu;
    private javax.swing.JPanel tabThonTinThucDon;
    private javax.swing.JTable tableCTTD;
    private javax.swing.JTable tableDSHD;
    private javax.swing.JTable tableLapHoaDon;
    private javax.swing.JTable tableNguyenLieu;
    private javax.swing.JTable tableThucDon;
    private javax.swing.JTextField textTienLuong;
    private java.awt.TextField txtDENNGAY;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMAHD;
    private javax.swing.JTextField txtNGAYLAP;
    private java.awt.TextField txtTUNGAY;
    private javax.swing.JTextField txtTienKhachDua;
    // End of variables declaration//GEN-END:variables
}
