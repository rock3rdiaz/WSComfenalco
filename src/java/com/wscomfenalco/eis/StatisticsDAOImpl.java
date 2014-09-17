/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wscomfenalco.eis;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

/**
 *
 * @author rockerW7
 */
@Stateless
public class StatisticsDAOImpl implements IStatisticsDAO{
    
    @PersistenceContext( unitName = "WSComfenalcoPUMCorporativo" )
    EntityManager em;

    @Override
    public List<Object[]> bySex( String nitCompany, int branchOffice ) {
        
        StoredProcedureQuery sql = em
                .createStoredProcedureQuery( "Estadistica_SexoPorEmpresa" );
        
        sql.registerStoredProcedureParameter( "NIT" , String.class, ParameterMode.IN );
        sql.registerStoredProcedureParameter( "SUCURSAL" , Integer.class, ParameterMode.IN );
        
        sql.setParameter( "NIT" , nitCompany );
        sql.setParameter( "SUCURSAL" , branchOffice );
        
        sql.execute();
        
        return sql.getResultList();
    }
    
    @Override
    public List<Object> byFovis( String nitCompany, int branchOffice ) {
        
        StoredProcedureQuery sql = em
                .createStoredProcedureQuery( "Estadistica_FovisEmpresa" );
        
        sql.registerStoredProcedureParameter( "NIT" , String.class, ParameterMode.IN );
        sql.registerStoredProcedureParameter( "SUCURSAL" , Integer.class, ParameterMode.IN );
        
        sql.setParameter( "NIT" , nitCompany );
        sql.setParameter( "SUCURSAL" , branchOffice );
        
        sql.execute();
        
        return sql.getResultList();
    }
    
    @Override
    public List<Object> byCategories(String nitCompany, int branchOffice) {
        
        StoredProcedureQuery sql = em
                .createStoredProcedureQuery( "Estadistica_CategoriasPorEmpresa" );
        
        sql.registerStoredProcedureParameter( "NIT" , String.class, ParameterMode.IN );
        sql.registerStoredProcedureParameter( "SUCURSAL" , Integer.class, ParameterMode.IN );
        
        sql.setParameter( "NIT" , nitCompany );
        sql.setParameter( "SUCURSAL" , branchOffice );
        
        sql.execute();
        
        return sql.getResultList();
    }

    @Override
    public List<Object> byFovisDetail(String nitCompany, int branchOffice, String year) {
        
        StoredProcedureQuery sql = em
                .createStoredProcedureQuery( "Estadistica_FovisEmpresa_Data" );
        
        sql.registerStoredProcedureParameter( "NIT" , String.class, ParameterMode.IN );
        sql.registerStoredProcedureParameter( "SUCURSAL" , Integer.class, ParameterMode.IN );
        sql.registerStoredProcedureParameter( "AÑO" , String.class, ParameterMode.IN );
        
        sql.setParameter( "NIT" , nitCompany );
        sql.setParameter( "SUCURSAL" , branchOffice );
        sql.setParameter( "AÑO" , year );
        
        sql.execute();
        
        return sql.getResultList();
    }

    @Override
    public List<Object> byAge(String nitCompany, int branchOffice) {
        
        StoredProcedureQuery sql = em
                .createStoredProcedureQuery( "Estadistica_TrabajadoresPorEmpresa" );
        
        sql.registerStoredProcedureParameter( "NIT" , String.class, ParameterMode.IN );
        sql.registerStoredProcedureParameter( "SUCURSAL" , Integer.class, ParameterMode.IN );
        
        sql.setParameter( "NIT" , nitCompany );
        sql.setParameter( "SUCURSAL" , branchOffice );
        
        sql.execute();
        
        return sql.getResultList();
    }

    @Override
    public List<Object> byInputAndSubsidy(String nitCompany, int branchOffice) {
        
        StoredProcedureQuery sql = em
                .createStoredProcedureQuery( "Estadistica_AportesySubsidioPorEmpresa" );
        
        sql.registerStoredProcedureParameter( "NIT" , String.class, ParameterMode.IN );
        sql.registerStoredProcedureParameter( "SUCURSAL" , Integer.class, ParameterMode.IN );
        
        sql.setParameter( "NIT" , nitCompany );
        sql.setParameter( "SUCURSAL" , branchOffice );
        
        sql.execute();
        
        return sql.getResultList();
    }
}
