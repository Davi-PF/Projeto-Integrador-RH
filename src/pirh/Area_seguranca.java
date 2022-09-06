/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pirh;

import ConectorTabelas.TabelaWS;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author davip
 */
public class Area_seguranca extends javax.swing.JFrame {
    /**
     * Creates new form Area_seguranca
     */
    
    public Area_seguranca() {
        initComponents();
        this.setLocationRelativeTo(null);
        atualizarTabela();
        //cria uma borda para o global panel
        
        Border glob_panel_border = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.DARK_GRAY);
        jPanel1.setBorder(glob_panel_border);
        
        //cria uma borda preta para o fechar e o minimizar jlabes
        
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_minimize.setBorder(label_border);
        jLabel_close.setBorder(label_border);
        
        
    }

    
    public void atualizarTabela(){
        try{

        Connection conn = TabelaWS.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select * from workshop");
        ResultSet rs=ps.executeQuery();
        DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
        tm.setRowCount(0);
        
        while(rs.next()){
            Object o[] = {rs.getInt("Id_Projeto"),rs.getString("Nome do Projeto"),rs.getString("Tipo do Projeto"),rs.getString("Equipe do Projeto"),
            rs.getString("Info_Projeto"), rs.getString("Status_Projeto")};
            tm.addRow(o);
        }
    }
    catch(Exception e){

        JOptionPane.showMessageDialog(null,"Erro: "+e);
    }
    }
    
    public boolean verificarCampos(){
        
        if(jTextField_ID.getText().trim().equals("") || jTextField_nomeproj.getText().trim().equals("") || jTextField_tipoproj.getText().trim().equals("")
                || jTextField_equipeproj.getText().trim().equals("") || jTextArea_infoproj.getText().trim().equals("")
                || jTextField_sttsproj.getText().trim().equals("")){
         
            JOptionPane.showMessageDialog(null,"Você deixou algum campo vazio. A Alteração foi barrada","Campos Vazios",2);
            return false;
        } else{
            return true;
        }
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_minimize = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_edit = new javax.swing.JButton();
        jButton_excluir = new javax.swing.JButton();
        jButton_NovoP = new javax.swing.JButton();
        jButton_attTabela = new javax.swing.JButton();
        jButton_comeback = new javax.swing.JButton();
        jTextField_ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_nomeproj = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_tipoproj = new javax.swing.JTextField();
        jTextField_equipeproj = new javax.swing.JTextField();
        jTextField_sttsproj = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_infoproj = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Área do Supervisor");

        jLabel_minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_minimize.setText(" - ");
        jLabel_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseExited(evt);
            }
        });

        jLabel_close.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_close.setText(" X ");
        jLabel_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_minimize)
                    .addComponent(jLabel_close))
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id do Projeto", "Nome do Projeto", "Tipo do Projeto", "Equipe do Projeto", "Informações do Projeto", "Status do Projeto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton_edit.setBackground(new java.awt.Color(153, 153, 153));
        jButton_edit.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_edit.setForeground(new java.awt.Color(0, 153, 153));
        jButton_edit.setText("Editar Projeto");
        jButton_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_edit.setPreferredSize(new java.awt.Dimension(95, 23));
        jButton_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editActionPerformed(evt);
            }
        });

        jButton_excluir.setBackground(new java.awt.Color(255, 0, 0));
        jButton_excluir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_excluir.setForeground(new java.awt.Color(51, 0, 0));
        jButton_excluir.setText("Excluir Projeto");
        jButton_excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_excluir.setPreferredSize(new java.awt.Dimension(95, 23));
        jButton_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_excluirActionPerformed(evt);
            }
        });

        jButton_NovoP.setBackground(new java.awt.Color(153, 153, 153));
        jButton_NovoP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_NovoP.setForeground(new java.awt.Color(0, 153, 153));
        jButton_NovoP.setText("Novo Projeto");
        jButton_NovoP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_NovoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NovoPActionPerformed(evt);
            }
        });

        jButton_attTabela.setBackground(new java.awt.Color(153, 153, 153));
        jButton_attTabela.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_attTabela.setForeground(new java.awt.Color(0, 153, 153));
        jButton_attTabela.setText("Atualizar a Tabela");
        jButton_attTabela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_attTabela.setPreferredSize(new java.awt.Dimension(95, 23));
        jButton_attTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_attTabelaActionPerformed(evt);
            }
        });

        jButton_comeback.setBackground(new java.awt.Color(102, 102, 102));
        jButton_comeback.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_comeback.setForeground(new java.awt.Color(135, 200, 200));
        jButton_comeback.setText("Voltar para Área do Funcionário");
        jButton_comeback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_comeback.setPreferredSize(new java.awt.Dimension(95, 23));
        jButton_comeback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_comebackActionPerformed(evt);
            }
        });

        jTextField_ID.setBackground(new java.awt.Color(200, 200, 200));
        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome do Projeto:");

        jTextField_nomeproj.setBackground(new java.awt.Color(200, 200, 200));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo do Projeto:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Equipe do Projeto:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Informações do projeto:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Status do Projeto:");

        jTextField_tipoproj.setBackground(new java.awt.Color(200, 200, 200));

        jTextField_equipeproj.setBackground(new java.awt.Color(200, 200, 200));

        jTextField_sttsproj.setBackground(new java.awt.Color(200, 200, 200));

        jTextArea_infoproj.setBackground(new java.awt.Color(200, 200, 200));
        jTextArea_infoproj.setColumns(20);
        jTextArea_infoproj.setRows(5);
        jScrollPane2.setViewportView(jTextArea_infoproj);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Limpar Campos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton_NovoP, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_attTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton_comeback, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField_nomeproj)
                                                .addComponent(jTextField_ID)
                                                .addComponent(jTextField_tipoproj)
                                                .addComponent(jTextField_equipeproj)
                                                .addComponent(jTextField_sttsproj, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(27, 27, 27))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_nomeproj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_tipoproj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_equipeproj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField_sttsproj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_NovoP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_attTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_comeback, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseClicked

        this.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_jLabel_minimizeMouseClicked

    private void jLabel_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseEntered

        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.white);

    }//GEN-LAST:event_jLabel_minimizeMouseEntered

    private void jLabel_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseExited

        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.black);

    }//GEN-LAST:event_jLabel_minimizeMouseExited

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked

        System.exit(0);

    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jLabel_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseEntered

        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.white);

    }//GEN-LAST:event_jLabel_closeMouseEntered

    private void jLabel_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseExited

        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_closeMouseExited

    private void jButton_NovoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NovoPActionPerformed
        
        //Insere um novo campo com as informações colocadas nos campos de texto
        
        
        if(verificarCampos()== true){
        try{
            
            String sql = "INSERT INTO `workshop`(`id_Projeto`, `Nome do Projeto`, `Tipo do Projeto`, `Equipe do Projeto`, `Info_Projeto`, `Status_Projeto`) VALUES (?,?,?,?,?,?)";
            
            Connection conn = TabelaWS.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField_ID.getText());
            pst.setString(2, jTextField_nomeproj.getText());
            pst.setString(3, jTextField_tipoproj.getText());
            pst.setString(4, jTextField_equipeproj.getText());
            pst.setString(5, jTextArea_infoproj.getText());
            pst.setString(6, jTextField_sttsproj.getText());
            
            
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Campo adicionado com Sucesso.");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " +e);
        }
        atualizarTabela();
        } else{
            try{
                String sql = "INSERT INTO `workshop`(`id_Projeto`, `Nome do Projeto`, `Tipo do Projeto`, `Equipe do Projeto`, `Info_Projeto`, `Status_Projeto`) VALUES (?,?,?,?,?,?)";
            
                Connection conn = TabelaWS.getConnection();
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.close();
                conn.close();
                pst.cancel();
            }catch (Exception e){
                
             JOptionPane.showMessageDialog(null, "Erro: " +e);
            }
        }
        
        
    }//GEN-LAST:event_jButton_NovoPActionPerformed

    private void jButton_attTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_attTabelaActionPerformed
        //Botão que atualiza a tabela
        atualizarTabela();
        
    }//GEN-LAST:event_jButton_attTabelaActionPerformed

    private void jButton_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_excluirActionPerformed
        //Botão que exclui uma linha da tabela
        int row = jTable1.getSelectedRow();
        
        if(row != -1){
            try{
            
            Connection conn = TabelaWS.getConnection();
            String sql = "DELETE FROM `workshop` WHERE Id_Projeto = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField_ID.getText());
            
            DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
            
            pst.execute();
            dm.removeRow(row);
            
            pst.close();
            conn.close();
            JOptionPane.showMessageDialog(null,"Excluído com Sucesso");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " +e);
        } 
   } else {
            JOptionPane.showMessageDialog(null, "Você não selecionou nenhuma linha");
        }
        atualizarTabela();
        
    }//GEN-LAST:event_jButton_excluirActionPerformed

    private void jButton_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editActionPerformed
        //Botão de editar
        if(verificarCampos()== true){
        try{
            
            String value1 = jTextField_ID.getText();
            String value2 = jTextField_nomeproj.getText();
            String value3 = jTextField_tipoproj.getText();
            String value4 = jTextField_equipeproj.getText();
            String value5 = jTextArea_infoproj.getText();
            String value6 = jTextField_sttsproj.getText();
            
            String sql = "UPDATE `workshop` SET `Id_Projeto`='"+ value1 +"', `Nome do Projeto`= '"+ value2 +"', `Tipo do Projeto`='"+ value3 +"', `Equipe do Projeto`='"+ value4 +"', `Info_Projeto`='"+ value5 +"', `Status_Projeto`='"+ value6 +"' WHERE `Id_Projeto`='" + value1 +"' ";
            
            Connection conn = TabelaWS.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Informações Atualizadas");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " +e);
        }
        atualizarTabela();
    } else {
            try{
                String value1 = jTextField_ID.getText();
                String value2 = jTextField_nomeproj.getText();
                String value3 = jTextField_tipoproj.getText();
                String value4 = jTextField_equipeproj.getText();
                String value5 = jTextArea_infoproj.getText();
                String value6 = jTextField_sttsproj.getText();
                String sql = "UPDATE `workshop` SET `Id_Projeto`='"+ value1 +"', `Nome do Projeto`= '"+ value2 +"', `Tipo do Projeto`='"+ value3 +"', `Equipe do Projeto`='"+ value4 +"', `Info_Projeto`='"+ value5 +"', `Status_Projeto`='"+ value6 +"' WHERE `Id_Projeto`='" + value1 +"' ";
            
                Connection conn = TabelaWS.getConnection();
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.close();
                conn.close();
                pst.cancel();
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,"Erro: " + e);
            }
        }
    }//GEN-LAST:event_jButton_editActionPerformed

    private void jButton_comebackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_comebackActionPerformed
        //Volta pra area do funcionario
        Work_Shop ws = new Work_Shop();
        ws.setVisible(true);
        ws.pack();
        ws.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
        
    }//GEN-LAST:event_jButton_comebackActionPerformed

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        PreparedStatement pst;
                
        try{
            int row = jTable1.getSelectedRow();
            String Table_click = (jTable1.getModel().getValueAt(row, 0).toString());
            
            Connection conn = TabelaWS.getConnection();
            String sql = "SELECT * FROM `workshop` WHERE `Id_Projeto`='"+Table_click+"' ";
            pst = conn.prepareStatement(sql);
            ResultSet rs;
            rs = pst.executeQuery();
            
            if(rs.next()) {
                
                String add1 = rs.getString("Id_Projeto");
                jTextField_ID.setText(add1);
                
                String add2 = rs.getString("Nome do Projeto");
                jTextField_nomeproj.setText(add2);
                
                String add3 = rs.getString("Tipo do Projeto");
                jTextField_tipoproj.setText(add3);
                
                String add4 = rs.getString("Equipe do Projeto");
                jTextField_equipeproj.setText(add4);
                
                String add5 = rs.getString("Info_Projeto");
                jTextArea_infoproj.setText(add5);
                
                String add6 = rs.getString("Status_Projeto");
                jTextField_sttsproj.setText(add6);
                
            }
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " +e);
        }
                
                
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Limpa os campos
        
        
        jTextField_ID.setText("");
        jTextField_ID.requestFocus();
        jTextField_nomeproj.setText("");
        jTextField_equipeproj.setText("");
        jTextField_tipoproj.setText("");
        jTextArea_infoproj.setText("");
        jTextField_sttsproj.setText("");
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Area_seguranca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Area_seguranca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Area_seguranca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Area_seguranca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Area_seguranca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_NovoP;
    private javax.swing.JButton jButton_attTabela;
    private javax.swing.JButton jButton_comeback;
    private javax.swing.JButton jButton_edit;
    private javax.swing.JButton jButton_excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_minimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea_infoproj;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_equipeproj;
    private javax.swing.JTextField jTextField_nomeproj;
    private javax.swing.JTextField jTextField_sttsproj;
    private javax.swing.JTextField jTextField_tipoproj;
    // End of variables declaration//GEN-END:variables
}