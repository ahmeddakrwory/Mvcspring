/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.common.beans;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import sp.entitis.Area;
import sp.entitis.Branch;
import sp.entitis.Consumer;
import sp.entitis.ConsumerAddress;
import sp.entitis.OrderItem;

/**
 *
 * @author ADMIN
 */
public class OrderBean {
   	private Integer id;
	private AreaBean area;
	private BranchBean branch;
	private ConsumerBean consumer;
	private ConsumerAddreesBean consumerAddress;
	private Date orderedAt;
	private float deliveryFees;
	private String status;
	private Set<OrderItemBean> orderItems = new HashSet<OrderItemBean>(0); 
}
