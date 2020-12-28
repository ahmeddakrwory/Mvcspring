/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springbl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sp.common.beans.CategoryBean;
import sp.common.beans.CityBean;
import sp.common.beans.ProviderBean;
import sp.entitis.City;
import sp.manger.LookupsManager;

/**
 *
 * @author ADMIN
 */
@Service
public class MyGetway {
    @Autowired
   private LookupsManager lookupsManager;

    public MyGetway() {
       
    }

    public CityBean addCity(CityBean cityBean) {
        return lookupsManager.addCity(cityBean);
    }

    public CategoryBean addCategory(CategoryBean catgbean) {
        return lookupsManager.addCategory(catgbean);
    }

    public ProviderBean addProvider(ProviderBean provbean) {
        return lookupsManager.addProvider(provbean);
    }

    public ProviderBean findproviderById(Integer id) {
        return lookupsManager.findproviderById(id);
    }

    public List<CityBean> findAll() {
        return lookupsManager.findAll();
    }

    public LookupsManager getLookupsManager() {
        return lookupsManager;
    }

    public void setLookupsManager(LookupsManager lookupsManager) {
        this.lookupsManager = lookupsManager;
    }
    
    
    
}
