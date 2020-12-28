/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.common.beans;

import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author Senior Steps
 */
public class ProductBean {
    	private Integer id;
	private CategoryBean category;
	private String nameAr;
	private String nameEn;
	private float price;
	private String descriptionAr;
	private String descriptionEn;
	private String imagePath;
	private byte active;
	private Set<OrderItemBean> orderItems = new HashSet<OrderItemBean>(0);
	
}
