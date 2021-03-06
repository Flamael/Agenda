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
        //blind();
        btnExcluir.setVisible(false);
    }

    /*public void blind() {
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
    }*/

    /*public void appear() {
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
    }*/

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
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnVoltar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAgendaMouseClicked
        //btnEditar.setVisible(true);
        btnExcluir.setVisible(true);
    }//GEN-LAST:event_tabelaAgendaMouseClicked
/*
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
*/
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int id;
        AgendamentoDAO aDAO = new AgendamentoDAOImpl();
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja excluir?", "Excluir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            id = (int) tabelaAgenda.getValueAt(tabelaAgenda.getSelectedRow(), 0);
            aDAO.delete(id);
            //btnEditar.setVisible(false);
            btnExcluir.setVisible(false);
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
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaAgenda;
    // End of variables declaration//GEN-END:variables
}
