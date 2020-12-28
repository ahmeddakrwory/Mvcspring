/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.transformers;

import com.mycompany.spcommon.SeniorConstant;
import org.springframework.stereotype.Component;
import sp.common.beans.ProviderBean;
import sp.entitis.Provider;

/**
 *
 * @author ADMIN
 */
@Component
public class ProviderTransformer  implements SeniorConstant, CommonTransformer<Provider, ProviderBean>{

    @Override
    public ProviderBean fromEntityToBean(Provider entity, String lang) {
       
        //To change body of generated methods, choose Tools | Templates.
        String nameEn=entity.getNameEn();
        String nameAr=entity.getNameAr();
        Integer pid=entity.getId();
        ProviderBean providerbean=new ProviderBean(pid, nameAr, nameEn);
        return providerbean;
    }

    @Override
    public Provider fromBeanToEntity(ProviderBean bean) {
         //To change body of generated methods, choose Tools | Templates.
         String nameAr=bean.getNameAr();
         String nameEn=bean.getNameEn();
         Provider provider=new Provider(nameAr, nameEn);
         return provider;
    }
    public Provider fromBeanToEntityId(ProviderBean bean) {
         //To change body of generated methods, choose Tools | Templates.
         String nameAr=bean.getNameAr();
         String nameEn=bean.getNameEn();
         Integer  id=bean.getId();
         Provider provider=new Provider(id,nameAr, nameEn);
         return provider;
    }
    
}
