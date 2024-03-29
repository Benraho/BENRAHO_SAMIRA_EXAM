package com.example.exam.dao;

import com.example.exam.models.Employe;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class EmployeeDao {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Employe> getAllEmployees() {
        return entityManager.createQuery("SELECT e FROM Employe e", Employe.class)
                .getResultList();
    }
}
