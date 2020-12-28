/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.common.beans;

import sp.entitis.Area;
import sp.entitis.Branch;

/**
 *
 * @author ADMIN
 */
public class DilevearyAreaBean {
    
	private Integer id;
	private AreaBean area;
	private BranchBean branch;
	private float deliveryFees;
	private int deliverInMinutes;

    public DilevearyAreaBean(Integer id, AreaBean area, BranchBean branch, float deliveryFees, int deliverInMinutes) {
        this.id = id;
        this.area = area;
        this.branch = branch;
        this.deliveryFees = deliveryFees;
        this.deliverInMinutes = deliverInMinutes;
    }
    
}
