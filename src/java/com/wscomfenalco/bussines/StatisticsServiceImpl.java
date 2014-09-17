/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wscomfenalco.bussines;

import com.wscomfenalco.eis.IStatisticsDAO;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author rockerW7
 */
@Stateless
public class StatisticsServiceImpl implements IStatisticsService{

   @Inject
   private IStatisticsDAO statisticsDAO;
    
    @Override
    public List<Object[]> bySex(String nitCompany, int branchOffice) {
        return statisticsDAO.bySex( nitCompany, branchOffice );
    }

    @Override
    public List<Object> byFovis(String nitCompany, int branchOffice) {
        return statisticsDAO.byFovis( nitCompany, branchOffice );
    }

    @Override
    public List<Object> byCategories(String nitCompany, int branchOffice) {
        return statisticsDAO.byCategories( nitCompany, branchOffice );
    }

    @Override
    public List<Object> byAge(String nitCompany, int branchOffice) {
        return statisticsDAO.byAge( nitCompany, branchOffice );
    }

    @Override
    public List<Object> byFovisDetail(String nitCompany, int branchOffice, String year) {
        return statisticsDAO.byFovisDetail( nitCompany, branchOffice, year );
    }

    @Override
    public List<Object> byInputAndSubsidy(String nitCompany, int branchOffice) {
        return statisticsDAO.byInputAndSubsidy( nitCompany, branchOffice );
    }
}
