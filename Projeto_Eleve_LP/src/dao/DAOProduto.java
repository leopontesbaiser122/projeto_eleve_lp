/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Controller.Produto;
import DAO.DAOGenerico;
import static DAO.DAOGenerico.em;

/**
 *
 * @author Leonardo
 */
public class DAOProduto extends DAOGenerico<Produto>{

    public DAOProduto(Class clazz) {
        super(clazz);
    }
    
       public Produto obter(int id) {
        return em.find(Produto.class, id);
    }
    
}
