/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Controller.Fornecedor;
import DAO.DAOGenerico;
import static DAO.DAOGenerico.em;

/**
 *
 * @author Leonardo
 */
public class DAOFornecedor extends DAOGenerico<Fornecedor>{

    public DAOFornecedor(Class clazz) {
        super(clazz);
    }
    
       public Fornecedor obter(int id) {
        return em.find(Fornecedor.class, id);
    }
    
}
