/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.transformers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sp.common.beans.CategoryBean;
import sp.common.beans.ProviderBean;
import sp.entitis.Category;
import sp.entitis.Provider;

/**
 *
 * @author ADMIN
 */@Component
public class CategoryTransforms implements CommonTransformer<Category, CategoryBean>{
@Autowired
     private ProviderTransformer providertransformer;
    @Override
    public CategoryBean fromEntityToBean(Category entity, String lang) {
     String nameAr=entity.getNameAr();
     String nameEn=entity.getNameEn();
     String descriptorAr=entity.getDescriptionAr();
     String descriptorEn=entity.getDescriptionEn();
        Provider provider=entity.getProvider();
      ProviderBean pbean=  providertransformer.fromEntityToBean(provider, lang);
     CategoryBean cbean=new CategoryBean(pbean, nameAr, nameEn, descriptorAr, descriptorEn);
     return cbean;
    }

    @Override
    public Category fromBeanToEntity(CategoryBean bean) {
    String nameAr=bean.getNameAr();
    String nameEn=bean.getNameEn();
    String  descrtEn=bean.getDescriptionEn();
    String  descrtAr=bean.getDescriptionAr();
      Provider provider=providertransformer.fromBeanToEntityId(bean.getProvider());
   Category category=new Category(provider, nameAr, nameEn);
   return category;
           
    }

    public ProviderTransformer getProvidertransformer() {
        return providertransformer;
    }

    public void setProvidertransformer(ProviderTransformer providertransformer) {
        this.providertransformer = providertransformer;
    }
    
}
