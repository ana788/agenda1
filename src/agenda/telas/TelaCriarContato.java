package agenda.telas;

import agenda.classes.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class TelaCriarContato extends javax.swing.JFrame {

    Connection con;
    private int idus;
    String data_formatada;
    int num;

    public TelaCriarContato() {
        initComponents();
        grupos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sobrenome = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        logradouro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bairro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        estado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        email1 = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        email2 = new javax.swing.JTextField();
        lErro = new javax.swing.JLabel();
        bttsalvar = new javax.swing.JButton();
        bttvoltar = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        dataNasc = new javax.swing.JFormattedTextField();
        celular = new javax.swing.JFormattedTextField();
        telefone = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jbox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(859, 560));
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bodoni Bk BT", 1, 48)); // NOI18N
        jLabel1.setText("Cadastrar Novo Contato");

        jLabel2.setFont(new java.awt.Font("Bodoni Bk BT", 0, 18)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Bodoni Bk BT", 0, 18)); // NOI18N
        jLabel3.setText("Sobrenome");

        jLabel4.setFont(new java.awt.Font("Bodoni Bk BT", 0, 18)); // NOI18N
        jLabel4.setText("Data de Nascimento");

        jLabel5.setFont(new java.awt.Font("Bodoni Bk BT", 0, 18)); // NOI18N
        jLabel5.setText("Logradouro");

        jLabel7.setFont(new java.awt.Font("Bodoni Bk BT", 0, 18)); // NOI18N
        jLabel7.setText("Número");

        jLabel8.setFont(new java.awt.Font("Bodoni Bk BT", 0, 18)); // NOI18N
        jLabel8.setText("Bairro");

        jLabel10.setFont(new java.awt.Font("Bodoni Bk BT", 0, 18)); // NOI18N
        jLabel10.setText("Cidade");

        jLabel11.setFont(new java.awt.Font("Bodoni Bk BT", 0, 18)); // NOI18N
        jLabel11.setText("Estado");

        jLabel12.setFont(new java.awt.Font("Bodoni Bk BT", 0, 18)); // NOI18N
        jLabel12.setText("Celular");

        jLabel13.setFont(new java.awt.Font("Bodoni Bk BT", 0, 18)); // NOI18N
        jLabel13.setText("Telefone");

        jLabel14.setFont(new java.awt.Font("Bodoni Bk BT", 0, 18)); // NOI18N
        jLabel14.setText("Email 1");

        email.setFont(new java.awt.Font("Bodoni Bk BT", 0, 18)); // NOI18N
        email.setText("Email 2");

        lErro.setFont(new java.awt.Font("Bodoni Bk BT", 0, 18)); // NOI18N
        lErro.setForeground(new java.awt.Color(204, 0, 51));

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

        limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agenda/Icones/limpar.png"))); // NOI18N
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        dataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        dataNasc.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel9.setFont(new java.awt.Font("Bodoni Bk BT", 0, 18)); // NOI18N
        jLabel9.setText("Grupos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bttvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bttsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(logradouro))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bairro))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(cidade)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lErro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(celular, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(telefone))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(email)
                                        .addGap(18, 18, 18)
                                        .addComponent(email2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel1)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email)
                    .addComponent(email2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lErro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(bttvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(bttsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

        this.setLocationRelativeTo(null);
        this.setResizable(false);

        try {
            MaskFormatter mascaraData = new MaskFormatter("##-##-####");
            mascaraData.install(dataNasc);
            MaskFormatter mascaraCelular = new MaskFormatter("(##)#####-####");
            mascaraCelular.install(celular);
            MaskFormatter mascaraTelefone = new MaskFormatter("(##)#####-####");
            mascaraTelefone.install(telefone);
        } catch (ParseException ex) {
            Logger.getLogger(TelaCriarContato.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_formPropertyChange

    private void bttsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttsalvarActionPerformed

        if ("".equals(nome.getText()) || "".equals(sobrenome.getText()) || "".equals(celular.getText())) {
            lErro.setText("Campos Nome, Sobrenome e celular não podem estar vazios");
        } else if (validarTelefone(celular.getText()) == false) {
            lErro.setText("Número celular inválido");
        } else {

            lErro.setText("");
            String data = dataNasc.getText();

            if ("  -  -    ".equals(data) || data == null || "".equals(data)) {
                data_formatada = "0000-00-00";
            } else {
                String dt[] = new String[3];
                dt = data.split("-");
                data_formatada = dt[2] + "-" + dt[1] + "-" + dt[0];
            }

            String query = "INSERT INTO CONTATO(ID_CONTATO,PNOME, SNOME, DATANASC, LOGRADOURO, NUMERO, BAIRRO, CIDADE, ESTADO, CELULAR, TELEFONE, EMAIL_PRINCIPAL, EMAIL_ALTERNATIVO, ID_GRUPO)VALUES(default, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?);";

            PreparedStatement ps;
            ResultSet rs;

            try {

                ConnectionFactory cf = new ConnectionFactory();
                con = cf.getConnection();
                con.setAutoCommit(false);
                ps = con.prepareStatement(query);

                ps.setString(1, nome.getText());
                ps.setString(2, sobrenome.getText());
                ps.setString(3, data_formatada);
                ps.setString(4, logradouro.getText());
                if ("".equals(numero.getText()) || numero.getText() == null) {
                    num = 0;
                } else {
                    num = Integer.parseInt(numero.getText());
                }
                ps.setInt(5, num);
                ps.setString(6, bairro.getText());
                ps.setString(7, cidade.getText());
                ps.setString(8, estado.getText());
                ps.setString(9, celular.getText());
                ps.setString(10, telefone.getText());
                ps.setString(11, email1.getText());
                ps.setString(12, email2.getText());
                String itemSelecionado = jbox.getSelectedItem().toString();
                ps.setString(13, itemSelecionado);
                ps.execute();
                con.commit();

                JOptionPane.showMessageDialog(null, "Contato cadastrado com sucesso");

                limpardados();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

        }


    }//GEN-LAST:event_bttsalvarActionPerformed

    private void bttvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttvoltarActionPerformed

        this.setVisible(false);

    }//GEN-LAST:event_bttvoltarActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        limpardados();
    }//GEN-LAST:event_limparActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCriarContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCriarContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCriarContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCriarContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCriarContato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairro;
    private javax.swing.JButton bttsalvar;
    private javax.swing.JButton bttvoltar;
    private javax.swing.JFormattedTextField celular;
    private javax.swing.JTextField cidade;
    private javax.swing.JFormattedTextField dataNasc;
    private javax.swing.JLabel email;
    private javax.swing.JTextField email1;
    private javax.swing.JTextField email2;
    private javax.swing.JTextField estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jbox;
    private javax.swing.JLabel lErro;
    private javax.swing.JButton limpar;
    private javax.swing.JTextField logradouro;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField sobrenome;
    private javax.swing.JFormattedTextField telefone;
    // End of variables declaration//GEN-END:variables

    private void selectId() {
        String query = "SELECT MAX(ID_USUARIO)+ 1 FROM LOGIN;";
        PreparedStatement ps;
        ResultSet rs;

        try {
            ConnectionFactory cf = new ConnectionFactory();
            con = cf.getConnection();
            con.setAutoCommit(false);
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            con.commit();

            int idUsuario = rs.getInt("ID_USUARIO");
            this.idus = idUsuario;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public static boolean isValidEmailAddressRegex(String email) {
        boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isEmailIdValid = true;
            }
        }
        return isEmailIdValid;
    }

    private boolean validarTelefone(String telefone) {

        //retira todos os caracteres não-numéricos (incluindo espaço,tab, etc)
        telefone = telefone.replaceAll("\\D", "");

        //verifica se tem a qtde de numeros correta
        if (!(telefone.length() >= 10 && telefone.length() <= 11)) {
            return false;
        }

        //Se tiver 11 caracteres, verificar se começa com 9 o celular
        if (telefone.length() == 11 && Integer.parseInt(telefone.substring(2, 3)) != 9) {
            return false;
        }

        //verifica se o numero foi digitado com todos os dígitos iguais
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(telefone.charAt(0) + "{" + telefone.length() + "}");
        java.util.regex.Matcher m = p.matcher(telefone);
        if (m.find()) {
            return false;
        }

//        //se passar por todas as validações acima, então está tudo certo
        return true;
    }

    private void limpardados() {
        nome.setText("");
        sobrenome.setText("");
        dataNasc.setText("");
        logradouro.setText("");
        numero.setText("");
        bairro.setText("");
        cidade.setText("");
        estado.setText("");
        celular.setText("");
        telefone.setText("");
        email1.setText("");
        email2.setText("");

    }

    private void grupos() {
        String query = "SELECT NOMEC from GRUPO;";
        PreparedStatement ps;
        ResultSet rs;
        try {
            ConnectionFactory cf = new ConnectionFactory();
            con = cf.getConnection();
            con.setAutoCommit(false);
            ps = con.prepareStatement(query);

            rs = ps.executeQuery();
            con.commit();

            String nomes = "";

            while (rs.next()) {

                nomes = rs.getString("NOMEC");
                jbox.addItem(nomes);

            }

            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
