package dao;

import java.util.List;
import model.Agendamento;

public interface AgendamentoDAO extends GenericDAO<Agendamento>{

    @Override
    public void create(Agendamento agendamento);

    public List<Agendamento> readById(int id_usuario);

    @Override
    public void update(Agendamento agendamento);

    @Override
    public void delete(int id_agendamento);

}
