/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.mangerImpl;

import com.mycompany.spcommon.SeniorConstant;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import sp.common.beans.CategoryBean;
import sp.common.beans.CityBean;
import sp.common.beans.ProviderBean;
import sp.entitis.Category;
import sp.entitis.City;
import sp.entitis.Provider;
import sp.manger.LookupsManager;
import sp.repos.CategoryRepo;
import sp.repos.CityRepo;
import sp.repos.ProviderRepo;
import sp.transformers.CategoryTransforms;
import sp.transformers.CityTransformer;
import sp.transformers.ProviderTransformer;



/**
 *
 * @author Senior Steps
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE
,proxyMode = ScopedProxyMode.TARGET_CLASS)
public class LookupsManagerImpl implements LookupsManager, SeniorConstant {
@Autowired
	private CityTransformer cityTransformer ;
@Autowired
	
private CityRepo cityRepo;
@Autowired
private CategoryRepo categgorRepo;
@Autowired
private  CategoryTransforms categtransform;
@Autowired
private ProviderTransformer provtransformer;
@Autowired
private    ProviderRepo poviderrepo;
    public CityTransformer getCityTransformer() {
        return cityTransformer;
    }

    public LookupsManagerImpl() {
    }

    public void setCityTransformer(CityTransformer cityTransformer) {
        this.cityTransformer = cityTransformer;
    }

    public CityRepo getCityRepo() {
        return cityRepo;
    }

    public void setCityRepo(CityRepo cityRepo) {
        this.cityRepo = cityRepo;
    }

	@Override
        @Transactional
	public CityBean addCity(CityBean cityBean) {
		
		City cityEntity = cityTransformer.fromBeanToEntity(cityBean);
		
		cityEntity = cityRepo.add(cityEntity);
		CityBean resultCityBean = cityTransformer.fromEntityToBean(cityEntity, LANG_AR);
		
		return resultCityBean;
	}

    public CategoryRepo getCateggorRepo() {
        return categgorRepo;
        
    }

    public void setCateggorRepo(CategoryRepo categgorRepo) {
        this.categgorRepo = categgorRepo;
    }

@Override
   @Transactional
public CategoryBean addCategory(CategoryBean catbean){
Category catEnt=categtransform.fromBeanToEntity(catbean);
categgorRepo.add(catEnt);
CategoryBean cbean=categtransform.fromEntityToBean(catEnt, LANG_AR);
return cbean;
}

    public CategoryTransforms getCategtransform() {
        return categtransform;
    }

    public void setCategtransform(CategoryTransforms categtransform) {
        this.categtransform = categtransform;
    }

    @Override
    @Transactional
    public ProviderBean addProvider(ProviderBean provbean) {
        Provider providerEnt= provtransformer.fromBeanToEntity(provbean);
      Provider prpent=  poviderrepo.add(providerEnt);
     ProviderBean providerbean=provtransformer.fromEntityToBean(prpent, LANG_AR);
     return providerbean;
        
    }

    public ProviderTransformer getProvtransformer() {
        return provtransformer;
    }

    public void setProvtransformer(ProviderTransformer provtransformer) {
        this.provtransformer = provtransformer;
    }

    public ProviderRepo getPoviderrepo() {
        return poviderrepo;
    }

    public void setPoviderrepo(ProviderRepo poviderrepo) {
        this.poviderrepo = poviderrepo;
    }

    @Override
    @Transactional
    public ProviderBean findproviderById(Integer id) {
      Provider provider=  poviderrepo.findById(id);
      ProviderBean provbean=provtransformer.fromEntityToBean(provider, LANG_AR);
      return provbean;
    }

@Override
@Transactional
    public List<CityBean> findAll() {
       List<City>allcities=cityRepo.findList();
       List<CityBean>allcitiesb=new ArrayList<CityBean>();
       for(City c:allcities){
           CityBean cbean=cityTransformer.fromEntityToBean(c, LANG_AR);
           allcitiesb.add(cbean);
       }
       return allcitiesb;
    }

    @Override
    @Transactional
    public void deleteCity(Integer id) {
        cityRepo.remove(id);
    }
    

}
