/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Controller.Login;
import DAO.DAOGenerico;
import static DAO.DAOGenerico.em;
import javax.persistence.Query;

/**
 *
 * @author Leonardo
 */
public class DAOLogin extends DAOGenerico<Login> {

    public DAOLogin(Class clazz) {
        super(clazz);
    }

    public Login obter(int id) {
        return em.find(Login.class, id);
    }

    public Login logar(String login, String senha) {
        Query q = em.createQuery("SELECT u FROM login u WHERE u.login = :login AND u.senha = :senha");
        q.setParameter("login", login);
        q.setParameter("senha", senha);
        Login user = null;
        try {

            user = (Login) q.getSingleResult();
            return user;

        } catch (Exception ex) {
            return null;
        }
    }
}
