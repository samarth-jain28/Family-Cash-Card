package com.example.cashcard.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.cashcard.entity.CashCardEntity;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class CashCardDaoImpl implements CashCardDao{
    private EntityManager entityManager;

    @Autowired
    public CashCardDaoImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(CashCardEntity cce) {
        entityManager.persist(cce);
    }

}
