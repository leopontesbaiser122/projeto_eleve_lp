/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Controller.FuncionariosMo;
import DAO.DAOGenerico;
import static DAO.DAOGenerico.em;

/**
 *
 * @author Leonardo
 */
public class DAOFuncionariosMo extends DAOGenerico<FuncionariosMo>{

    public DAOFuncionariosMo(Class clazz) {
        super(clazz);
    }
    
       public FuncionariosMo obter(int id) {
        return em.find(FuncionariosMo.class, id);
    }
    
}
