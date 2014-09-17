/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wscomfenalco.bussines;

import com.wscomfenalco.eis.IEmployeesDAO;
import com.wscomfenalco.entity.VTrabajadores;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class EmployeesServiceImpl implements IEmployeesService {
    
    @EJB
    private IEmployeesDAO employeeDAO;

    @Override
    public List<VTrabajadores> getAllByNitCompany(String nitCompany) {
        
        return employeeDAO.getAllByNitCompany( nitCompany );
    }
    
}
