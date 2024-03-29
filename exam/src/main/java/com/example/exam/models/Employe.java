package com.example.exam.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @ElementCollection
    private List<String> skills;

    private Post post;
    @ManyToMany(mappedBy = "employees")
    private List<Project> projects;

    public Employe(Long id, String name, String email, List<String> skills, Post post, List<Project> projects) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.skills = skills;
        this.post = post;
        this.projects = projects;
    }

    public Employe() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
