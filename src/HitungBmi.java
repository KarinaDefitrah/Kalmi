import bmicalculator.General;
import bmicalculator.Pria;
import bmicalculator.Wanita;
import java.awt.Color;
import java.util.Collections;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author silvi
 */
import java.util.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import utility.CategoryBMIUtil;

public class HitungBmi extends javax.swing.JFrame{
    General user;
    boolean isINCI;
    boolean isPOUND;
    

    /**
     * Creates new form HitungBmiLogin
     */
    public Statement stm;
    public Connection con;
    public PreparedStatement pst;
    public ResultSet rs = null;  

     public class DisplayHitungBmi{
        public DisplayHitungBmi(){
            try{
                final String DATABASE_URL = "jdbc:mysql://localhost:3306/projectkalmi"; 
                String user = "root";
                String pass = "";
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(DATABASE_URL, "root", "");
                stm = con.createStatement();
            
                
                
            }catch(ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null, "Connection Gagal");
            }
           
        }
    }


    public HitungBmi(){ 
        initComponents();
        new DisplayHitungBmi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog2 = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabelBMIjDialog = new javax.swing.JLabel();
        jLabelCategoryLogin = new javax.swing.JLabel();
        jLabelDetailLogin = new javax.swing.JLabel();
        jLabelIdealLogin = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        history = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        satuanTinggi = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        berat = new javax.swing.JTextField();
        satuanBerat = new javax.swing.JComboBox<>();
        calculate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        indeksBmi = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        cekKelamin = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        tinggi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dateTime = new javax.swing.JLabel();
        detailBmi = new javax.swing.JButton();
        cekNama1 = new javax.swing.JLabel();

        jDialog2.setPreferredSize(new java.awt.Dimension(600, 510));
        jDialog2.setSize(new java.awt.Dimension(600, 510));
        jDialog2.setType(java.awt.Window.Type.POPUP);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Point BMI");

        jLabelBMIjDialog.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelBMIjDialog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBMIjDialog.setText("0");
        jLabelBMIjDialog.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCategoryLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelCategoryLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCategoryLogin.setText("jLabel8");
        jLabelCategoryLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelDetailLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelDetailLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDetailLogin.setText("jLabel8");
        jLabelDetailLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelIdealLogin.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelIdealLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIdealLogin.setText("0");
        jLabelIdealLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Berat Badan Ideal (dalam Kg)");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelBMIjDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelDetailLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelCategoryLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(jLabelIdealLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBMIjDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCategoryLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDetailLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIdealLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("OCR A Extended", 3, 36)); // NOI18N
        jLabel5.setText("Body Mass Index");

        history.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        history.setText("HISTORY");
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/ukuran.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jPanel2.setBackground(new java.awt.Color(146, 173, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel1.setText("HITUNGAN BMI");

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel2.setText("TINGGI");

        satuanTinggi.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        satuanTinggi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Satuan Tinggi", "CM", "INCI" }));
        satuanTinggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satuanTinggiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel3.setText("BERAT");

        satuanBerat.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        satuanBerat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Satuan Berat", "KG", "POUNDS" }));
        satuanBerat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satuanBeratActionPerformed(evt);
            }
        });

        calculate.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        calculate.setText("CALCULATE");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel4.setText("BMI");

        indeksBmi.setEditable(false);
        indeksBmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indeksBmiActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        cekKelamin.setForeground(new java.awt.Color(146, 173, 255));
        cekKelamin.setText("jLabel7");

        exit.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        tinggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinggiActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel7.setText("WAKTU PENGECEKKAN :");

        dateTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        detailBmi.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        detailBmi.setText("CHECK DETAIL BMI");
        detailBmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailBmiActionPerformed(evt);
            }
        });

        cekNama1.setBackground(new java.awt.Color(146, 173, 255));
        cekNama1.setForeground(new java.awt.Color(146, 173, 255));
        cekNama1.setText("jLabel8");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(calculate)
                .addGap(34, 34, 34)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(cekNama1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cekKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(satuanTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(berat, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(satuanBerat, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(indeksBmi, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(detailBmi, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cekKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cekNama1))
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(satuanTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(berat, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(satuanBerat, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indeksBmi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(dateTime))
                .addGap(82, 82, 82)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculate)
                    .addComponent(clear)
                    .addComponent(exit))
                .addGap(61, 61, 61)
                .addComponent(detailBmi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        // TODO add your handling code here:
        LocalDateTime dateTime1 = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime = dateTime1.format(format);

        // Mengatur nilai formatDateTime ke dalam JTextField dengan variabel dateTime
        dateTime.setText(formatDateTime);
        JLabel dateTime = new JLabel();

        
        
        String kelamin = cekKelamin.getText();
        String simpanNama = cekNama1.getText();
     
        if (kelamin.equalsIgnoreCase("Pria")){
                        user = new Pria();
                    } else{
                        user = new Wanita();
                    } 
        
        
        // CHECK APAKAH MASUKKAN TINGGI KOSONG
        if (tinggi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tidak boleh kosong", "Masukkan tidak valid", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // CHECK APAKAH MASUKKAN BERAT KOSONG
        if (berat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tidak boleh kosong", "Masukkan tidak valid", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // // CHECK APAKAH MASUKKAN BERUPA ANGKA
        try {
            user.setTinggi(Double.parseDouble(tinggi.getText()));
            user.setBerat(Double.parseDouble(berat.getText()));
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Harus menggunakan angka", "Masukkan tidak valid", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // CHECK APAKAH SUDAH MEMILIH SATUAN PANJANG
        if (satuanTinggi.getSelectedItem().equals("Satuan Tinggi")) {
            JOptionPane.showMessageDialog(null, "Harap memilih satuan panjang", "Masukkan tidak valid", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // CHECK APAKAH SUDAH MEMILIH SATUAN BERAT
        if (satuanBerat.getSelectedItem().equals("Satuan Berat")) {
            JOptionPane.showMessageDialog(null, "Harap memilih satuan berat", "Masukkan tidak valid", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // CHECK APAKAH SUDAH MEMILIH PRIA ATAU WANITA
        if (user instanceof Pria) {
            Pria userPria = (Pria) user;
            userPria.setBmi(userPria.calculateBMI(userPria.getTinggi(), userPria.getBerat(), isINCI, isPOUND));
            System.out.println((double) userPria.getBmi());
            indeksBmi.setText(Integer.toString((int) userPria.getBmi()));
            System.out.print(cekNama1.getText());
            DecimalFormat ubah = new DecimalFormat("#.0");
            String a = ubah.format(userPria.getBmi());
            user = userPria;
            jLabelBMIjDialog.setText(a);
        
        } else if (user instanceof Wanita) {
            Wanita userWanita = (Wanita) user;
            userWanita.setBmi(userWanita.calculateBMI(userWanita.getTinggi(), userWanita.getBerat(), isINCI, isPOUND));
            System.out.println(userWanita.getBmi());
            indeksBmi.setText(Integer.toString((int) userWanita.getBmi()));
            System.out.print(cekNama1.getText());
            DecimalFormat ubah = new DecimalFormat("#.0");
            String a = ubah.format(userWanita.getBmi());
            user = userWanita;
            jLabelBMIjDialog.setText(a);
        }
       
       String tangkapIndeks =  indeksBmi.getText();
       String tangkapTanggal = dateTime.getText();
  
      
    
     
     String sqlcom = "INSERT INTO data_history (username, tanggal_cek, hasilbmi) VALUES (?, ?, ?)";
               try {
                   
                   pst = con.prepareStatement(sqlcom);
                   pst.setString(1, cekNama1.getText());
                   pst.setString(2, formatDateTime);
                   pst.setString(3, indeksBmi.getText());
                   pst.executeUpdate();
                   
               }catch(SQLException ex) {
                 JOptionPane.showMessageDialog(this, ex.getMessage());
               }
    
  

   
    }//GEN-LAST:event_calculateActionPerformed

    private void indeksBmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indeksBmiActionPerformed
        // TODO add your handling code here:
   
        indeksBmi.setEditable(false);
        indeksBmi.setOpaque(false);
    }//GEN-LAST:event_indeksBmiActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        tinggi.setText("");
        dateTime.setText("");
        berat.setText("");
        indeksBmi.setText("");
        
    }//GEN-LAST:event_clearActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        Kalmi kal = new Kalmi();
        kal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        // TODO add your handling code here:
        HitungBmi muncul = new HitungBmi();     
             
        History tampil = new History();
        tampil.setVisible(true);
  
    }//GEN-LAST:event_historyActionPerformed

    private void satuanTinggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satuanTinggiActionPerformed
        // TODO add your handling code here:
        if (satuanTinggi.getSelectedItem().equals("CM")) {
            isINCI = false;
        } else if (satuanTinggi.getSelectedItem().equals("INCI")) {
            isINCI = true;
        }
    }//GEN-LAST:event_satuanTinggiActionPerformed

    private void satuanBeratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satuanBeratActionPerformed
        // TODO add your handling code here:
        if (satuanBerat.getSelectedItem().equals("KG")) {
            isPOUND = false;
        } else if (satuanBerat.getSelectedItem().equals("POUNDS")) {
            isPOUND = true;
        }
    }//GEN-LAST:event_satuanBeratActionPerformed

    private void tinggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinggiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tinggiActionPerformed

    private void detailBmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailBmiActionPerformed
        // TODO add your handling code here:
        try {
            if (indeksBmi.getText().isEmpty()) {
            jLabelBMIjDialog.setText("0");
        } else {
            jLabelBMIjDialog.setText(indeksBmi.getText());
        }
        
        // IMPLEMENTASI INTERFACE DENGAN STATIC METHOD
        if (indeksBmi.getText().isEmpty()) {
            jLabelCategoryLogin.setText("-");
        } else {
            jLabelCategoryLogin.setText(CategoryBMIUtil.categoryBMI(Double.parseDouble(indeksBmi.getText())));
        }
        
        // CONTOH INTERFACE DEFAULT METHOD
        if (indeksBmi.getText().isEmpty()) {
            jLabelDetailLogin.setText("-");
        } else {
            jLabelDetailLogin.setText(user.detailBMI(Double.parseDouble(indeksBmi.getText())));
        }
        
        // CONTOH INTERFACE PUBLIC METHOD
        if (indeksBmi.getText().isEmpty()) {
            jLabelIdealLogin.setText("0");
        } else {
            String kg = " KG";
    
            jLabelIdealLogin.setText(Double.toString(user.idealMass(user.getTinggi())) + kg);
        }
        } catch (Exception e){
            String a = "0";
        }
        jDialog2.show();
                       
    }//GEN-LAST:event_detailBmiActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(HitungBmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HitungBmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HitungBmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HitungBmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HitungBmi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField berat;
    private javax.swing.JButton calculate;
    public static javax.swing.JLabel cekKelamin;
    public static javax.swing.JLabel cekNama1;
    private javax.swing.JButton clear;
    private javax.swing.JLabel dateTime;
    private javax.swing.JButton detailBmi;
    private javax.swing.JButton exit;
    private javax.swing.JButton history;
    private javax.swing.JTextField indeksBmi;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelBMIjDialog;
    private javax.swing.JLabel jLabelCategoryLogin;
    private javax.swing.JLabel jLabelDetailLogin;
    private javax.swing.JLabel jLabelIdealLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JComboBox<String> satuanBerat;
    private javax.swing.JComboBox<String> satuanTinggi;
    private javax.swing.JTextField tinggi;
    // End of variables declaration//GEN-END:variables
}
