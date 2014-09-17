/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wscomfenalco.bussines;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Remote;

/**
 *
 * @author rockerW7
 */
@Remote
@Local
public interface IStatisticsService {
    
    public List<Object[]> bySex( String nitCompany, int branchOffice );
    
    public List<Object> byFovis( String nitCompany, int branchOffice );
    
    public List<Object> byFovisDetail( String nitCompany, int branchOffice, String year );
    
    public List<Object> byCategories( String nitCompany, int branchOffice );
    
    public List<Object> byAge( String nitCompany, int branchOffice );

    public List<Object> byInputAndSubsidy( String nitCompany, int branchOffice );
    
}
