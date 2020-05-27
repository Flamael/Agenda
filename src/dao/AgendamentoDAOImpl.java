package dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Agendamento;

public class AgendamentoDAOImpl implements AgendamentoDAO{
    
        @Override
        public void create(Agendamento agendamento){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            
            try {
                stmt = con.prepareStatement("INSERT INTO agendamento (id_usuario, descricao, data_agendamento, hora_agendamento) VALUES (?, ?, ?, ?)");
                stmt.setInt(1, agendamento.getId_usuario());
                stmt.setString(2, agendamento.getDescricao());
                stmt.setString(3, agendamento.getData_agendamento());
                stmt.setString(4, agendamento.getHora_agendamnto());
                JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            } catch(SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
            } finally {
                ConnectionFactory.closeConnection(con, stmt);
            }
            
        }
        
        @Override
        public List<Agendamento> readById(int id_usuario) {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            List<Agendamento> agendamentos = new ArrayList<>();
            
            try {
                stmt = con.prepareStatement("SELECT * FROM agendamento WHERE id_usuario =" + id_usuario);
                rs = stmt.executeQuery();
                while(rs.next()) {
                    Agendamento agendamento = new Agendamento();
                    agendamento.setId_agendamento(rs.getInt("id_agendamento"));
                    agendamento.setId_usuario(rs.getInt("id_usuario"));
                    agendamento.setDescricao(rs.getString("descricao"));
                    agendamento.setData_agendamento(rs.getString("data_agendamento"));
                    agendamento.setHora_agendamnto(rs.getString("hora_agendamento"));
                    agendamentos.add(agendamento);
                }
            } catch(SQLException ex) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                ConnectionFactory.closeConnection(con, stmt, rs);
            }
            return agendamentos;
        }
        
        @Override
        public void update(Agendamento agendamento) {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            
            try {
                stmt = con.prepareStatement("UPDATE agendamento SET descricao = ?, data_agendamento = ?, hora_agendamento = ? WHERE id_agendamento = ? AND id_usuario = ?");
                stmt.setString(1, agendamento.getDescricao());
                stmt.setString(2, agendamento.getData_agendamento());
                stmt.setString(3, agendamento.getHora_agendamnto());
                stmt.setInt(4, agendamento.getId_agendamento());
                stmt.setInt(5, agendamento.getId_usuario());
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            } catch(SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
            } finally {
                ConnectionFactory.closeConnection(con, stmt);
            }
        }
        
        @Override
        public void delete(int id_agendamento) {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            
            try{
                stmt = con.prepareStatement("DELETE FROM agendamento WHERE id_agendamento = ?");
                stmt.setInt(1, id_agendamento);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
            } catch(SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao deletar: " + ex);
            } finally {
                ConnectionFactory.closeConnection(con, stmt);
            }
        } 
    
}
