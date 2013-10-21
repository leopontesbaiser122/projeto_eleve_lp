/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Controller.Usuario;
import DAO.DAOGenerico;

/**
 *
 * @author Leonardo
 */
public class DAOUsuario extends DAOGenerico<Usuario>{

    public DAOUsuario(Class clazz) {
        super(clazz);
    }
    
       public Usuario obter(int id) {
        return em.find(Usuario.class, id);
    }
    
}
