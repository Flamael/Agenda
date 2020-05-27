/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Usuario;
/**
 *
 * @author mateusdaniel
 */
public interface UsuarioDAO {
    
    public void create(Usuario usuario);

    public List<Usuario> read();

    public Usuario search(int id);

    public void update(Usuario usuario);

    public void delete(int id);

    public Usuario validate(Usuario usuario);
    
}
