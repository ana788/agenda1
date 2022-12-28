package agenda.telas;

import agenda.classes.ConnectionFactory;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class TelaPrincipal extends javax.swing.JFrame {

    Connection con;
    String nome, dia_f;
    private static final long serialVersionUID = 1L;


    public TelaPrincipal() {
        super("Principal");
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jCalendar3 = new com.toedter.calendar.JCalendar();
        ldia = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dados = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        sistema = new javax.swing.JMenu();
        aLogin = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        compromisso = new javax.swing.JMenu();
        contato = new javax.swing.JMenu();
        grupo = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Bodoni Bk BT", 0, 20)); // NOI18N
        jButton2.setText("Apagar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCalendar3.setDecorationBackgroundColor(new java.awt.Color(50, 130, 176));
        jCalendar3.setFont(new java.awt.Font("Bodoni MT", 1, 20)); // NOI18N
        jCalendar3.setSundayForeground(new java.awt.Color(255, 255, 255));
        jCalendar3.setWeekOfYearVisible(false);
        jCalendar3.setWeekdayForeground(new java.awt.Color(255, 255, 255));

        ldia.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        ldia.setText("Compromissos do dia -");
        ldia.setMaximumSize(new java.awt.Dimension(250, 60));

        jButton1.setFont(new java.awt.Font("Bodoni Bk BT", 0, 20)); // NOI18N
        jButton1.setText("Selecionar Dia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dados.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        dados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Título", "Descrição", "Data", "Hora Inicial", "Hora Final"
            }
        ));
        dados.setGridColor(new java.awt.Color(0, 102, 153));
        dados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dados);

        jMenuBar1.setFont(new java.awt.Font("Bodoni Bd BT", 0, 12)); // NOI18N
        jMenuBar1.setMaximumSize(new java.awt.Dimension(1980, 60));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(109, 60));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(304, 60));

        sistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenda/Icones/configuracoes.png"))); // NOI18N
        sistema.setText("Sistema");

        aLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_DOWN_MASK));
        aLogin.setText("Alterar Login");
        aLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aLoginActionPerformed(evt);
            }
        });
        sistema.add(aLogin);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        sistema.add(jMenuItem2);

        jMenuBar1.add(sistema);

        compromisso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenda/Icones/calendario.png"))); // NOI18N
        compromisso.setText("Compromissos");
        compromisso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compromissoMouseClicked(evt);
            }
        });
        jMenuBar1.add(compromisso);

        contato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenda/Icones/contato.png"))); // NOI18N
        contato.setText("Contatos");
        contato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contatoMouseClicked(evt);
            }
        });
        jMenuBar1.add(contato);

        grupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenda/Icones/grupos.png"))); // NOI18N
        grupo.setText("Grupos");
        grupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grupoMouseClicked(evt);
            }
        });
        jMenuBar1.add(grupo);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenda/Icones/fechar.png"))); // NOI18N
        jMenu1.setText("Sair");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCalendar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ldia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(ldia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCalendar3, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                        .addGap(13, 13, 13)))
                .addComponent(jButton2)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void compromissoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compromissoMouseClicked
        TelaCompromisso tCompromisso = new TelaCompromisso();
        tCompromisso.setLocationRelativeTo(null);
        tCompromisso.setResizable(false);
        tCompromisso.setVisible(true);
    }//GEN-LAST:event_compromissoMouseClicked

    private void contatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contatoMouseClicked
        TelaCriarContato tcContato = new TelaCriarContato();
        
        tcContato.setLocationRelativeTo(null);
        tcContato.setResizable(false);
        tcContato.setVisible(true);
    }//GEN-LAST:event_contatoMouseClicked

    private void grupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grupoMouseClicked
        TelaCriarGrupo tGrupo = new TelaCriarGrupo();
        tGrupo.setLocationRelativeTo(null);
        tGrupo.setResizable(false);
        tGrupo.setVisible(true);
    }//GEN-LAST:event_grupoMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void aLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aLoginActionPerformed
        this.setVisible(false);
        TelaLogin tLogin = new TelaLogin();

        tLogin.setVisible(true);
        tLogin.setLocationRelativeTo(null);
        tLogin.setResizable(false);
    }//GEN-LAST:event_aLoginActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
//      this.setLocationRelativeTo(null);
        this.setResizable(false);

        Date dataDeInscricao = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd");
        Date calendar = dataDeInscricao;
        String dia_f = formatter.format(calendar.getTime());

        Date dataentrada = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date c = dataentrada;
        String data = f.format(c.getTime());
        ldia.setText("Compromissos do dia - " + dia_f);
        listar(data);
        


    }//GEN-LAST:event_formPropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String query = "DELETE FROM COMPROMISSOS WHERE TITULO = ?;";
        PreparedStatement ps;
        ResultSet rs;

        try {
            ConnectionFactory cf = new ConnectionFactory();
            con = cf.getConnection();
            con.setAutoCommit(false);
            ps = (PreparedStatement) con.prepareStatement(query);
            ps.setString(1, this.nome);
            ps.execute();
            con.commit();

            ps.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        Date dataentrada = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date c = dataentrada;
        String data = f.format(c.getTime());

        listar(data);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Date dia = jCalendar3.getDate();
        SimpleDateFormat formatter = new SimpleDateFormat("dd");
        Date calendar = dia;
        this.dia_f = formatter.format(calendar.getTime());

        ldia.setText("Compromissos do dia - " + this.dia_f);
        //        ===========================================================
        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
        Date calendar2 = dia;
        String data = form.format(calendar2.getTime());
        //        ===============================================================
        listar(data);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void dadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dadosMouseClicked
        this.nome = (String) dados.getValueAt(dados.getSelectedRow(), 0);
    }//GEN-LAST:event_dadosMouseClicked

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aLogin;
    private javax.swing.JMenu compromisso;
    private javax.swing.JMenu contato;
    private javax.swing.JTable dados;
    private javax.swing.JMenu grupo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JCalendar jCalendar3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel ldia;
    private javax.swing.JMenu sistema;
    // End of variables declaration//GEN-END:variables

    private void listar(String dia_f) {
        String query = "SELECT ID_USUARIO FROM LOGS_LOGIN ORDER BY ID_LOG DESC LIMIT 1";
        String query2 = "SELECT TITULO, DESCRICAO, DATA_COMPROMISSO, HORA_INICIAL, HORA_FINAL from COMPROMISSOS WHERE DATA_COMPROMISSO = ?;";
        PreparedStatement ps;
        ResultSet rs;
        try {
            ConnectionFactory cf = new ConnectionFactory();
            con = cf.getConnection();
            con.setAutoCommit(false);
           
            
            ps = (PreparedStatement) con.prepareStatement(query2);
            ps.setString(1, dia_f);

            rs = ps.executeQuery();
            con.commit();
            DefaultTableModel modelo = (DefaultTableModel) dados.getModel();
            modelo.setNumRows(0);

            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getString("TITULO"), rs.getString("DESCRICAO"), rs.getDate("DATA_COMPROMISSO"), rs.getString("HORA_INICIAL"), rs.getString("HORA_FINAL")});
            }

            ps.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }


}
