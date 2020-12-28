/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testspringrest;

import com.mycompany.springbl.MyGetway;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sp.common.beans.CityBean;
import sp.mangerImpl.LookupsManagerImpl;

/**
 *
 * @author ADMIN
 */
@RestController
public class FirstApiControl {
   @Autowired
    
  private LookupsManagerImpl  lookupsManagerImpl ;
    
    @GetMapping("/home")
    public String home(){
        return "done";
    }
    
    @PostMapping("/city")
    public List<CityBean>  getCity( ){
//        c.setNameAr("Server name");
//        c.setNameEn("Server nameAr");
     return lookupsManagerImpl.findAll();
    }

    public LookupsManagerImpl getLookupsManagerImpl() {
        return lookupsManagerImpl;
    }

    public void setLookupsManagerImpl(LookupsManagerImpl lookupsManagerImpl) {
        this.lookupsManagerImpl = lookupsManagerImpl;
    }

  
   
    
    
}
