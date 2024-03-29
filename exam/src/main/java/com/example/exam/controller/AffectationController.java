package com.example.exam.controller.;

import com.yourpackage.dao.AffectationDAO;
import com.yourpackage.model.Affectation;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.ManagedProperty;
import jakarta.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class AffectationController {

    private String employeeName;
    private String projectName;
    private String implication;

    @ManagedProperty("#{affectationDAO}")
    private AffectationDAO affectationDAO;

    public void affecterProjet() {
        Affectation affectation = new Affectation();
        affectation.setEmployeeName(employeeName);
        affectation.setProjectName(projectName);
        affectation.setImplication(implication);

        affectationDAO.saveAffectation(affectation);

        employeeName = null;
        projectName = null;
        implication = null;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getImplication() {
        return implication;
    }

    public void setImplication(String implication) {
        this.implication = implication;
    }

    public AffectationDAO getAffectationDAO() {
        return affectationDAO;
    }

    public void setAffectationDAO(AffectationDAO affectationDAO) {
        this.affectationDAO = affectationDAO;
    }
}
