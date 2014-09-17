/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wscomfenalco.ws;

import com.wscomfenalco.bussines.IEmployeesService;
import com.wscomfenalco.bussines.IStatisticsService;
import com.wscomfenalco.bussines.IUserService;
import com.wscomfenalco.entity.VTrabajadores;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author rockerW7
 */

@Stateless
@WebService(serviceName = "onlineComfenalco")
public class onlineComfenalco {
    
    @Inject
    private IStatisticsService statisticsService;
    
    @Inject
    private IEmployeesService employeeService;  
    
    @Inject
    private IUserService userService;
    
    /**
     * This is a sample web service operation
     * @param nitCompany
     */
    @WebMethod(operationName = "getAllEmployeesByNITCompany")
    public List<VTrabajadores> getAllEmployeesByNITCompany(@WebParam(name = "nitCompany") String nitCompany) {
            
       return employeeService.getAllByNitCompany( nitCompany );
    }
    
    @WebMethod( operationName = "validation" )
    public boolean validation( @WebParam( name = "username" ) String username,
            @WebParam( name ="password" ) String password ){
        
        return userService.validate( username, password );       
    }

    
    @WebMethod( operationName = "getStatisticsBySex" )
    public List<Object[]> getStatisticsBySex( @WebParam( name = "nitCompany" ) String nitCompany ){
        
        return statisticsService.bySex( nitCompany, 1 );
    }
    
    
    @WebMethod( operationName = "getStatisticsByFovis" )
    public List<Object> getStatisticsByFovis( @WebParam( name = "nitCompany" ) String nitCompany ){
        
        return statisticsService.byFovis( nitCompany, 1 );
    }
    
    @WebMethod( operationName = "getStatisticsByInputAndSubsidy" )
    public List<Object> getStatisticsByInputAndSubsidy( @WebParam( name = "nitCompany" ) String nitCompany ){
        
        return statisticsService.byInputAndSubsidy( nitCompany, 1 );
    }
    
    
    @WebMethod( operationName = "getPayments" )
    public List getPayments( @WebParam( name = "nitCompany" ) String nitCompany ){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "WSComfenalcoPUSubsidio" );
        EntityManager em = emf.createEntityManager();
        
        Query sql = em.createNativeQuery("select empresa,recibo,concepto,anomes,fpago,comfenalco,nomina from aportes\n" +
                                            "where empresa = ( select top 1 empcodigo from empresas where empnit = ? )\n" +
                                            "and fpago between '20120101' and '20130831'\n" +
                                            "order by anomes " );          
        sql.setParameter( 1, nitCompany );
        
        List result = sql.getResultList();
        
        //emf.close();
        //em.close();
        
        return result;
    }
    
    
    @WebMethod( operationName = "getDetailStatisticsByFovis" )
    public List getDetailStatisticsByFovis( @WebParam( name = "nitCompany" ) String nitCompany,
                                        @WebParam( name = "year" )String year,
                                        @WebParam( name = "section" )int section ){
        
        return statisticsService.byFovisDetail( nitCompany, 1, year );
    }
    
    
    @WebMethod( operationName = "getStatisticsCategoriesByCompany" )
    public List getStatisticsCategoriesByCompany( @WebParam( name = "nitCompany" ) String nitCompany ){
        
       return statisticsService.byCategories( nitCompany, 1 );
    }
    
    @WebMethod( operationName = "getStatisticsEmployeeByAge" )
    public List getStatisticsEmployeeByAge( @WebParam( name = "nitCompany" ) String nitCompany ){
        
        return statisticsService.byAge( nitCompany, 1 );
    }
    
    
    @WebMethod( operationName = "changePassword" )
    public boolean changePassword( @WebParam( name="currentPass" ) String currentPass,
            @WebParam( name = "newPass1" ) String newPass1,
            @WebParam( name = "newPass2" ) String newPass2){
        
        boolean valid = false;
        
        if( newPass1.equals( newPass2 ) ){
            
            valid = true;
        }
        
        return valid;
    }
}