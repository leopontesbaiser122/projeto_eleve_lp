/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Controller.Obra;
import DAO.DAOGenerico;
import static DAO.DAOGenerico.em;

/**
 *
 * @author Leonardo
 */
public class DAOObra extends DAOGenerico<Obra>{

    public DAOObra(Class clazz) {
        super(clazz);
    }
    
       public Obra obter(int id) {
        return em.find(Obra.class, id);
    }
    
}
