/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Controller.Marca;
import DAO.DAOGenerico;
import static DAO.DAOGenerico.em;

/**
 *
 * @author Leonardo
 */
public class DAOMarca extends DAOGenerico<Marca>{

    public DAOMarca(Class clazz) {
        super(clazz);
    }
    
       public Marca obter(int id) {
        return em.find(Marca.class, id);
    }
    
}
