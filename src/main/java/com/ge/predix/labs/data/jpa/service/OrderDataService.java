package com.ge.predix.labs.data.jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ge.predix.labs.data.jpa.domain.OrderData;

@Service
@SuppressWarnings("unchecked")
@Transactional
public class OrderDataService {

    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    public List<OrderData> getAllOrderDatas() {
        return em.createQuery("FROM OrderData").getResultList();
    }

    @Transactional(readOnly = true)
    public OrderData getOrderDataById(Integer id) {
        return em.find(OrderData.class, id);
    }

    public void deleteOrderData(Integer id) {
    	OrderData orderData = getOrderDataById(id);
        em.remove(orderData);
    }
}
