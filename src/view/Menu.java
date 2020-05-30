package view;

import dao.UsuarioDAO;
import dao.UsuarioDAOImpl;
import javax.swing.JOptionPane;
import model.Usuario;

public final class Menu extends javax.swing.JFrame {

    Usuario dados;

    public Menu(Usuario usuario) {
        dados = usuario;
        initComponents();
        blind();
    }

    public void blind() {
        labelNome.setVisible(false);
        labelEmail.setVisible(false);
        labelSenha.setVisible(false);
        campoNomeAlterado.setVisible(false);
        campoEmailAlterado.setVisible(false);
        campoSenhaAlterado.setVisible(false);
        btnAtualizar.setVisible(false);
    }

    public void appear() {
        labelNome.setVisible(true);
        labelEmail.setVisible(true);
        labelSenha.setVisible(true);
        campoNomeAlterado.setVisible(true);
        campoEmailAlterado.setVisible(true);
        campoSenhaAlterado.setVisible(true);
        btnAtualizar.setVisible(true);
        btnAlterar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSair = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        labelNome = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        campoNomeAlterado = new javax.swing.JTextField();
        campoEmailAlterado = new javax.swing.JTextField();
        campoSenhaAlterado = new javax.swing.JPasswordField();
        btnAtualizar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAgendar = new javax.swing.JMenu();
        menuListar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda - Menu");
        setResizable(false);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar Perfil");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        labelNome.setText("Nome:");

        labelEmail.setText("Email:");

        labelSenha.setText("Senha:");

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        menuAgendar.setText("Agendar");
        menuAgendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAgendarMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuAgendar);

        menuListar.setText("Listar");
        menuListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuListarMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuListar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAtualizar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNome)
                            .addComponent(labelEmail)
                            .addComponent(labelSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(campoEmailAlterado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                            .addComponent(campoSenhaAlterado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNomeAlterado))
                        .addGap(0, 83, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAlterar)
                            .addComponent(btnSair))))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnAlterar)
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(campoNomeAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEmailAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoSenhaAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnAtualizar)
                .addGap(187, 187, 187)
                .addComponent(btnSair)
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuAgendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAgendarMouseClicked
        dispose();
        new Calendario(dados).setVisible(true);
    }//GEN-LAST:event_menuAgendarMouseClicked

    private void menuListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuListarMouseClicked
        dispose();
        new Agenda(dados).setVisible(true);
    }//GEN-LAST:event_menuListarMouseClicked

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        appear();
        campoNomeAlterado.setText(dados.getNome());
        campoEmailAlterado.setText(dados.getEmail());
        campoSenhaAlterado.setText(dados.getSenha());
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Usuario usuario = new Usuario();
        UsuarioDAO uDAO = new UsuarioDAOImpl();
        if (campoNomeAlterado.getText().equals("") || campoEmailAlterado.getText().equals("") || campoSenhaAlterado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            usuario.setNome(campoNomeAlterado.getText());
            usuario.setEmail(campoEmailAlterado.getText());
            usuario.setSenha(campoSenhaAlterado.getText());
            usuario.setId(dados.getId());
            uDAO.update(usuario);
            dispose();
            new Login().setVisible(true);
        }

    }//GEN-LAST:event_btnAtualizarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnSair;
    private javax.swing.JTextField campoEmailAlterado;
    private javax.swing.JTextField campoNomeAlterado;
    private javax.swing.JPasswordField campoSenhaAlterado;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JMenu menuAgendar;
    private javax.swing.JMenu menuListar;
    // End of variables declaration//GEN-END:variables
}
