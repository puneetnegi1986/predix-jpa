package com.ge.predix.labs.data.jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ge.predix.labs.data.jpa.domain.ProductData;

@Service
@SuppressWarnings("unchecked")
@Transactional
public class ProductService {

    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    public List<ProductData> getAllProduct() {
        return em.createQuery("FROM ProductData").getResultList();
    }
    
    @Transactional(readOnly = true)
    public ProductData getProductById(Integer id) {
        return em.find(ProductData.class, id);
    }

    public void deleteProduct(Integer id) {
    	ProductData product = getProductById(id);
        em.remove(product);
    }
}
