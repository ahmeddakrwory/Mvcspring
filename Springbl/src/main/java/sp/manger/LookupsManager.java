/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.manger;

import java.util.List;
import sp.common.beans.CategoryBean;
import sp.common.beans.CityBean;
import sp.common.beans.ProviderBean;
import sp.entitis.Category;
import sp.entitis.City;



/**
 *
 * @author Senior Steps
 */
public interface LookupsManager {

	public CityBean addCity(CityBean cityBean);
        public CategoryBean addCategory(CategoryBean catgbean);
        public ProviderBean addProvider(ProviderBean provbean);
        public ProviderBean findproviderById(Integer id);
        public List<CityBean> findAll();
        public void deleteCity(Integer id);

//	public AreaBean addArea(AreaBean areaBean);
}
