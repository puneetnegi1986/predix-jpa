package com.ge.predix.labs.data.jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ge.predix.labs.data.jpa.domain.Invioce;

@Service
@SuppressWarnings("unchecked")
@Transactional
public class InvioceService {

    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    public List<Invioce> getAllInvioce() {
        return em.createQuery("FROM Invoice").getResultList();
    }

    @Transactional(readOnly = true)
    public Invioce getInvioceById(Integer id) {
        return em.find(Invioce.class, id);
    }

 
    public void deleteInvioce(Integer id) {
    	Invioce invioce = getInvioceById(id);
        em.remove(invioce);
    }
}
