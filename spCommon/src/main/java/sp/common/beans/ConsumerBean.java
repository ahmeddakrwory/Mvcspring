/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.common.beans;

import java.util.HashSet;
import java.util.Set;
import sp.entitis.ConsumerAddress;
import sp.entitis.Order;

/**
 *
 * @author ADMIN
 */
public class ConsumerBean {
    private Integer id;
	private String phone;
	private String email;
	private String password;
	private String fullname;
	private String gender;
	private Set<ConsumerAddreesBean> consumerAddresses = new HashSet<ConsumerAddreesBean>(0);
	private Set<OrderBean> orders = new HashSet<OrderBean>(0);

    public ConsumerBean() {
    }

    public ConsumerBean(Integer id, String phone, String email, String password, String fullname, String gender) {
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.fullname = fullname;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Set<ConsumerAddreesBean> getConsumerAddresses() {
        return consumerAddresses;
    }

    public void setConsumerAddresses(Set<ConsumerAddreesBean> consumerAddresses) {
        this.consumerAddresses = consumerAddresses;
    }

    public Set<OrderBean> getOrders() {
        return orders;
    }

    public void setOrders(Set<OrderBean> orders) {
        this.orders = orders;
    }
        
    
}
