/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springbl;

import static com.mycompany.spcommon.SeniorConstant.LANG_AR;
import static java.nio.channels.spi.AsynchronousChannelProvider.provider;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sp.common.beans.CategoryBean;
import sp.common.beans.CityBean;
import sp.common.beans.ProviderBean;
import sp.entitis.City;
import sp.mangerImpl.LookupsManagerImpl;
import sp.transformers.ProviderTransformer;
/**
 *
 * @author ADMIN
 */
public class Testbl {

    public static void main(String[] args) {
        ApplicationContext apcon = new ClassPathXmlApplicationContext("SpringBlCfg.xml");
        LookupsManagerImpl locup = apcon.getBean("lookupsManagerImpl", LookupsManagerImpl.class);
        ProviderBean provbean=locup.findproviderById(3);
       System.out.println("name"+provbean.getNameEn());
     
//       
//        CategoryBean categoryBean=new CategoryBean(provbean, "helo", "hellos", "hello", "hello");
//        locup.addCategory(categoryBean);
//CityBean cbean=new CityBean("DAKAHLIA", "DAkahliaAR", LANG_AR);
//
//
//locup.addCity(cbean);
//        locup.deleteCity(42);
}

}

//    }