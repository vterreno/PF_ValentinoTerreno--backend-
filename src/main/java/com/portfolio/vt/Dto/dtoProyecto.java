/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.vt.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author PC
 */
public class dtoProyecto {
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    @NotBlank
    private String demo;
    @NotBlank
    private String repo;
    @NotBlank
    private String img;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String descripcionP, String demo, String repo, String img) {
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
    
    public void setDemo(String demo) {
        this.demo = demo;
    }
    
    public String getRepo(){
        return repo;
    }
    
    public void setRepo(String repo) {
        this.repo = repo;
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
