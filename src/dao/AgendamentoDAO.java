package dao;

import java.util.List;
import model.Agendamento;

public interface AgendamentoDAO {

    public void create(Agendamento agendamento);

    public List<Agendamento> readById(int id_usuario);

    public void update(Agendamento agendamento);

    public void delete(int id_agendamento);

}
