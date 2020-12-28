/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.repos;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import sp.entitis.Order;

/**
 *
 * @author ADMIN
 */
@Repository
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE
,proxyMode = ScopedProxyMode.TARGET_CLASS)
public class OrderRepo extends AbstractEntityRepo<Order>{
    
    public OrderRepo(Class<Order> entityType) {
        super(entityType);
    }
    
}
