package agenda.telas;

import agenda.classes.ConnectionFactory;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaCriarLogin extends javax.swing.JFrame {

    Connection con;
    private int idus;

    public TelaCriarLogin() {
        super("Criar Usuário");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tusuario = new javax.swing.JTextField();
        btFechar = new javax.swing.JButton();
        lErro = new javax.swing.JLabel();
        tsenha = new javax.swing.JPasswordField();
        bttsalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 48)); // NOI18N
        jLabel1.setText("Criar Login");

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel2.setText("Usuário");

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel3.setText("Senha ");

        btFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenda/Icones/fechar.png"))); // NOI18N
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        lErro.setForeground(new java.awt.Color(215, 5, 5));

        bttsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenda/Icones/salvar.png"))); // NOI18N
        bttsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttsalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                        .addComponent(bttsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tusuario)
                            .addComponent(tsenha))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lErro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        ImageIcon icon = new ImageIcon("src/agenda/Icones/fechar.png");
        
        int input = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar?", "Cancelar Cadastro",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
        if (input == 0) {
            cancelarUltimoUsuario();
        }
    }//GEN-LAST:event_btFecharActionPerformed

    private void bttsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttsalvarActionPerformed
        int id = selectId();
        if ("".equals(tusuario.getText()) || "".equals(tsenha.getPassword())) {
            lErro.setText("Usuário e senha vazios");
        } else {
            if (id == 0) {
                JOptionPane.showMessageDialog(null, "Infelizmente tivemos um problema com banco de dados. \n Por favor faça novamento o cadastro do usuário!");
                voltartelausuario();
            } else if (id != 0) {
                lErro.setText("");
                try {
                    MessageDigest cryptSenha = MessageDigest.getInstance("SHA-256");
                    byte messageDigestSenha[] = cryptSenha.digest(String.valueOf(this.tsenha.getPassword()).getBytes("UTF-8"));

                    StringBuilder hexString = new StringBuilder();
                    for (byte b : messageDigestSenha) {
                        hexString.append(String.format("%02X", 0xFF & b));
                    }
                    String senha_crip = hexString.toString();
                    String query = "INSERT INTO LOGIN(ID_USUARIO, USUARIO, SENHA, FLAG)VALUES(?, ?, ?, ?);";

                    PreparedStatement ps;
                    ResultSet rs;

                    try {

                        ConnectionFactory cf = new ConnectionFactory();
                        con = cf.getConnection();
                        con.setAutoCommit(false);
                        ps = con.prepareStatement(query);

                        ps.setInt(1, id);
                        ps.setString(2, tusuario.getText());
                        ps.setString(3, senha_crip);
                        ps.setInt(4, 0);

                        ps.execute();
                        con.commit();

                        JOptionPane.showMessageDialog(null, "Login e senha cadastrado com sucesso!");
                    } catch (SQLException ex) {
                        System.out.println("Erro SQL");
                    }
                    this.setVisible(false);
                    TelaLogin tLogin = new TelaLogin();
                    tLogin.setVisible(true);

                } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
                    Logger.getLogger(TelaCriarLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_bttsalvarActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        bttsalvar.setBorderPainted(false);
        bttsalvar.setContentAreaFilled(false);
        bttsalvar.setFocusPainted(false);
        btFechar.setBorderPainted(false);
        btFechar.setContentAreaFilled(false);
        btFechar.setFocusPainted(false);

        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }//GEN-LAST:event_formPropertyChange

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new TelaCriarLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFechar;
    private javax.swing.JButton bttsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lErro;
    private javax.swing.JPasswordField tsenha;
    private javax.swing.JTextField tusuario;
    // End of variables declaration//GEN-END:variables

    private int selectId() {
        String query = "SELECT MAX(ID_USUARIO) as 'ultimo_id' FROM USUARIO;";
        PreparedStatement ps;
        ResultSet rs;

        try {
            ConnectionFactory cf = new ConnectionFactory();
            con = cf.getConnection();
            con.setAutoCommit(false);
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            con.commit();

            while (rs.next()) {
                this.idus = rs.getInt("ultimo_id");
                return rs.getInt("ultimo_id");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return 0;

    }

    private void cancelarUltimoUsuario() {
        int id = selectId();
        String query = "DELETE FROM USUARIO WHERE ID_USUARIO = ?;";

        PreparedStatement ps;
        ResultSet rs;

        try {

            ConnectionFactory cf = new ConnectionFactory();
            con = cf.getConnection();
            con.setAutoCommit(false);
            ps = con.prepareStatement(query);

            ps.setInt(1, id);
            ps.execute();
            con.commit();

        } catch (SQLException ex) {
            System.out.println("Erro SQL");
        }
        TelaLogin tLogin = new TelaLogin();
        this.setVisible(false);
        tLogin.setVisible(true);
        tLogin.setLocationRelativeTo(null);
        tLogin.setResizable(false);

    }

    private void voltartelausuario() {
        TelaCriarUsuario tUsuario = new TelaCriarUsuario();
        this.setVisible(false);
        tUsuario.setLocationRelativeTo(null);
        tUsuario.setVisible(true);
    }

}
