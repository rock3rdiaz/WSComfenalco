/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wscomfenalco.bussines;

import com.wscomfenalco.eis.IUserDAO;
import com.wscomfenalco.entity.UserWeb;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class UserServiceImpl implements IUserService {
    
    @Inject
    private IUserDAO userDAO;

    @Override
    public boolean validate( String username, String pass ) {
        
        UserWeb user = userDAO.getByCredentials( username, pass );
        
        boolean validation = false;
        
        if( user != null  ){
            
            validation = true;
        }
        return validation;
    }

    @Override
    public boolean changePass(String currentPass, String newPass1, String newPass2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
