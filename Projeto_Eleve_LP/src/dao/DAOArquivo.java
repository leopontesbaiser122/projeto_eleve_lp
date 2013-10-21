/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Controller.Arquivo;
import DAO.DAOGenerico;
import static DAO.DAOGenerico.em;

/**
 *
 * @author Leonardo
 */
public class DAOArquivo extends DAOGenerico<Arquivo>{

    public DAOArquivo(Class clazz) {
        super(clazz);
    }
    
       public Arquivo obter(int id) {
        return em.find(Arquivo.class, id);
    }
    
}
