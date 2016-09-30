package com.ge.predix.labs.data.jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ge.predix.labs.data.jpa.domain.InvoiceHold;

@Service
@SuppressWarnings("unchecked")
@Transactional
public class InvoiceHoldService {

    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    public List<InvoiceHold> getAllInvoiceHold() {
        return em.createQuery("FROM InvoiceHold").getResultList();
    }

    @Transactional(readOnly = true)
    public InvoiceHold getInvoiceHoldById(Integer id) {
        return em.find(InvoiceHold.class, id);
    }

    public void deleteInvoiceHold(Integer id) {
    	InvoiceHold hold = getInvoiceHoldById(id);
        em.remove(hold);
    }
}
