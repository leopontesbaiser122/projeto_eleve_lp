/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Controller.Categoria;
import DAO.DAOGenerico;
import static DAO.DAOGenerico.em;

/**
 *
 * @author Leonardo
 */
public class DAOCategoria extends DAOGenerico<Categoria>{

    public DAOCategoria(Class clazz) {
        super(clazz);
    }
    
       public Categoria obter(int id) {
        return em.find(Categoria.class, id);
    }
    
}
