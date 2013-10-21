/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Controller.MestreObra;
import DAO.DAOGenerico;
import static DAO.DAOGenerico.em;

/**
 *
 * @author Leonardo
 */
public class DAOMestreObra extends DAOGenerico<MestreObra>{

    public DAOMestreObra(Class clazz) {
        super(clazz);
    }
    
       public MestreObra obter(int id) {
        return em.find(MestreObra.class, id);
    }
    
}
