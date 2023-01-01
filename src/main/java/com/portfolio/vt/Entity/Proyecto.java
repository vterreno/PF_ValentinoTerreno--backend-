/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.vt.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreP;
    private String descripcionP;
    private String demo;
    private String repo;
    private String img;

    public Proyecto() {
    }

    public Proyecto(String nombreP, String descripcionP, String demo, String repo, String img) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.demo = demo;
        this.repo = repo;
        this.img = img;
    }
    
    public String getImg(){
        return img;
    }
    
    public void setImg(String img){
        this.img = img;
    }
    
    public String getDemo() {
        return demo;
    }
    
    public void setDemo(String demo){
        this.demo = demo;
    }
    
    public String getRepo() {
        return repo;
    }
    
    public void setRepo(String repo){
        this.repo = repo;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }
    
    
}
