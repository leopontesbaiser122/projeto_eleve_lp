/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Controller.Imagem;
import DAO.DAOGenerico;
import static DAO.DAOGenerico.em;

/**
 *
 * @author Leonardo
 */
public class DAOImagem extends DAOGenerico<Imagem>{

    public DAOImagem(Class clazz) {
        super(clazz);
    }
    
       public Imagem obter(int id) {
        return em.find(Imagem.class, id);
    }
    
}
