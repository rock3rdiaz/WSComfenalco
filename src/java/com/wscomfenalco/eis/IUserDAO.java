/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wscomfenalco.eis;

import com.wscomfenalco.entity.UserWeb;
import javax.ejb.Local;
import javax.ejb.Remote;

/**
 *
 * @author rockerW7
 */
@Local
@Remote

public interface IUserDAO {
    
    public UserWeb getByCredentials( String username, String pass );
}
