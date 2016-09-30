package com.ge.predix.labs.data.jpa.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ge.predix.labs.data.jpa.domain.Status;

@Service
@SuppressWarnings("unchecked")
@Transactional
public class StatusService {

    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    public List<Status> getAllStatus() {
        return em.createQuery("FROM Status").getResultList();
    }

    @Transactional(readOnly = true)
    public Status getStatusById(Integer id) {
        return em.find(Status.class, id);
    }

    public void deleteStatus(Integer id) {
    	Status status = getStatusById(id);
        em.remove(status);
    }
}
