/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wscomfenalco.eis;

import com.wscomfenalco.entity.UserWeb;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class UserDAOImpl implements IUserDAO {

    @PersistenceContext(unitName = "WSComfenalcoPUSubsidio")
    private EntityManager em;

    @Override
    public UserWeb getByCredentials(String username, String pass) {

        try {

            Query sql = em.createNamedQuery("UserWeb.findByCredentials", UserWeb.class);
            sql.setParameter("username", username);
            sql.setParameter("pass", pass);

            return (UserWeb) sql.getSingleResult();
        } 
        catch ( NoResultException e ) {
            return null;
        }
    }
}
