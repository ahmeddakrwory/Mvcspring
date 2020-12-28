/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springdall;

import static java.nio.channels.spi.AsynchronousChannelProvider.provider;
import java.util.ArrayList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sp.entitis.City;
import sp.entitis.Product;
import sp.entitis.Provider;
import sp.repos.CategoryRepo;
import sp.repos.CityRepo;
import sp.repos.ConsumerRepo;
import sp.repos.ProductRepo;
import sp.repos.ProviderRepo;
import sp.repos.ProviderUserRepo;

/**
 *
 * @author ADMIN
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext apcon=new  ClassPathXmlApplicationContext("SpringDalcgf.xml");
    CityRepo cityrepo=apcon.getBean("categoryRepo",CityRepo.class);
//       ProviderRepo prepo=apcon.getBean(" providerRepo", ProviderRepo.class);
//      Provider p=prepo.findById(3);
        ArrayList<City>allcit=  (ArrayList<City>) cityrepo.findListByHQL();
        for(City c:allcit){
            System.out.println("name=  "+c.getNameAr());
        }

}

}
