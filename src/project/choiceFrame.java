
package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import static project.project_frame.label;
public class choiceFrame extends javax.swing.JFrame {
    String str1,str2,sql,sq,sq2,sec,sqload;
    public choiceFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        //showTableData1();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnstatus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        statustable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        daychoose = new javax.swing.JComboBox<>();
        statusbox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        statustable2 = new javax.swing.JTable();
        table2btn = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        othertable = new javax.swing.JTable();
        section = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        button2b = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        numberof = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        load = new javax.swing.JTable();
        select_id = new javax.swing.JComboBox<>();
        loadbtn = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 10));

        close.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        close.setForeground(new java.awt.Color(255, 0, 0));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("x");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        min.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        min.setText("-");
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 32)); // NOI18N
        jLabel1.setText("Welcome user.....");

        jButton1.setBackground(new java.awt.Color(0, 255, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Show Time Table for a week");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(51, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Select day :");

        btnstatus.setBackground(new java.awt.Color(153, 255, 153));
        btnstatus.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnstatus.setText("Show class status in a given day");
        btnstatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstatusActionPerformed(evt);
            }
        });

        statustable1.setBackground(new java.awt.Color(204, 204, 255));
        statustable1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        statustable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(statustable1);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("show subject details");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("<< BACK");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("faculty");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 255, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("check class timing status with pid");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Select your choice....");

        daychoose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        daychoose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", " " }));

        statusbox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        statusbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select below Status in a given Day", "DBMS_Lab", "DS_Lab", "OOPS_Lab", "Number of Class", "Number of Lab" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 255));
        jLabel5.setText("Table Display...");

        statustable2.setBackground(new java.awt.Color(204, 204, 255));
        statustable2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        statustable2.setForeground(new java.awt.Color(1, 1, 1));
        statustable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Day:", "Room_No:", "faculty_id:", "period_id:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(statustable2);
        if (statustable2.getColumnModel().getColumnCount() > 0) {
            statustable2.getColumnModel().getColumn(0).setResizable(false);
            statustable2.getColumnModel().getColumn(1).setResizable(false);
            statustable2.getColumnModel().getColumn(2).setResizable(false);
            statustable2.getColumnModel().getColumn(3).setResizable(false);
        }

        table2btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        table2btn.setText("Show Section 2B Talbe in a given day");
        table2btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table2btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table2btnActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(255, 51, 51));
        clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear.setText("CLEAR ALL TABLE");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        othertable.setBackground(new java.awt.Color(204, 204, 255));
        othertable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        othertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Day:", "Room_No:", "faculty_id:", "period_id:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(othertable);
        if (othertable.getColumnModel().getColumnCount() > 0) {
            othertable.getColumnModel().getColumn(0).setResizable(false);
            othertable.getColumnModel().getColumn(1).setResizable(false);
            othertable.getColumnModel().getColumn(2).setResizable(false);
            othertable.getColumnModel().getColumn(3).setResizable(false);
        }

        section.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        section.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2A", "2B" }));
        section.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel6.setText("Section:");

        button2b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button2b.setText("Show Section 2A Table in a given day");
        button2b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2bActionPerformed(evt);
            }
        });

        numberof.setBackground(new java.awt.Color(204, 204, 255));
        numberof.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numberof.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Day:", "Room_No:", "faculty_id:", "period_id:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(numberof);
        if (numberof.getColumnModel().getColumnCount() > 0) {
            numberof.getColumnModel().getColumn(0).setResizable(false);
            numberof.getColumnModel().getColumn(0).setHeaderValue("Day:");
            numberof.getColumnModel().getColumn(1).setResizable(false);
            numberof.getColumnModel().getColumn(1).setHeaderValue("Room_No:");
            numberof.getColumnModel().getColumn(2).setResizable(false);
            numberof.getColumnModel().getColumn(2).setHeaderValue("faculty_id:");
            numberof.getColumnModel().getColumn(3).setResizable(false);
            numberof.getColumnModel().getColumn(3).setHeaderValue("period_id:");
        }

        load.setBackground(new java.awt.Color(204, 204, 255));
        load.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        load.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(load);

        select_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        select_id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select faculty_ id", "faculty_id: 111", "faculty_id: 112", "faculty_id: 113", "faculty_id: 114", "faculty_id: 115", "faculty_id: 116", "faculty_id: 117", "faculty_id: 118", "faculty_id: 119", "faculty_id: 120", "faculty_id: 121" }));

        loadbtn.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        loadbtn.setText("Show Faculty Work Load in a day or week");
        loadbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(118, 118, 118)
                        .addComponent(jLabel5)
                        .addGap(254, 254, 254))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(section, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(statusbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(daychoose, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnstatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(button2b, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(clear)
                                        .addGap(200, 200, 200)
                                        .addComponent(jButton1)))
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addGap(10, 10, 10))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(select_id, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(84, 84, 84))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(loadbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(table2btn)
                                        .addGap(43, 43, 43))))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(table2btn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(statusbox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(select_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(loadbtn)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(section, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(daychoose, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(111, 111, 111)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(button2b))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnstatus)
                        .addGap(12, 12, 12)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(clear)
                                .addGap(7, 7, 7))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
  
       System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         show_time_table nf=new show_time_table();
         nf.setVisible(true);
        nf.pack();
        nf.setLocationRelativeTo(null);
       nf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstatusActionPerformed

         sec=section.getSelectedItem().toString();
         str1=daychoose.getSelectedItem().toString();
         str2=statusbox.getSelectedItem().toString(); 
     showTableData(); 
     showTableData3();
     if(str2.equals("DBMS_Lab")||str2.equals("DS_Lab")||str2.equals("OOPS_Lab")){
                numberof.setModel(new DefaultTableModel(null,new String [] {  "Day:", "Room_No:", "faculty_id:", "period_id:"  }));
           }
    }//GEN-LAST:event_btnstatusActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         SubjectDetail nf=new SubjectDetail();
         nf.setVisible(true);
        nf.pack();
        nf.setLocationRelativeTo(null);
       nf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        project_frame nf=new project_frame();
         nf.setVisible(true);
        nf.pack();
        nf.setLocationRelativeTo(null);
       nf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
         label.setText("Login successful");  
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      faculty_table nf=new faculty_table();
         nf.setVisible(true);
        nf.pack();
        nf.setLocationRelativeTo(null);
       nf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      time_with_pid nf=new time_with_pid();
         nf.setVisible(true);
        nf.pack();
        nf.setLocationRelativeTo(null);
       nf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void table2btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table2btnActionPerformed
       str1=daychoose.getSelectedItem().toString();
        showTableData1();
    }//GEN-LAST:event_table2btnActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
      statustable1.setModel(new DefaultTableModel(null,  new String [] {"In a given day", "Room_id"}));
       statustable2.setModel(new DefaultTableModel(null,new String [] {  "Day:", "Room_No:", "faculty_id:", "period_id:"  }));
      
        othertable.setModel(new DefaultTableModel(null,new String [] {  "Day:", "Room_No:", "faculty_id:", "period_id:"  }));// daychoose.addItem("");
      //statusbox.getSelectedItem().toString();
       numberof.setModel(new DefaultTableModel(null,new String [] {  "Day:", "Room_No:", "faculty_id:", "period_id:"  }));
    }//GEN-LAST:event_clearActionPerformed

    private void button2bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2bActionPerformed
       str1=daychoose.getSelectedItem().toString();
        showTableData2();
    }//GEN-LAST:event_button2bActionPerformed

    private void loadbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadbtnActionPerformed
       
         str1=daychoose.getSelectedItem().toString();
         str2=select_id.getSelectedItem().toString();
          showTableDataload();
       
    }//GEN-LAST:event_loadbtnActionPerformed

  public void showTableData(){
        try
        {
          Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pro?zeroDateTimeBehavior=convertToNull","root","MyS@L2");
            //String sql="select *from cse";
             if(str1.equals("choose" )|| str2.equals("Select below Status in a given Day")){
                JOptionPane.showMessageDialog(this,"Please select choice a proper way??");
                statustable1.setModel(new DefaultTableModel(null,  new String [] {"In a given day", "Room_id"}));
           }
           else if(sec.equals("2B")){
             if(str1.equals("monday")&&str2.equals("DBMS_Lab")){
               sql="select count(mon) mon,rid from cse c,tb1 t where rid='labdbms' and c.mon=t.sub";
               
             }
           else if(str1.equals("tuesday")&&str2.equals("DBMS_Lab")){
              sql="select count(tue) tue,rid from cse c,tb1 t where rid='labdbms' and c.tue=t.sub ";
              
           }
            else if(str1.equals("wednesday")&&str2.equals("DBMS_Lab")){
              sql="select count(wed) wed,rid from cse c,tb1 t where rid='labdbms' and c.wed=t.sub";
              
            }
            else if(str1.equals("thursday")&&str2.equals("DBMS_Lab")){
              sql="select count(thu) thu,rid from cse c,tb1 t where rid='labdbms' and c.thu=t.sub";
              
            }
           else if(str1.equals("friday")&&str2.equals("DBMS_Lab")){
              sql="select count(fri) fri,rid from cse c,tb1 t where rid='labdbms' and c.fri=t.sub";
             
           }
           else if(str1.equals("saturday")&&str2.equals("DBMS_Lab")){
              sql="select count(sat) sat,rid from cse c,tb1 t where rid='labdbms' and c.sat=t.sub";
             
           }
            
             else if(str1.equals("monday")&&str2.equals("DS_Lab")){
               sql="select count(mon) mon,rid from cse c,tb1 t where rid='labds' and c.mon=t.sub";
               
             }
           else if(str1.equals("tuesday")&&str2.equals("DS_Lab")){
              sql="select count(tue) tue,rid from cse c,tb1 t where rid='labds' and c.tue=t.sub ";
              
           }
            else if(str1.equals("wednesday")&&str2.equals("DS_Lab"))
              sql="select count(wed) wed,rid from cse c,tb1 t where rid='labds' and c.wed=t.sub";           
            else if(str1.equals("thursday")&&str2.equals("DS_Lab"))
              sql="select count(thu) thu,rid from cse c,tb1 t where rid='labds' and c.thu=t.sub";
           else if(str1.equals("friday")&&str2.equals("DS_Lab"))
              sql="select count(fri) fri,rid from cse c,tb1 t where rid='labds' and c.fri=t.sub";
           else if(str1.equals("saturday")&&str2.equals("DS_Lab"))
              sql="select count(sat) sat,rid from cse c,tb1 t where rid='labds' and c.sat=t.sub";
           
           
            else if(str1.equals("monday")&&str2.equals("OOPS_Lab"))
               sql="select count(mon) mon,rid from cse c,tb1 t where rid='laboops' and c.mon=t.sub";
           else if(str1.equals("tuesday")&&str2.equals("OOPS_Lab"))
              sql="select count(tue) tue,rid from cse c,tb1 t where rid='laboops' and c.tue=t.sub ";
            else if(str1.equals("wednesday")&&str2.equals("OOPS_Lab"))
              sql="select count(wed) wed,rid from cse c,tb1 t where rid='laboops' and c.wed=t.sub";           
            else if(str1.equals("thursday")&&str2.equals("OOPS_Lab"))
              sql="select count(thu) thu,rid from cse c,tb1 t where rid='laboops' and c.thu=t.sub";
           else if(str1.equals("friday")&&str2.equals("OOPS_Lab"))
              sql="select count(fri) fri,rid from cse c,tb1 t where rid='laboops' and c.fri=t.sub";
           else if(str1.equals("saturday")&&str2.equals("OOPS_Lab"))
              sql="select count(sat) sat,rid from cse c,tb1 t where rid='laboops' and c.sat=t.sub";
              
             
             else if(str1.equals("monday")&&str2.equals("Number of Class"))
               sql="select count(mon) as Number_of_class_on_Monday from cse where mon not like '%b'";
           else if(str1.equals("tuesday")&&str2.equals("Number of Class"))
              sql="select count(tue)as Number_of_class_on_tuesday from cse where tue not like '%b'";
            else if(str1.equals("wednesday")&&str2.equals("Number of Class"))
              sql="select count(wed)as Number_of_class_on_wednesday from cse where wed not like '%b'";           
            else if(str1.equals("thursday")&&str2.equals("Number of Class"))
              sql="select count(thu)as Number_of_class_on_thursday from cse where thu not like '%b'";
           else if(str1.equals("friday")&&str2.equals("Number of Class"))
              sql="select count(fri)as Number_of_class_on_friday from cse where fri not like '%b'";
           else if(str1.equals("saturday")&&str2.equals("Number of Class"))
              sql="select count(sat)as Number_of_class_on_saturday from cse where sat not like '%b'";
      
             else if(str1.equals("monday")&&str2.equals("Number of Lab"))
               sql="select count(mon) as Number_of_Lab_on_Monday from cse where mon like '%b'";
           else if(str1.equals("tuesday")&&str2.equals("Number of Lab"))
              sql="select count(tue)as Number_of_Lab_on_tuesday from cse where tue like '%b'";
            else if(str1.equals("wednesday")&&str2.equals("Number of Lab"))
              sql="select count(wed)as Number_of_Lab_on_wednesday from cse where wed like '%b'";           
            else if(str1.equals("thursday")&&str2.equals("Number of Lab"))
              sql="select count(thu)as Number_of_Lab_on_thursday from cse where thu  like '%b'";
           else if(str1.equals("friday")&&str2.equals("Number of Lab"))
              sql="select count(fri)as Number_of_Lab_on_friday from cse where fri  like '%b'";
           else if(str1.equals("saturday")&&str2.equals("Number of Lab"))
              sql="select count(sat)as Number_of_Lab_on_saturday from cse where sat  like '%b'";
            }
            
            
            else if(sec.equals("2A")){
               if(str1.equals("monday")&&str2.equals("DBMS_Lab"))
               sql="select count(mon) mon,rid from cse2a c,2a t where rid='labdbms' and c.mon=t.sub";
           else if(str1.equals("tuesday")&&str2.equals("DBMS_Lab"))
              sql="select count(tue) tue,rid from cse2a c,2a t where rid='labdbms' and c.tue=t.sub ";
            else if(str1.equals("wednesday")&&str2.equals("DBMS_Lab"))
              sql="select count(wed) wed,rid from cse2a c,2a t where rid='labdbms' and c.wed=t.sub";
            else if(str1.equals("thursday")&&str2.equals("DBMS_Lab"))
              sql="select count(thu) thu,rid from cse2a c,2a t where rid='labdbms' and c.thu=t.sub";
           else if(str1.equals("friday")&&str2.equals("DBMS_Lab"))
              sql="select count(fri) fri,rid from cse2a c,2a t where rid='labdbms' and c.fri=t.sub";
           else if(str1.equals("saturday")&&str2.equals("DBMS_Lab"))
              sql="select count(sat) sat,rid from cse2a c,2a t where rid='labdbms' and c.sat=t.sub";
            
             else if(str1.equals("monday")&&str2.equals("DS_Lab"))
               sql="select count(mon) mon,rid from cse2a c,2a t where rid='labds' and c.mon=t.sub";
           else if(str1.equals("tuesday")&&str2.equals("DS_Lab"))
              sql="select count(tue) tue,rid from cse2a c,2a t where rid='labds' and c.tue=t.sub ";
            else if(str1.equals("wednesday")&&str2.equals("DS_Lab"))
              sql="select count(wed) wed,rid from cse2a c,2a t where rid='labds' and c.wed=t.sub";           
            else if(str1.equals("thursday")&&str2.equals("DS_Lab"))
              sql="select count(thu) thu,rid from cse2a c,2a t where rid='labds' and c.thu=t.sub";
           else if(str1.equals("friday")&&str2.equals("DS_Lab"))
              sql="select count(fri) fri,rid from cse2a c,2a t where rid='labds' and c.fri=t.sub";
           else if(str1.equals("saturday")&&str2.equals("DS_Lab"))
              sql="select count(sat) sat,rid from cse2a c,2a t where rid='labds' and c.sat=t.sub";
           
           
            else if(str1.equals("monday")&&str2.equals("OOPS_Lab"))
               sql="select count(mon) mon,rid from cse2a c,2a t where rid='laboops' and c.mon=t.sub";
           else if(str1.equals("tuesday")&&str2.equals("OOPS_Lab"))
              sql="select count(tue) tue,rid from cse2a c,2a t where rid='laboops' and c.tue=t.sub ";
            else if(str1.equals("wednesday")&&str2.equals("OOPS_Lab"))
              sql="select count(wed) wed,rid from cse2a c,2a t where rid='laboops' and c.wed=t.sub";           
            else if(str1.equals("thursday")&&str2.equals("OOPS_Lab"))
              sql="select count(thu) thu,rid from cse2a c,2a t where rid='laboops' and c.thu=t.sub";
           else if(str1.equals("friday")&&str2.equals("OOPS_Lab"))
              sql="select count(fri) fri,rid from cse2a c,2a t where rid='laboops' and c.fri=t.sub";
           else if(str1.equals("saturday")&&str2.equals("OOPS_Lab"))
              sql="select count(sat) sat,rid from cse2a c,2a t where rid='laboops' and c.sat=t.sub";
              
             
             else if(str1.equals("monday")&&str2.equals("Number of Class"))
               sql="select count(mon) as Number_of_class_on_Monday from cse2a where mon not like '%b'";
           else if(str1.equals("tuesday")&&str2.equals("Number of Class"))
              sql="select count(tue)as Number_of_class_on_tuesday from cse2a where tue not like '%b'";
            else if(str1.equals("wednesday")&&str2.equals("Number of Class"))
              sql="select count(wed)as Number_of_class_on_wednesday from cse2a where wed not like '%b'";           
            else if(str1.equals("thursday")&&str2.equals("Number of Class"))
              sql="select count(thu)as Number_of_class_on_thursday from cse2a where thu not like '%b'";
           else if(str1.equals("friday")&&str2.equals("Number of Class"))
              sql="select count(fri)as Number_of_class_on_friday from cse2a where fri not like '%b'";
           else if(str1.equals("saturday")&&str2.equals("Number of Class"))
              sql="select count(sat)as Number_of_class_on_saturday from cse2a where sat not like '%b'";
      
             else if(str1.equals("monday")&&str2.equals("Number of Lab"))
               sql="select count(mon) as Number_of_Lab_on_Monday from cse2a where mon like '%b'";
           else if(str1.equals("tuesday")&&str2.equals("Number of Lab"))
              sql="select count(tue)as Number_of_Lab_on_tuesday from cse2a where tue like '%b'";
            else if(str1.equals("wednesday")&&str2.equals("Number of Lab"))
              sql="select count(wed)as Number_of_Lab_on_wednesday from cse2a where wed like '%b'";           
            else if(str1.equals("thursday")&&str2.equals("Number of Lab"))
              sql="select count(thu)as Number_of_Lab_on_thursday from cse2a where thu  like '%b'";
           else if(str1.equals("friday")&&str2.equals("Number of Lab"))
              sql="select count(fri)as Number_of_Lab_on_friday from cse2a where fri  like '%b'";
           else if(str1.equals("saturday")&&str2.equals("Number of Lab"))
              sql="select count(sat)as Number_of_Lab_on_saturday from cse2a where sat  like '%b'"; 
            }
           
            Statement st=con.prepareStatement(sql);
            ResultSet rs=st.executeQuery(sql);
              //s1=rs.getString(1);
             
           
            //s2=rs.getString(2);
            
            DefaultTableModel tm;
            tm = ( DefaultTableModel)statustable1.getModel();
           statustable1.setModel(DbUtils.resultSetToTableModel(rs));
            tm.setRowCount(0);
            while(rs.next()){
            String o[] = {rs.getString("In a given day"),rs.getString("Room_id")};
            statustable1.setModel(DbUtils.resultSetToTableModel(rs));
            tm.addRow(o);
            } 
        }catch(SQLException e){
            //JOptionPane.showMessageDialog(this,e);
            //System.out.println(e);
        }
    } 
  public void showTableData1(){
        try
        {
          Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pro?zeroDateTimeBehavior=convertToNull","root","MyS@L2");
            //String sq="select *from cse";
             if(str1.equals("monday"))
               sq="select mon,rid,fid,pid from cse c,tb1 t where c.mon=t.sub order by pid asc";
           else if(str1.equals("tuesday"))
              sq="select tue,rid,fid,pid from cse c,tb1 t where c.tue=t.sub order by pid asc";
            else if(str1.equals("wednesday"))
              sq="select wed,rid,fid,pid from cse c,tb1 t where c.wed=t.sub order by pid asc";           
            else if(str1.equals("thursday"))
              sq="select thu,rid,fid,pid from cse c,tb1 t where c.thu=t.sub order by pid asc";
           else if(str1.equals("friday"))
              sq="select fri,rid,fid,pid from cse c,tb1 t where c.fri=t.sub order by pid asc";
           else if(str1.equals("saturday"))
              sq="select sat,rid,fid,pid from cse c,tb1 t where c.sat=t.sub order by pid asc";
           else if(str1.equals("choose" )){
                JOptionPane.showMessageDialog(this,"Please select a Day??");
                statustable2.setModel(new DefaultTableModel(null,new String [] {  "Day:", "Room_No:", "faculty_id:", "period_id:"  }));
           }
             
            Statement st=con.prepareStatement(sq);
            ResultSet rs=st.executeQuery(sq);
            DefaultTableModel tm;
            tm = ( DefaultTableModel)statustable2.getModel();
           statustable2.setModel(DbUtils.resultSetToTableModel(rs));
            tm.setRowCount(0);
            while(rs.next()){
            String o[] = {rs.getString("Day:"),rs.getString("Room_No:"),rs.getString("faculty_id:"),rs.getString("period_id:")};
            statustable2.setModel(DbUtils.resultSetToTableModel(rs));
            tm.addRow(o);
            } 
        }catch(SQLException e){
           
        }
    }
  //////////////////////////////////////////////////////////////////////FOR LOAD OF FACULTY///////////////////////////////////////
  
  public void showTableDataload(){
        try
        {
          Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pro?zeroDateTimeBehavior=convertToNull","root","MyS@L2");
            
             if(str1.equals("choose" ) ||str2.equals("Select faculty_ id")){
                JOptionPane.showMessageDialog(this,"Please select choice or faculty_id a proper way??");
                load.setModel(new DefaultTableModel(null,  new String [] {"Number_of_Class", "workload_in_Hrs"}));
           }
            else if(str1.equals("monday")&&str2.equals("faculty_id: 111"))
              sqload="select count(mon2a.fid)+count(mon2b.fid) as Number_of_Class ,((count(mon2a.fid)+count(mon2b.fid))*50)/60 as workload_in_Hrs \n" +
" from mon2a,mon2b where mon2a.fid =111 and mon2b.fid=111;";
           else if(str1.equals("monday")&&str2.equals("faculty_id: 112"))
            sqload="select count(mon2a.fid)+count(mon2b.fid) as Number_of_Class ,((count(mon2a.fid)+count(mon2b.fid))*50)/60 as workload_in_Hrs \n" +
" from mon2a,mon2b where mon2a.fid =112 and mon2b.fid=112 ";
            else if(str1.equals("monday")&&str2.equals("faculty_id: 113"))
            sqload="select count(mon2a.fid)+count(mon2b.fid) as Number_of_Class ,((count(mon2a.fid)+count(mon2b.fid))*50)/60 as workload_in_Hrs \n" +
" from mon2a,mon2b where mon2a.fid =113 and mon2b.fid=113";
            else if(str1.equals("monday")&&str2.equals("faculty_id: 114"))
            sqload="select count(mon2a.fid)+count(mon2b.fid) as Number_of_Class ,((count(mon2a.fid)+count(mon2b.fid))*50)/60 as workload_in_Hrs \n" +
" from mon2a,mon2b where mon2a.fid =114 and mon2b.fid=114";
           else if(str1.equals("monday")&&str2.equals("faculty_id: 115"))
              sqload="select count(mon2a.fid)+count(mon2b.fid) as Number_of_Class ,((count(mon2a.fid)+count(mon2b.fid))*50)/60 as workload_in_Hrs \n" +
" from mon2a,mon2b where mon2a.fid =115 and mon2b.fid=115";
           else if(str1.equals("monday")&&str2.equals("faculty_id: 116"))
             sqload="select count(mon2a.fid)+count(mon2b.fid) as Number_of_Class ,((count(mon2a.fid)+count(mon2b.fid))*50)/60 as workload_in_Hrs \n" +
" from mon2a,mon2b where mon2a.fid =116 and mon2b.fid=116";
             else if(str1.equals("monday")&&str2.equals("faculty_id: 117"))
             sqload="select count(mon2a.fid)+count(mon2b.fid) as Number_of_Class ,((count(mon2a.fid)+count(mon2b.fid))*50)/60 as workload_in_Hrs \n" +
" from mon2a,mon2b where mon2a.fid =117 and mon2b.fid=117";
           else if(str1.equals("monday")&&str2.equals("faculty_id: 118"))
             sqload="select count(mon2a.fid)+count(mon2b.fid) as Number_of_Class ,((count(mon2a.fid)+count(mon2b.fid))*50)/60 as workload_in_Hrs \n" +
" from mon2a,mon2b where mon2a.fid =118 and mon2b.fid=118";
            else if(str1.equals("monday")&&str2.equals("facutly_id: 119"))
            sqload="select count(mon2a.fid)+count(mon2b.fid) as Number_of_Class ,((count(mon2a.fid)+count(mon2b.fid))*50)/60 as workload_in_Hrs \n" +
" from mon2a,mon2b where mon2a.fid =119 and mon2b.fid=119";           
            else if(str1.equals("monday")&&str2.equals("faculty_id: 120"))
             sqload=" select count(mon2a.fid)+count(mon2b.fid) as Number_of_Class ,((count(mon2a.fid)+count(mon2b.fid))*50)/60 as workload_in_Hrs \n" +
" from mon2a,mon2b where mon2a.fid =120 and mon2b.fid=120";
           else if(str1.equals("monday")&&str2.equals("faculty_id: 121"))
              sqload=" select count(mon2a.fid)+count(mon2b.fid) as Number_of_Class ,((count(mon2a.fid)+count(mon2b.fid))*50)/60 as workload_in_Hrs \n" +
" from mon2a,mon2b where mon2a.fid =121 and mon2b.fid=121";
           
           else if(str1.equals("tuesday")&&str2.equals("faculty_id: 111"))
              sqload="select count(tue2a.fid)+count(tue2b.fid) as Number_of_Class ,((count(tue2a.fid)+count(tue2b.fid))*50)/60 as workload_in_Hrs \n" +
" from tue2a,tue2b where tue2a.fid =111 and tue2b.fid=111";
           else if(str1.equals("tuesday")&&str2.equals("faculty_id: 112"))
              sqload="select count(tue2a.fid)+count(tue2b.fid) as Number_of_Class ,((count(tue2a.fid)+count(tue2b.fid))*50)/60 as workload_in_Hrs \n" +
"from tue2a,tue2b where tue2a.fid =112 and tue2b.fid=112";
            else if(str1.equals("tuesday")&&str2.equals("faculty_id: 113"))
            sqload="select count(tue2a.fid)+count(tue2b.fid) as Number_of_Class ,((count(tue2a.fid)+count(tue2b.fid))*50)/60 as workload_in_Hrs \n" +
" from tue2a,tue2b where tue2a.fid =113 and tue2b.fid=113";
            else if(str1.equals("tuesday")&&str2.equals("faculty_id: 114"))
            sqload="select count(tue2a.fid)+count(tue2b.fid) as Number_of_Class ,((count(tue2a.fid)+count(tue2b.fid))*50)/60 as workload_in_Hrs \n" +
" from tue2a,mon2b where tue2a.fid =114 and tue2b.fid=114";
           else if(str1.equals("tuesday")&&str2.equals("faculty_id: 115"))
          sqload="select count(tue2a.fid)+count(tue2b.fid) as Number_of_Class ,((count(tue2a.fid)+count(tue2b.fid))*50)/60 as workload_in_Hrs \n" +
" from tue2a,tue2b where tue2a.fid =115 and tue2b.fid=115";
           else if(str1.equals("tuesday")&&str2.equals("faculty_id: 116"))
            sqload="select count(tue2a.fid)+count(tue2b.fid) as Number_of_Class ,((count(tue2a.fid)+count(tue2b.fid))*50)/60 as workload_in_Hrs \n" +
" from tue2a,tue2b where tue2a.fid =116 and tue2b.fid=116";
             else if(str1.equals("tuesday")&&str2.equals("faculty_id: 117"))
              sqload=" select count(tue2a.fid)+count(tue2b.fid) as Number_of_Class ,((count(tue2a.fid)+count(tue2b.fid))*50)/60 as workload_in_Hrs \n" +
" from tue2a,tue2b where tue2a.fid =117 and tue2b.fid=117";
           else if(str1.equals("tuesday")&&str2.equals("faculty_id: 118"))
             sqload="select count(tue2a.fid)+count(tue2b.fid) as Number_of_Class ,((count(tue2a.fid)+count(tue2b.fid))*50)/60 as workload_in_Hrs \n" +
" from tue2a,tue2b where tue2a.fid =118 and tue2b.fid=118 ";
            else if(str1.equals("tuesday")&&str2.equals("facutly_id: 119"))
           sqload="select count(tue2a.fid)+count(tue2b.fid) as Number_of_Class ,((count(tue2a.fid)+count(tue2b.fid))*50)/60 as workload_in_Hrs \n" +
" from tue2a,tue2b where tue2a.fid =119 and tue2b.fid=119";           
            else if(str1.equals("tuesday")&&str2.equals("faculty_id: 120"))
            sqload="select count(tue2a.fid)+count(tue2b.fid) as Number_of_Class ,((count(tue2a.fid)+count(tue2b.fid))*50)/60 as workload_in_Hrs \n" +
" from tue2a,tue2b where tue2a.fid =120 and tue2b.fid=120";
           else if(str1.equals("tuesday")&&str2.equals("faculty_id: 121"))
              sqload="select count(tue2a.fid)+count(tue2b.fid) as Number_of_Class ,((count(tue2a.fid)+count(tue2b.fid))*50)/60 as workload_in_Hrs \n" +
" from tue2a,tue2b where tue2a.fid =121 and tue2b.fid=121";
           
              else if(str1.equals("wednesday")&&str2.equals("faculty_id: 111"))
             sqload="select count(wed2a.fid)+count(wed2b.fid) as Number_of_Class ,((count(wed2a.fid)+count(wed2b.fid))*50)/60 as workload_in_Hrs \n" +
" from wed2a,wed2b where wed2a.fid =111 and wed2b.fid=111";
           else if(str1.equals("wednesday")&&str2.equals("faculty_id: 112"))
             sqload="select count(wed2a.fid)+count(wed2b.fid) as Number_of_Class ,((count(wed2a.fid)+count(wed2b.fid))*50)/60 as workload_in_Hrs \n" +
" from wed2a,wed2b where wed2a.fid =112 and wed2b.fid=112";
            else if(str1.equals("wednesday")&&str2.equals("faculty_id: 113"))
            sqload="select count(wed2a.fid)+count(wed2b.fid) as Number_of_Class ,((count(wed2a.fid)+count(wed2b.fid))*50)/60 as workload_in_Hrs \n" +
" from wed2a,wed2b where wed2a.fid =113 and wed2b.fid=113";
            else if(str1.equals("wednesday")&&str2.equals("faculty_id: 114"))
            sqload=" select count(wed2a.fid)+count(wed2b.fid) as Number_of_Class ,((count(wed2a.fid)+count(wed2b.fid))*50)/60 as workload_in_Hrs \n" +
" from wed2a,wed2b where wed2a.fid =114 and wed2b.fid=114";
           else if(str1.equals("wednesday")&&str2.equals("faculty_id: 115"))
            sqload=" select count(wed2a.fid)+count(wed2b.fid) as Number_of_Class ,((count(wed2a.fid)+count(wed2b.fid))*50)/60 as workload_in_Hrs \n" +
" from wed2a,wed2b where wed2a.fid =115 and wed2b.fid=115";
           else if(str1.equals("wednesday")&&str2.equals("faculty_id: 116"))
             sqload="select count(wed2a.fid)+count(wed2b.fid) as Number_of_Class ,((count(wed2a.fid)+count(wed2b.fid))*50)/60 as workload_in_Hrs \n" +
" from wed2a,wed2b where wed2a.fid =116 and wed2b.fid=116";
             else if(str1.equals("wednesday")&&str2.equals("faculty_id: 117"))
             sqload="select count(wed2a.fid)+count(wed2b.fid) as Number_of_Class ,((count(wed2a.fid)+count(wed2b.fid))*50)/60 as workload_in_Hrs \n" +
" from wed2a,wed2b where wed2a.fid =117 and wed2b.fid=117";
           else if(str1.equals("wednesday")&&str2.equals("faculty_id: 118"))
            sqload="select count(wed2a.fid)+count(wed2b.fid) as Number_of_Class ,((count(wed2a.fid)+count(wed2b.fid))*50)/60 as workload_in_Hrs \n" +
" from wed2a,wed2b where wed2a.fid =118 and wed2b.fid=118";
            else if(str1.equals("wednesday")&&str2.equals("facutly_id: 119"))
             sqload="select count(wed2a.fid)+count(wed2b.fid) as Number_of_Class ,((count(wed2a.fid)+count(wed2b.fid))*50)/60 as workload_in_Hrs \n" +
" from wed2a,wed2b where wed2a.fid =119 and wed2b.fid=119";           
            else if(str1.equals("wednesday")&&str2.equals("faculty_id: 120"))
           sqload="select count(wed2a.fid)+count(wed2b.fid) as Number_of_Class ,((count(wed2a.fid)+count(wed2b.fid))*50)/60 as workload_in_Hrs \n" +
" from wed2a,wed2b where wed2a.fid =120 and wed2b.fid=120";
           else if(str1.equals("wednesday")&&str2.equals("faculty_id: 121"))
               sqload="select count(wed2a.fid)+count(wed2b.fid) as Number_of_Class ,((count(wed2a.fid)+count(wed2b.fid))*50)/60 as workload_in_Hrs \n" +
" from wed2a,wed2b where wed2a.fid =121 and wed2b.fid=121";
           
               else if(str1.equals("thursday")&&str2.equals("faculty_id: 111"))
              sqload="select count(thu2a.fid)+count(thu2b.fid) as Number_of_Class ,((count(thu2a.fid)+count(thu2b.fid))*50)/60 as workload_in_Hrs \n" +
" from thu2a,thu2b where thu2a.fid =111 and thu2b.fid=111";
           else if(str1.equals("thursday")&&str2.equals("faculty_id: 112"))
              sqload="select count(thu2a.fid)+count(thu2b.fid) as Number_of_Class ,((count(thu2a.fid)+count(thu2b.fid))*50)/60 as workload_in_Hrs \n" +
" from thu2a,thu2b where thu2a.fid =112 and thu2b.fid=112";
            else if(str1.equals("thursday")&&str2.equals("faculty_id: 113"))
             sqload="select count(thu2a.fid)+count(thu2b.fid) as Number_of_Class ,((count(thu2a.fid)+count(thu2b.fid))*50)/60 as workload_in_Hrs \n" +
" from thu2a,thu2b where thu2a.fid =113 and thu2b.fid=113";
            else if(str1.equals("thursday")&&str2.equals("faculty_id: 114"))
              sqload="select count(thu2a.fid)+count(thu2b.fid) as Number_of_Class ,((count(thu2a.fid)+count(thu2b.fid))*50)/60 as workload_in_Hrs \n" +
" from thu2a,thu2b where thu2a.fid =114 and thu2b.fid=114";
           else if(str1.equals("thursday")&&str2.equals("faculty_id: 115"))
              sqload="select count(thu2a.fid)+count(thu2b.fid) as Number_of_Class ,((count(thu2a.fid)+count(thu2b.fid))*50)/60 as workload_in_Hrs \n" +
" from thu2a,thu2b where thu2a.fid =115 and thu2b.fid=115";
           else if(str1.equals("thursday")&&str2.equals("faculty_id: 116"))
             sqload="select count(thu2a.fid)+count(thu2b.fid) as Number_of_Class ,((count(thu2a.fid)+count(thu2b.fid))*50)/60 as workload_in_Hrs \n" +
" from thu2a,thu2b where thu2a.fid =116 and thu2b.fid=116";
             else if(str1.equals("thursday")&&str2.equals("faculty_id: 117"))
               sqload="select count(thu2a.fid)+count(thu2b.fid) as Number_of_Class ,((count(thu2a.fid)+count(thu2b.fid))*50)/60 as workload_in_Hrs \n" +
" from thu2a,thu2b where thu2a.fid =117 and thu2b.fid=117";
           else if(str1.equals("thursday")&&str2.equals("faculty_id: 118"))
            sqload="select count(thu2a.fid)+count(thu2b.fid) as Number_of_Class ,((count(thu2a.fid)+count(thu2b.fid))*50)/60 as workload_in_Hrs \n" +
" from thu2a,thu2b where thu2a.fid =118 and thu2b.fid=118";
            else if(str1.equals("thursday")&&str2.equals("facutly_id: 119"))
             sqload="select count(thu2a.fid)+count(thu2b.fid) as Number_of_Class ,((count(thu2a.fid)+count(thu2b.fid))*50)/60 as workload_in_Hrs \n" +
" from thu2a,thu2b where thu2a.fid =119 and thu2b.fid=119";           
            else if(str1.equals("thursday")&&str2.equals("faculty_id: 120"))
             sqload="select count(thu2a.fid)+count(thu2b.fid) as Number_of_Class ,((count(thu2a.fid)+count(thu2b.fid))*50)/60 as workload_in_Hrs \n" +
" from thu2a,thu2b where thu2a.fid =120 and thu2b.fid=120";
           else if(str1.equals("thursday")&&str2.equals("faculty_id: 121"))
             sqload="select count(thu2a.fid)+count(thu2b.fid) as Number_of_Class ,((count(thu2a.fid)+count(thu2b.fid))*50)/60 as workload_in_Hrs \n" +
" from thu2a,thu2b where thu2a.fid =121 and thu2b.fid=121";
           
            else if(str1.equals("friday")&&str2.equals("faculty_id: 111"))
               sqload="select count(fri2a.fid)+count(fri2b.fid) as Number_of_Class ,((count(fri2a.fid)+count(fri2b.fid))*50)/60 as workload_in_Hrs \n" +
" from fri2a,fri2b where fri2a.fid =111 and fri2b.fid=111";
           else if(str1.equals("friday")&&str2.equals("faculty_id: 112"))
              sqload="select count(fri2a.fid)+count(fri2b.fid) as Number_of_Class ,((count(fri2a.fid)+count(fri2b.fid))*50)/60 as workload_in_Hrs \n" +
" from fri2a,fri2b where fri2a.fid =112 and fri2b.fid=112";
            else if(str1.equals("friday")&&str2.equals("faculty_id: 113"))
              sqload="select count(fri2a.fid)+count(fri2b.fid) as Number_of_Class ,((count(fri2a.fid)+count(fri2b.fid))*50)/60 as workload_in_Hrs \n" +
" from fri2a,fri2b where fri2a.fid =113 and fri2b.fid=113";
            else if(str1.equals("friday")&&str2.equals("faculty_id: 114"))
              sqload="select count(fri2a.fid)+count(fri2b.fid) as Number_of_Class ,((count(fri2a.fid)+count(fri2b.fid))*50)/60 as workload_in_Hrs \n" +
" from fri2a,fri2b where fri2a.fid =114 and fri2b.fid=114";
           else if(str1.equals("friday")&&str2.equals("faculty_id: 115"))
             sqload="select count(fri2a.fid)+count(fri2b.fid) as Number_of_Class ,((count(fri2a.fid)+count(fri2b.fid))*50)/60 as workload_in_Hrs \n" +
" from fri2a,fri2b where fri2a.fid =11 and fri2b.fid=115";
           else if(str1.equals("friday")&&str2.equals("faculty_id: 116"))
            sqload="select count(fri2a.fid)+count(fri2b.fid) as Number_of_Class ,((count(fri2a.fid)+count(fri2b.fid))*50)/60 as workload_in_Hrs \n" +
" from fri2a,fri2b where fri2a.fid =116 and fri2b.fid=116";
             else if(str1.equals("friday")&&str2.equals("faculty_id: 117"))
               sqload="select count(fri2a.fid)+count(fri2b.fid) as Number_of_Class ,((count(fri2a.fid)+count(fri2b.fid))*50)/60 as workload_in_Hrs \n" +
" from fri2a,fri2b where fri2a.fid =117 and fri2b.fid=117";
           else if(str1.equals("friday")&&str2.equals("faculty_id: 118"))
              sqload="select count(fri2a.fid)+count(fri2b.fid) as Number_of_Class ,((count(fri2a.fid)+count(fri2b.fid))*50)/60 as workload_in_Hrs \n" +
" from fri2a,fri2b where fri2a.fid =118 and fri2b.fid=118 ";
            else if(str1.equals("friday")&&str2.equals("facutly_id: 119"))
               sqload="select count(fri2a.fid)+count(fri2b.fid) as Number_of_Class ,((count(fri2a.fid)+count(fri2b.fid))*50)/60 as workload_in_Hrs \n" +
" from fri2a,fri2b where fri2a.fid =119 and fri2b.fid=119";           
            else if(str1.equals("friday")&&str2.equals("faculty_id: 120"))
              sqload=" select count(fri2a.fid)+count(fri2b.fid) as Number_of_Class ,((count(fri2a.fid)+count(fri2b.fid))*50)/60 as workload_in_Hrs \n" +
" from fri2a,fri2b where fri2a.fid =120 and fri2b.fid=120";
           else if(str1.equals("friday")&&str2.equals("faculty_id: 121"))
              sqload="select count(fri2a.fid)+count(fri2b.fid) as Number_of_Class ,((count(fri2a.fid)+count(fri2b.fid))*50)/60 as workload_in_Hrs \n" +
" from fri2a,fri2b where fri2a.fid =121 and fri2b.fid=121";
           
            else if(str1.equals("saturday")&&str2.equals("faculty_id: 111"))
                sqload="select count(sat2a.fid)+count(sat2b.fid) as Number_of_Class ,((count(sat2a.fid)+count(sat2b.fid))*50)/60 as workload_in_Hrs \n" +
" from sat2a,sat2b where sat2a.fid =111 and sat2b.fid=111";
           else if(str1.equals("saturday")&&str2.equals("faculty_id: 112"))
              sqload="select count(sat2a.fid)+count(sat2b.fid) as Number_of_Class ,((count(sat2a.fid)+count(sat2b.fid))*50)/60 as workload_in_Hrs \n" +
" from sat2a,sat2b where sat2a.fid =112 and sat2b.fid=112 ";
            else if(str1.equals("saturday")&&str2.equals("faculty_id: 113"))
               sqload=" select count(sat2a.fid)+count(sat2b.fid) as Number_of_Class ,((count(sat2a.fid)+count(sat2b.fid))*50)/60 as workload_in_Hrs \n" +
" from sat2a,sat2b where sat2a.fid =113 and sat2b.fid=113";
            else if(str1.equals("saturday")&&str2.equals("faculty_id: 114"))
               sqload="select count(sat2a.fid)+count(sat2b.fid) as Number_of_Class ,((count(sat2a.fid)+count(sat2b.fid))*50)/60 as workload_in_Hrs \n" +
" from sat2a,sat2b where sat2a.fid =114 and sat2b.fid=114";
           else if(str1.equals("saturday")&&str2.equals("faculty_id: 115"))
              sqload="select count(sat2a.fid)+count(sat2b.fid) as Number_of_Class ,((count(sat2a.fid)+count(sat2b.fid))*50)/60 as workload_in_Hrs \n" +
" from sat2a,sat2b where sat2a.fid =115 and sat2b.fid=115";
           else if(str1.equals("saturday")&&str2.equals("faculty_id: 116"))
               sqload="select count(sat2a.fid)+count(sat2b.fid) as Number_of_Class ,((count(sat2a.fid)+count(sat2b.fid))*50)/60 as workload_in_Hrs \n" +
" from sat2a,sat2b where sat2a.fid =116 and sat2b.fid=116";
             else if(str1.equals("saturday")&&str2.equals("faculty_id: 117"))
                sqload="select count(sat2a.fid)+count(sat2b.fid) as Number_of_Class ,((count(sat2a.fid)+count(sat2b.fid))*50)/60 as workload_in_Hrs \n" +
" from sat2a,sat2b where sat2a.fid =117 and sat2b.fid=117";
           else if(str1.equals("saturday")&&str2.equals("faculty_id: 118"))
               sqload="select count(sat2a.fid)+count(sat2b.fid) as Number_of_Class ,((count(sat2a.fid)+count(sat2b.fid))*50)/60 as workload_in_Hrs \n" +
" from sat2a,sat2b where sat2a.fid =118 and sat2b.fid=118";
            else if(str1.equals("saturday")&&str2.equals("facutly_id: 119"))
               sqload="select count(sat2a.fid)+count(sat2b.fid) as Number_of_Class ,((count(sat2a.fid)+count(sat2b.fid))*50)/60 as workload_in_Hrs \n" +
" from sat2a,sat2b where sat2a.fid =119 and sat2b.fid=119";           
            else if(str1.equals("saturday")&&str2.equals("faculty_id: 120"))
               sqload="select count(sat2a.fid)+count(sat2b.fid) as Number_of_Class ,((count(sat2a.fid)+count(sat2b.fid))*50)/60 as workload_in_Hrs \n" +
" from sat2a,sat2b where sat2a.fid =120 and sat2b.fid=120";
           else if(str1.equals("saturday")&&str2.equals("faculty_id: 121"))
              sqload="select count(sat2a.fid)+count(sat2b.fid) as Number_of_Class ,((count(sat2a.fid)+count(sat2b.fid))*50)/60 as workload_in_Hrs \n" +
" from sat2a,sat2b where sat2a.fid =121 and sat2b.fid=121";
           
           
            
           
            Statement st=con.prepareStatement(sqload);
            ResultSet rs=st.executeQuery(sqload);
             
            
            DefaultTableModel tm;
            tm = ( DefaultTableModel)load.getModel();
           load.setModel(DbUtils.resultSetToTableModel(rs));
            tm.setRowCount(0);
            while(rs.next()){
            String o[] = {rs.getString("Number_of_Class"),rs.getString("workload_in_Hrs")};
            load.setModel(DbUtils.resultSetToTableModel(rs));
            tm.addRow(o);
            } 
        }catch(SQLException e){
          
        }
    } 
  ////////////////////////////////////////////////////////////FOR LAB  and class only ///////////////////////////////////////
  public void showTableData3(){
        try
        {
          Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pro?zeroDateTimeBehavior=convertToNull","root","MyS@L2");
             if(str1.equals("choose" )|| str2.equals("Select below Status in a given Day")){
               
                statustable1.setModel(new DefaultTableModel(null,  new String [] {"In a given day", "Room_id"}));
                numberof.setModel(new DefaultTableModel(null,new String [] {  "Day:", "Room_No:", "faculty_id:", "period_id:"  }));
           }
           else if(sec.equals("2B")){
            
              if(str1.equals("monday")&&str2.equals("Number of Class"))
               sq2="select mon,rid,fid,pid from cse c,2a t where c.mon=t.sub && mon not like '%b' order by pid asc";
           else if(str1.equals("tuesday")&&str2.equals("Number of Class"))
              sq2="select tue,rid,fid,pid from cse c,2a t where c.tue=t.sub && tue not like '%b' order by pid asc";
            else if(str1.equals("wednesday")&&str2.equals("Number of Class"))
              sq2="select wed,rid,fid,pid from cse c,2a t where c.wed=t.sub && wed not like '%b' order by pid asc";           
            else if(str1.equals("thursday")&&str2.equals("Number of Class"))
              sq2="select thu,rid,fid,pid from cse c,2a t where c.thu=t.sub && thu not like '%b' order by pid asc";
           else if(str1.equals("friday")&&str2.equals("Number of Class"))
              sq2="select fri,rid,fid,pid from cse c,2a t where c.fri=t.sub && fri not like '%b' order by pid asc";
           else if(str1.equals("saturday")&&str2.equals("Number of Class"))
              sq2="select sat,rid,fid,pid from cse c,2a t where c.sat=t.sub && sat not like '%b' order by pid asc";
      
             else if(str1.equals("monday")&&str2.equals("Number of Lab"))
               sq2="select mon,rid,fid,pid from cse c,2a t where c.mon=t.sub && mon like '%b' order by pid asc";
           else if(str1.equals("tuesday")&&str2.equals("Number of Lab"))
              sq2="select tue,rid,fid,pid from cse c,2a t where c.tue=t.sub && tue like '%b' order by pid asc";
            else if(str1.equals("wednesday")&&str2.equals("Number of Lab"))
              sq2="select wed,rid,fid,pid from cse c,2a t where c.wed=t.sub && wed like '%b' order by pid asc";           
            else if(str1.equals("thursday")&&str2.equals("Number of Lab"))
              sq2="select thu,rid,fid,pid from cse c,2a t where c.thu=t.sub && thu like '%b' order by pid asc";
           else if(str1.equals("friday")&&str2.equals("Number of Lab"))
              sq2="select fri,rid,fid,pid from cse c,2a t where c.fri=t.sub && fri like '%b' order by pid asc";
           else if(str1.equals("saturday")&&str2.equals("Number of Lab"))
              sq2="select sat,rid,fid,pid from cse c,2a t where c.sat=t.sub && sat like '%b' order by pid asc";
            }
            else if(sec.equals("2A")){
              if(str1.equals("monday")&&str2.equals("Number of Class"))
               sq2="select mon,rid,fid,pid from cse2a c,2a t where c.mon=t.sub && mon not like '%b' order by pid asc;";
           else if(str1.equals("tuesday")&&str2.equals("Number of Class"))
              sq2="select tue,rid,fid,pid from cse2a c,2a t where c.tue=t.sub && tue not like '%b' order by pid asc";
            else if(str1.equals("wednesday")&&str2.equals("Number of Class"))
              sq2="select wed,rid,fid,pid from cse2a c,2a t where c.wed=t.sub && wed not like '%b' order by pid asc";           
            else if(str1.equals("thursday")&&str2.equals("Number of Class"))
              sq2="select thu,rid,fid,pid from cse2a c,2a t where c.thu=t.sub && thu not like '%b' order by pid asc";
           else if(str1.equals("friday")&&str2.equals("Number of Class"))
              sq2="select fri,rid,fid,pid from cse2a c,2a t where c.fri=t.sub && fri not like '%b' order by pid asc";
           else if(str1.equals("saturday")&&str2.equals("Number of Class"))
              sq2="select sat,rid,fid,pid from cse2a c,2a t where c.sat=t.sub && sat not like '%b' order by pid asc";
      
             else if(str1.equals("monday")&&str2.equals("Number of Lab"))
               sq2="select mon,rid,fid,pid from cse2a c,2a t where c.mon=t.sub && mon like '%b' order by pid asc;";
           else if(str1.equals("tuesday")&&str2.equals("Number of Lab"))
              sq2="select tue,rid,fid,pid from cse2a c,2a t where c.tue=t.sub && tue like '%b' order by pid asc";
            else if(str1.equals("wednesday")&&str2.equals("Number of Lab"))
              sq2="select wed,rid,fid,pid from cse2a c,2a t where c.wed=t.sub && wed like '%b' order by pid asc";           
            else if(str1.equals("thursday")&&str2.equals("Number of Lab"))
              sq2="select thu,rid,fid,pid from cse2a c,2a t where c.thu=t.sub && thu like '%b' order by pid asc";
           else if(str1.equals("friday")&&str2.equals("Number of Lab"))
              sq2="select fri,rid,fid,pid from cse2a c,2a t where c.fri=t.sub && fri like '%b' order by pid asc";
           else if(str1.equals("saturday")&&str2.equals("Number of Lab"))
              sq="select sat,rid,fid,pid from cse2a c,2a t where c.sat=t.sub && sat like '%b' order by pid asc"; 
            }
           
            Statement st=con.prepareStatement(sq2);
            ResultSet rs=st.executeQuery(sq2);
              //s1=rs.getString(1);
            //s2=rs.getString(2);
            
            DefaultTableModel tm;
            tm = ( DefaultTableModel)numberof.getModel();
          numberof.setModel(DbUtils.resultSetToTableModel(rs));
            tm.setRowCount(0);
            while(rs.next()){
            String o[] = {rs.getString("Day:"),rs.getString("Room_No:"),rs.getString("faculty_id:"),rs.getString("period_id:")};
            numberof.setModel(DbUtils.resultSetToTableModel(rs));
            tm.addRow(o);
            } 
        }catch(SQLException e){
            //JOptionPane.showMessageDialog(this,e);
            //System.out.println(e);
        }
    } 
  ////////////////////////////////////////////////FOR CHECKING EMPTY ROOM 
 
  
  //////////////////////////////////////////////////////for second table 
  public void showTableData2(){
        try
        {
          Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pro?zeroDateTimeBehavior=convertToNull","root","MyS@L2");
            //String sq="select *from cse";
             if(str1.equals("monday"))
               sq="select mon,rid,fid,pid from cse2a c,2a t where c.mon=t.sub order by pid asc";
           else if(str1.equals("tuesday"))
              sq="select tue,rid,fid,pid from cse2a c,2a t where c.tue=t.sub order by pid asc";
            else if(str1.equals("wednesday"))
              sq="select wed,rid,fid,pid from cse2a c,2a t where c.wed=t.sub order by pid asc";           
            else if(str1.equals("thursday"))
              sq="select thu,rid,fid,pid from cse2a c,2a t where c.thu=t.sub order by pid asc";
           else if(str1.equals("friday"))
              sq="select fri,rid,fid,pid from cse2a c,2a t where c.fri=t.sub order by pid asc";
           else if(str1.equals("saturday"))
              sq="select sat,rid,fid,pid from cse2a c,2a t where c.sat=t.sub order by pid asc";
           else if(str1.equals("choose" )){
                JOptionPane.showMessageDialog(this,"Please select a Day??");
                othertable.setModel(new DefaultTableModel(null,new String [] {  "Day:", "Room_No:", "faculty_id:", "period_id:"  }));
           }
             
            Statement st=con.prepareStatement(sq);
            ResultSet rs=st.executeQuery(sq);
            DefaultTableModel tm;
            tm = ( DefaultTableModel)othertable.getModel();
           othertable.setModel(DbUtils.resultSetToTableModel(rs));
            tm.setRowCount(0);
            while(rs.next()){
            String o[] = {rs.getString("Day:"),rs.getString("Room_No:"),rs.getString("faculty_id:"),rs.getString("period_id:")};
            othertable.setModel(DbUtils.resultSetToTableModel(rs));
            tm.addRow(o);
            } 
        }catch(SQLException e){
           
        }
    }
    public static void main(String args[]) {
       
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
        } catch(Exception e){
            java.util.logging.Logger.getLogger(choiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
       
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new choiceFrame().setVisible(true);
            new choiceFrame().setResizable(false);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnstatus;
    private javax.swing.JButton button2b;
    private javax.swing.JButton clear;
    private javax.swing.JLabel close;
    private javax.swing.JComboBox<String> daychoose;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable load;
    private javax.swing.JButton loadbtn;
    private javax.swing.JLabel min;
    private javax.swing.JTable numberof;
    private javax.swing.JTable othertable;
    private javax.swing.JComboBox<String> section;
    private javax.swing.JComboBox<String> select_id;
    private javax.swing.JComboBox<String> statusbox;
    private javax.swing.JTable statustable1;
    private javax.swing.JTable statustable2;
    private javax.swing.JButton table2btn;
    // End of variables declaration//GEN-END:variables

    private void JOptionshowMessageDialog() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
