/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.common.beans;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import sp.entitis.Area;
import sp.entitis.DeliveryArea;
import sp.entitis.Order;
import sp.entitis.Provider;
import sp.entitis.ProviderUser;

/**
 *
 * @author ADMIN
 */
public class BranchBean {
    private Integer id;
	private AreaBean area;
	private ProviderBean provider;
	private String nameAr;
	private String nameEn;
	private Date openAt;
	private Date closeAt;
	private String phone;
	private BigDecimal lat;
	private BigDecimal lng;
	private Set<DilevearyAreaBean> deliveryAreas = new HashSet<DilevearyAreaBean>(0);
	private Set<ProviderUserBean> providerUsers = new HashSet<ProviderUserBean>(0);
	private Set<Order> orders = new HashSet<Order>(0);

    public BranchBean() {
    }

    public BranchBean(Integer id, AreaBean area, ProviderBean provider, String nameAr, String nameEn, Date openAt, Date closeAt, String phone, BigDecimal lat, BigDecimal lng) {
        this.id = id;
        this.area = area;
        this.provider = provider;
        this.nameAr = nameAr;
        this.nameEn = nameEn;
        this.openAt = openAt;
        this.closeAt = closeAt;
        this.phone = phone;
        this.lat = lat;
        this.lng = lng;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AreaBean getArea() {
        return area;
    }

    public void setArea(AreaBean area) {
        this.area = area;
    }

    public ProviderBean getProvider() {
        return provider;
    }

    public void setProvider(ProviderBean provider) {
        this.provider = provider;
    }

    public String getNameAr() {
        return nameAr;
    }

    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public Date getOpenAt() {
        return openAt;
    }

    public void setOpenAt(Date openAt) {
        this.openAt = openAt;
    }

    public Date getCloseAt() {
        return closeAt;
    }

    public void setCloseAt(Date closeAt) {
        this.closeAt = closeAt;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public Set<DilevearyAreaBean> getDeliveryAreas() {
        return deliveryAreas;
    }

    public void setDeliveryAreas(Set<DilevearyAreaBean> deliveryAreas) {
        this.deliveryAreas = deliveryAreas;
    }

    public Set<ProviderUserBean> getProviderUsers() {
        return providerUsers;
    }

    public void setProviderUsers(Set<ProviderUserBean> providerUsers) {
        this.providerUsers = providerUsers;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
    
}
