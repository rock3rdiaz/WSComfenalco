/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wscomfenalco.bussines;

import javax.ejb.Local;
import javax.ejb.Remote;

/**
 *
 * @author rockerW7
 */
@Local
@Remote
public interface IUserService {
    
    public boolean validate( String username, String pass );
    
    public boolean changePass( String  currentPass, String newPass1, String newPass2 );
}
