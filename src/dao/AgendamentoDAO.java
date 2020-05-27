/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Agendamento;

/**
 *
 * @author mateusdaniel
 */
public interface AgendamentoDAO {
    
    public void create(Agendamento agendamento);
        
        public List<Agendamento> readById(int id_usuario);
        
        public void update(Agendamento agendamento);
        
        public void delete(int id_agendamento);
    
}
