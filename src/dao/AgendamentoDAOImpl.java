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

public class AgendamentoDAOImpl implements AgendamentoDAO {

    @Override
    public void create(Agendamento agendamento) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO agendamento (idUsuario, descricao, dataAgendamento, horaAgendamento) VALUES (?, ?, ?, ?)");
            stmt.setInt(1, agendamento.getIdUsuario());
            stmt.setString(2, agendamento.getDescricao());
            stmt.setString(3, agendamento.getDataAgendamento());
            stmt.setString(4, agendamento.getHoraAgendamento());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Agendado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao agendar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    @Override
    public List<Agendamento> readById(int idUsuario) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Agendamento> agendamentos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM agendamento WHERE idUsuario =" + idUsuario + " ORDER BY dataAgendamento, horaAgendamento ASC");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Agendamento agendamento = new Agendamento();
                agendamento.setIdAgendamento(rs.getInt("idAgendamento"));
                agendamento.setIdUsuario(rs.getInt("idUsuario"));
                agendamento.setDescricao(rs.getString("descricao"));
                agendamento.setDataAgendamento(rs.getString("dataAgendamento"));
                agendamento.setHoraAgendamento(rs.getString("horaAgendamento"));
                agendamentos.add(agendamento);
            }
        } catch (SQLException ex) {
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
            stmt = con.prepareStatement("UPDATE agendamento SET descricao = ?, dataAgendamento = ?, horaAgendamento = ? WHERE idAgendamento = ? AND idUsuario = ?");
            stmt.setString(1, agendamento.getDescricao());
            stmt.setString(2, agendamento.getDataAgendamento());
            stmt.setString(3, agendamento.getHoraAgendamento());
            stmt.setInt(4, agendamento.getIdAgendamento());
            stmt.setInt(5, agendamento.getIdUsuario());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    @Override
    public void delete(int idAgendamento) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM agendamento WHERE idAgendamento = ?");
            stmt.setInt(1, idAgendamento);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
