/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.common.beans;

import java.util.HashSet;
import java.util.Set;
import sp.entitis.Product;
import sp.entitis.Provider;

/**
 *
 * @author ADMIN
 */
public class CategoryBean {
    private Integer id;
	private ProviderBean provider;
	private String nameAr;
	private String nameEn;
	private String descriptionAr;
	private String descriptionEn;
	private Set<ProductBean> products = new HashSet<ProductBean>(0);

    public CategoryBean(String nameAr, String nameEn, String descriptionAr, String descriptionEn) {
        this.nameAr = nameAr;
        this.nameEn = nameEn;
        this.descriptionAr = descriptionAr;
        this.descriptionEn = descriptionEn;
    }

    public CategoryBean(ProviderBean provider, String nameAr, String nameEn, String descriptionAr, String descriptionEn) {
        this.provider = provider;
        this.nameAr = nameAr;
        this.nameEn = nameEn;
        this.descriptionAr = descriptionAr;
        this.descriptionEn = descriptionEn;
    }
    

    public CategoryBean() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setProvider(ProviderBean provider) {
        this.provider = provider;
    }

    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public void setDescriptionAr(String descriptionAr) {
        this.descriptionAr = descriptionAr;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public void setProducts(Set<ProductBean> products) {
        this.products = products;
    }

    public Integer getId() {
        return id;
    }

    public ProviderBean getProvider() {
        return provider;
    }

    public String getNameAr() {
        return nameAr;
    }

    public String getNameEn() {
        return nameEn;
    }

    public String getDescriptionAr() {
        return descriptionAr;
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public Set<ProductBean> getProducts() {
        return products;
    }
    
    
}
