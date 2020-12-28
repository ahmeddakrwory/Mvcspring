/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.repos;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Senior Steps
 */
public abstract class AbstractEntityRepo<E> implements CommonRepo<E> {
@Autowired
private EntityManagerFactory entityManagerFactory;
//    public SessionFactory getSessionfactory() {
//        return sessionfactory;
//    }
//
//    public void setSessionfactory(SessionFactory sessionfactory) {
//        this.sessionfactory = sessionfactory;
//    }

    public Class<E> getEntityType() {
        return entityType;
    }

    public void setEntityType(Class<E> entityType) {
        this.entityType = entityType;
    }
	private Class<E> entityType;
	private String defaultOrder;

	public AbstractEntityRepo(Class<E> entityType) {
		this.entityType = entityType;
	}

	@Override
//        @Transactional
	public E add(E entity) {
		getCurrentSession().saveOrUpdate(entity);
		return entity;
	}

	@Override
	public E update(E entity) {
		return (E) getCurrentSession().merge(entity);
	}

	@Override
	public void remove(Integer id) {
		E foundEntity = (E) getCurrentSession().load(entityType, id);
		getCurrentSession().delete(foundEntity);
	}

	@Override
        
	public E findById(Integer id) {
		return (E) getCurrentSession().get(entityType, id);
	}

	@Override
	public List<E> findList() {
		CriteriaBuilder criteriaBuilder = getCurrentSession().getCriteriaBuilder();
		CriteriaQuery<E> entityCriteriaQuery = criteriaBuilder.createQuery(entityType);
		Root<E> from = entityCriteriaQuery.from(entityType);
		entityCriteriaQuery.select(from);
		if (null != defaultOrder) {
			entityCriteriaQuery.orderBy(criteriaBuilder.asc(from.get(defaultOrder)));
		}
		Query<E> entityQuery = getCurrentSession().createQuery(entityCriteriaQuery);
		List<E> entityResultList = entityQuery.getResultList();
		return entityResultList;
	}

	public void setDefaultOrder(String defaultOrder) {
		this.defaultOrder = defaultOrder;
	}
        protected Session getCurrentSession(){
             return entityManagerFactory.unwrap(SessionFactory.class).openSession();
        }
                
}
