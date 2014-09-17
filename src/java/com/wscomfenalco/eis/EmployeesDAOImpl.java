/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wscomfenalco.eis;

import com.wscomfenalco.entity.VTrabajadores;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class EmployeesDAOImpl implements IEmployeesDAO {

    @PersistenceContext( unitName = "WSComfenalcoPUSubsidio" )
    EntityManager em;
    
    @Override
    public List<VTrabajadores> getAllByNitCompany( String nitCompany ) {
        
       Query sql = em.createNamedQuery( "VTrabajadores.findAllByNITCompany" );
       sql.setParameter( "nit" , nitCompany );
       
       return sql.getResultList();
              
    }
    
}
