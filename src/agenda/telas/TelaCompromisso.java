package agenda.telas;

import agenda.classes.ConnectionFactory;
import agenda.classes.Contato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.text.BadLocationException;

/**
 *
 * @author cg3021157
 */
public class TelaCompromisso extends javax.swing.JFrame {

    TelaPrincipal tCalen;
    Connection con;
    boolean validar = false;
    static Contato cc;
    static ArrayList<Contato> contatos = new ArrayList<>();

    public TelaCompromisso() {
        super("Compromisso");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricao = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        local = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tipoComp = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        Date date = new Date();
        SpinnerDateModel sm =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        jSpinner1 = new javax.swing.JSpinner(sm);
        Date date2 = new Date();
        SpinnerDateModel sm2 =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        jSpinner2 = new javax.swing.JSpinner(sm2);
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bttsalvar = new javax.swing.JButton();
        bttvoltar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaContatos = new javax.swing.JTextArea();
        bttAdicionar = new javax.swing.JButton();
        jTextFieldPesquisar = new javax.swing.JTextField();
        limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel3.setText("Descrição:");

        descricao.setColumns(20);
        descricao.setRows(5);
        jScrollPane1.setViewportView(descricao);

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel4.setText("Data Início:");

        jLabel5.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel5.setText("Data Fim:");

        jLabel6.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel6.setText("Local:");

        jLabel8.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel8.setText("Tipo:");

        tipoComp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pessoal", "Profissional", "Acadêmico" }));
        tipoComp.setSelectedIndex(countComponents());
        tipoComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoCompActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("dd-MM-yyyy");

        JSpinner.DateEditor de = new JSpinner.DateEditor(jSpinner1, "HH:mm");
        jSpinner1.setEditor(de);

        JSpinner.DateEditor de2 = new JSpinner.DateEditor(jSpinner2, "HH:mm");
        jSpinner2.setEditor(de2);

        jLabel9.setText("h");

        jLabel10.setText("h");

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 48)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenda/Icones/calendario.png"))); // NOI18N
        jLabel2.setText("Compromisso");

        bttsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenda/Icones/salvar.png"))); // NOI18N
        bttsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttsalvarActionPerformed(evt);
            }
        });

        bttvoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenda/Icones/Voltar.png"))); // NOI18N
        bttvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttvoltarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel7.setText("Adicionar Participante");

        jTextAreaContatos.setColumns(20);
        jTextAreaContatos.setRows(5);
        jTextAreaContatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTextAreaContatos);

        bttAdicionar.setText("+");
        bttAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAdicionarActionPerformed(evt);
            }
        });

        jTextFieldPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SoltarTecla(evt);
            }
        });

        limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenda/Icones/limpar.png"))); // NOI18N
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttAdicionar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bttvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 30, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titulo)
                                    .addComponent(local)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSpinner2, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                            .addComponent(jSpinner1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1)
                                    .addComponent(tipoComp, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(local, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(bttAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bttsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(limpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipoCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoCompActionPerformed
        String itemSelecionado = tipoComp.getSelectedItem().toString();
    }//GEN-LAST:event_tipoCompActionPerformed

    private void bttsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttsalvarActionPerformed
        String query = "SELECT ID_USUARIO FROM LOGS_LOGIN ORDER BY ID_LOG DESC LIMIT 1;";
        String query2 = "INSERT INTO COMPROMISSOS VALUES(default,  ?, ?, ?, ?, ?, ?, ?, ?);";
        String query3 = "SELECT ID_COMPROMISSOS FROM COMPROMISSOS ORDER BY ID_COMPROMISSOS DESC LIMIT 1;";
        String query4 = "SELECT ID_CONTATO FROM CONTATO WHERE PNOME = ? AND SNOME = ?;";
        String query5 = "INSERT INTO CONTATOCOMPROMISSO VALUES(?, ?);";

        PreparedStatement ps;
        ResultSet rs;

        try {
            ConnectionFactory cf = new ConnectionFactory();
            con = cf.getConnection();
            con.setAutoCommit(false);
            
            //Pegar último valor de id_usuario que fez login
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            int user = 0;
            
            while(rs.next()){
                user = rs.getInt("id_usuario");
            }

            //Inserir na tabela compromisso
            ps = con.prepareStatement(query2);

            ps.setInt(1, user);
            ps.setString(2, titulo.getText());
            ps.setString(3, descricao.getText());
            ps.setString(4, tipoComp.getSelectedItem().toString());
            ps.setString(5, local.getText());

            java.util.Date dataUtil1 = jDateChooser1.getDate();
            java.sql.Date dataSql1 = new java.sql.Date(dataUtil1.getTime());
            ps.setDate(6, dataSql1);

            Date agora = (Date) jSpinner1.getValue();
            SimpleDateFormat formata;
            formata = new SimpleDateFormat("hh:mm");
            String hora = formata.format(agora);

            ps.setObject(7, hora);
            Date agora2 = (Date) jSpinner2.getValue();
            SimpleDateFormat formt;
            formt = new SimpleDateFormat("hh:mm");
            String hora2 = formt.format(agora2);

            ps.setObject(8, hora2);
            ps.execute();
            
            //Pegar id_compromisso
            ps = con.prepareStatement(query3);
            rs = ps.executeQuery();
            int id_compromissos = 0;
            
            while (rs.next()) {
                id_compromissos = rs.getInt("id_compromissos");
            }
            System.out.println(id_compromissos);
            
            //Pegar id do contato selecionado
            int id_contato = 0;
            for(int i = 0; i < contatos.size(); i++){
                ps = con.prepareStatement(query4);
                ps.setString(1, contatos.get(i).getPnome());
                ps.setString(2, contatos.get(i).getSobrenome());
                rs = ps.executeQuery();
                
                while (rs.next()) {
                    id_contato = rs.getInt("id_contato");
                }
                System.out.println(id_contato);
            
                //Inserir no contatocompromisso
                ps = con.prepareStatement(query5);
                ps.setInt(1, id_contato);
                ps.setInt(2, id_compromissos);
                
                ps.execute();
            }
            
            con.commit();

            ps.close();

            JOptionPane.showMessageDialog(null, "Compromisso cadastrado com sucesso");


        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_bttsalvarActionPerformed

    private void bttvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttvoltarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bttvoltarActionPerformed

    private void SoltarTecla(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SoltarTecla
        ArrayList<Contato> contatos1 = new ArrayList<>();
        String query = "SELECT * FROM CONTATO";
        PreparedStatement ps;
        ResultSet rs;
        jTextAreaContatos.setText("");

        try {
            con = ConnectionFactory.getConnection();
            con.setAutoCommit(false);
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            con.commit();
            String pnome = "", snome = "";
            while (rs.next()) {
                pnome = rs.getString("pnome");
                snome = rs.getString("snome");
        
                if((pnome.toLowerCase().contains(jTextFieldPesquisar.getText().toLowerCase())) || (snome.toLowerCase().contains(jTextFieldPesquisar.getText().toLowerCase()))){
                    Contato c = new Contato(pnome, snome);
                    contatos1.add(c);
                }
                /*else{
                     pnome = "";
                     snome = "";
                }*/
            }
            
            ps.close();
            for (int i = 0; i < contatos1.size(); i++) {
                jTextAreaContatos.setText(jTextAreaContatos.getText() + contatos1.get(i).getPnome() + " "
                        + contatos1.get(i).getSobrenome() + "\n");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_SoltarTecla

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        limparDados();
    }//GEN-LAST:event_limparActionPerformed

    private void bttAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttAdicionarActionPerformed
        contatos.add(cc);
        JOptionPane.showMessageDialog(null, "Contato adicionado com sucesso!");
    }//GEN-LAST:event_bttAdicionarActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange

        bttsalvar.setBorderPainted(false);
        bttsalvar.setContentAreaFilled(false);
        bttsalvar.setFocusPainted(false);
        bttvoltar.setBorderPainted(false);
        bttvoltar.setContentAreaFilled(false);
        bttvoltar.setFocusPainted(false);
        limpar.setBorderPainted(false);
        limpar.setContentAreaFilled(false);
        limpar.setFocusPainted(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_formPropertyChange

    private void txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMouseClicked
       try {
            // descubro qual linha foi clicada
            int linha = this.jTextAreaContatos.getLineOfOffset(jTextAreaContatos.getCaretPosition());
            // defino o inicio do texto dessa linha
            int inicio = jTextAreaContatos.getLineStartOffset(linha);
            // defino o final da linha
            int fim = jTextAreaContatos.getLineEndOffset(linha);

            //gero um string a partir a linha que foi clicada
            String s = jTextAreaContatos.getDocument().getText(inicio, fim - inicio - 1);
            String nome[] = s.split(" ");
            cc = new Contato(nome[0], nome[1]);
         
            this.jTextAreaContatos.setText(s);

            this.jTextAreaContatos.select(inicio, fim - 1);

        } catch (BadLocationException ex) {
            Logger.getLogger(TelaCompromisso.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_txtMouseClicked

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
            java.util.logging.Logger.getLogger(TelaCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCompromisso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttAdicionar;
    private javax.swing.JButton bttsalvar;
    private javax.swing.JButton bttvoltar;
    private javax.swing.JTextArea descricao;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextArea jTextAreaContatos;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JButton limpar;
    private javax.swing.JTextField local;
    private javax.swing.JComboBox<String> tipoComp;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables

    void setAuxiliar(TelaPrincipal tCalen) {
        this.tCalen = tCalen;
    }

    public void limparDados() {
        contatos.clear();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        Date date = cal.getTime();

        titulo.setText("");
        descricao.setText("");
        jDateChooser1.setCalendar(null);
        jDateChooser2.setCalendar(null);
        jSpinner1.setValue(date);
        jSpinner2.setValue(date);
        local.setText("");
        tipoComp.setSelectedIndex(0);
        jTextFieldPesquisar.setText("");
        jTextAreaContatos.setText("");
    }

}
