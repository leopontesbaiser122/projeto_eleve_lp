/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Controller.EstadoUf;
import DAO.DAOGenerico;
import static DAO.DAOGenerico.em;

/**
 *
 * @author Leonardo
 */
public class DAOEstadoUf extends DAOGenerico<EstadoUf>{

    public DAOEstadoUf(Class clazz) {
        super(clazz);
    }
    
       public EstadoUf obter(int id) {
        return em.find(EstadoUf.class, id);
    }
    
}
