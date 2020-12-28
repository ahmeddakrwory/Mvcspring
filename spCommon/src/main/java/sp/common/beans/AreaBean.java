/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.common.beans;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.criteria.Order;
import org.dom4j.Branch;
import sp.entitis.City;
import sp.entitis.ConsumerAddress;
import sp.entitis.DeliveryArea;

/**
 *
 * @author ADMIN
 */
public class AreaBean {
    
private Integer id;
	private City city;
	private String nameAr;
	private String nameEn;
	private Set<ConsumerAddress> consumerAddresses = new HashSet<ConsumerAddress>(0);
	private Set<DeliveryArea> deliveryAreas = new HashSet<DeliveryArea>(0);
	private Set<Order> orders = new HashSet<Order>(0);
	private Set<Branch> branches = new HashSet<Branch>(0);

    public AreaBean(Integer id, City city, String nameAr, String nameEn) {
        this.id = id;
        this.city = city;
        this.nameAr = nameAr;
        this.nameEn = nameEn;
    }

    public Integer getId() {
        return id;
    }

    public AreaBean() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
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

    public Set<ConsumerAddress> getConsumerAddresses() {
        return consumerAddresses;
    }

    public void setConsumerAddresses(Set<ConsumerAddress> consumerAddresses) {
        this.consumerAddresses = consumerAddresses;
    }

    public Set<DeliveryArea> getDeliveryAreas() {
        return deliveryAreas;
    }

    public void setDeliveryAreas(Set<DeliveryArea> deliveryAreas) {
        this.deliveryAreas = deliveryAreas;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public Set<Branch> getBranches() {
        return branches;
    }

    public void setBranches(Set<Branch> branches) {
        this.branches = branches;
    }
        
    
}
