package com.ge.predix.labs.data.jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ge.predix.labs.data.jpa.domain.Supplier;

@Service
@SuppressWarnings("unchecked")
@Transactional
public class SupplierService {

    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    public List<Supplier> getAllSuppliers() {
        return em.createQuery("FROM Supplier").getResultList();
    }

    
    @Transactional(readOnly = true)
    public Supplier getSupplierById(Integer id) {
        return em.find(Supplier.class, id);
    }

 
    public void deleteSupplier(Integer id) {
    	Supplier supplier = getSupplierById(id);
        em.remove(supplier);
    }
}
