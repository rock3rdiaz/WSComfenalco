/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wscomfenalco.bussines;

import com.wscomfenalco.entity.VTrabajadores;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Remote;

/**
 *
 * @author rockerW7
 */
@Local
@Remote
public interface IEmployeesService {
    
    public List<VTrabajadores> getAllByNitCompany( String nitCompany );
    
}
