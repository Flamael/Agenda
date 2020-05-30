package view;

import dao.AgendamentoDAO;
import dao.AgendamentoDAOImpl;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import model.Agendamento;
import model.Usuario;

public final class Agenda extends javax.swing.JFrame {

    Usuario dados;
    String data, trocaData, dia, mes;
    String[] dataSeparada;
    char zero = '0';

    public Agenda(Usuario usuario) {
        initComponents();
        dados = usuario;
        readTable();
        tabelaAgenda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tabelaAgenda.setRowSelectionAllowed(true);
        blind();
    }

    public void blind() {
        labelData.setVisible(false);
        labelHorario.setVisible(false);
        labelDescricao.setVisible(false);
        labelBarra1.setVisible(false);
        labelBarra2.setVisible(false);
        campoDiaAlterado.setVisible(false);
        campoMesAlterado.setVisible(false);
        campoAnoAlterado.setVisible(false);
        campoHorarioAlterado.setVisible(false);
        campoDescricaoAlterado.setVisible(false);
        btnAtualizar.setVisible(false);
        btnEditar.setVisible(false);
        btnExcluir.setVisible(false);
    }

    public void appear() {
        labelData.setVisible(true);
        labelHorario.setVisible(true);
        labelDescricao.setVisible(true);
        labelBarra1.setVisible(true);
        labelBarra2.setVisible(true);
        campoDiaAlterado.setVisible(true);
        campoMesAlterado.setVisible(true);
        campoAnoAlterado.setVisible(true);
        campoHorarioAlterado.setVisible(true);
        campoDescricaoAlterado.setVisible(true);
        btnAtualizar.setVisible(true);
    }

    public void readTable() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaAgenda.getModel();
        modelo.setNumRows(0);
        AgendamentoDAO aDAO = new AgendamentoDAOImpl();

        aDAO.readById(dados.getId()).forEach((Agendamento agendamento) -> {
            data = agendamento.getDataAgendamento();
            dataSeparada = data.split("/");
            trocaData = dataSeparada[2] + "/" + dataSeparada[1] + "/" + dataSeparada[0];
            modelo.addRow(new Object[]{
                agendamento.getIdAgendamento(),
                trocaData,
                agendamento.getHoraAgendamento(),
                agendamento.getDescricao(),});
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAgenda = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        labelData = new javax.swing.JLabel();
        labelHorario = new javax.swing.JLabel();
        labelDescricao = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        campoHorarioAlterado = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoDescricaoAlterado = new javax.swing.JTextArea();
        campoDiaAlterado = new javax.swing.JTextField();
        labelBarra1 = new javax.swing.JLabel();
        campoMesAlterado = new javax.swing.JTextField();
        labelBarra2 = new javax.swing.JLabel();
        campoAnoAlterado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda - Lista");
        setResizable(false);

        tabelaAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Data", "Hora", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAgenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaAgenda.setRowSelectionAllowed(false);
        tabelaAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAgendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAgenda);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Agenda");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        labelData.setText("Data:");

        labelHorario.setText("Horário:");

        labelDescricao.setText("Descrição:");

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        try {
            campoHorarioAlterado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        campoDescricaoAlterado.setColumns(20);
        campoDescricaoAlterado.setRows(5);
        jScrollPane2.setViewportView(campoDescricaoAlterado);

        labelBarra1.setText("/");

        labelBarra2.setText("/");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addGap(333, 333, 333)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAtualizar)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoDiaAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelBarra1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoMesAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelBarra2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoAnoAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelHorario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoHorarioAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelData)
                    .addComponent(labelHorario)
                    .addComponent(campoHorarioAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDiaAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBarra1)
                    .addComponent(campoMesAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBarra2)
                    .addComponent(campoAnoAlterado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDescricao)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar)
                    .addComponent(btnVoltar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAgendaMouseClicked
        btnEditar.setVisible(true);
        btnExcluir.setVisible(true);
    }//GEN-LAST:event_tabelaAgendaMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        appear();
        btnEditar.setVisible(false);
        btnExcluir.setVisible(false);
        tabelaAgenda.setVisible(false);
        data = (String) tabelaAgenda.getValueAt(tabelaAgenda.getSelectedRow(), 1);
        dataSeparada = data.split("/");
        if (tabelaAgenda.getSelectedRow() != -1) {
            campoDiaAlterado.setText(dataSeparada[0]);
            campoMesAlterado.setText(dataSeparada[1]);
            campoAnoAlterado.setText(dataSeparada[2]);
            campoHorarioAlterado.setText((String) tabelaAgenda.getValueAt(tabelaAgenda.getSelectedRow(), 2));
            campoDescricaoAlterado.setText((String) tabelaAgenda.getValueAt(tabelaAgenda.getSelectedRow(), 3));
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    public void formatarData() {
        dia = campoDiaAlterado.getText();
        mes = campoMesAlterado.getText();

        if (dia.charAt(0) != zero && dia.length() < 2) {
            dia = "0" + campoDiaAlterado.getText();
        } else {
            dia = campoDiaAlterado.getText();
        }
        if (mes.charAt(0) != zero && mes.length() < 2) {
            mes = "0" + campoMesAlterado.getText();
        } else {
            mes = campoMesAlterado.getText();
        }
    }

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Agendamento agendamento = new Agendamento();
        AgendamentoDAO aDAO = new AgendamentoDAOImpl();

        if (campoAnoAlterado.getText().equals("") || campoMesAlterado.getText().equals("") || campoDiaAlterado.getText().equals("") || campoHorarioAlterado.getText().equals("  :  ") || campoDescricaoAlterado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            formatarData();
            agendamento.setDataAgendamento(campoAnoAlterado.getText() + "/" + mes + "/" + dia);
            agendamento.setHoraAgendamento(campoHorarioAlterado.getText());
            agendamento.setDescricao(campoDescricaoAlterado.getText());
            agendamento.setIdAgendamento((int) tabelaAgenda.getValueAt(tabelaAgenda.getSelectedRow(), 0));
            agendamento.setIdUsuario(dados.getId());
            aDAO.update(agendamento);
            blind();
            tabelaAgenda.setVisible(true);
            readTable();
        }

    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int id;
        AgendamentoDAO aDAO = new AgendamentoDAOImpl();
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja excluir?", "Excluir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            id = (int) tabelaAgenda.getValueAt(tabelaAgenda.getSelectedRow(), 0);
            aDAO.delete(id);
            readTable();
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        new Menu(dados).setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField campoAnoAlterado;
    private javax.swing.JTextArea campoDescricaoAlterado;
    private javax.swing.JTextField campoDiaAlterado;
    private javax.swing.JFormattedTextField campoHorarioAlterado;
    private javax.swing.JTextField campoMesAlterado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelBarra1;
    private javax.swing.JLabel labelBarra2;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelHorario;
    private javax.swing.JTable tabelaAgenda;
    // End of variables declaration//GEN-END:variables
}
