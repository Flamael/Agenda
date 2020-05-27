package dao;

import java.util.List;
import model.Usuario;

public interface UsuarioDAO {
    
    public void create(Usuario usuario);

    public List<Usuario> read();

    public Usuario search(int id);

    public void update(Usuario usuario);

    public void delete(int id);

    public Usuario validate(Usuario usuario);
    
}
