package com.ge.predix.labs.data.jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ge.predix.labs.data.jpa.domain.Po;

@Service
@SuppressWarnings("unchecked")
@Transactional
public class PoService {

    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    public List<Po> getAllPos() {
        return em.createQuery("FROM Po").getResultList();
    }
  
    @Transactional(readOnly = true)
    public Po getPoById(Integer id) {
        return em.find(Po.class, id);
    }

    public void deletePo(Integer id) {
    	Po po = getPoById(id);
        em.remove(po);
    }
}
