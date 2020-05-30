package dao;

import java.util.List;
import model.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario>{

    @Override
    public void create(Usuario usuario);

    public List<Usuario> read();

    public Usuario search(int idUsuario);

    @Override
    public void update(Usuario usuario);

    @Override
    public void delete(int idUsuario);

    public Usuario validate(Usuario usuario);

}
