package model;

public class Agendamento {
    
    private int id_agendamento;
    private int id_usuario;
    private String descricao;
    private String data_agendamento;
    private String hora_agendamnto;

    public int getId_agendamento() {
        return id_agendamento;
    }

    public void setId_agendamento(int id_agendamento) {
        this.id_agendamento = id_agendamento;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData_agendamento() {
        return data_agendamento;
    }

    public void setData_agendamento(String data_agendamento) {
        this.data_agendamento = data_agendamento;
    }

    public String getHora_agendamnto() {
        return hora_agendamnto;
    }

    public void setHora_agendamnto(String hora_agendamnto) {
        this.hora_agendamnto = hora_agendamnto;
    }
    
    
    
}
