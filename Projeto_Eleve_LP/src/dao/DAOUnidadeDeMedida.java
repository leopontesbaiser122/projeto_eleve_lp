/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Controller.UnidadeDeMedida;
import DAO.DAOGenerico;
import static DAO.DAOGenerico.em;

/**
 *
 * @author Leonardo
 */
public class DAOUnidadeDeMedida extends DAOGenerico<UnidadeDeMedida>{

    public DAOUnidadeDeMedida(Class clazz) {
        super(clazz);
    }
    
       public UnidadeDeMedida obter(int id) {
        return em.find(UnidadeDeMedida.class, id);
    }
    
}
