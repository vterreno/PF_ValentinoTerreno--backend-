/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.vt.Service;

import com.portfolio.vt.Entity.Experiencia;
import com.portfolio.vt.Repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Sexperiencia {
    @Autowired
    RExperiencia rEducacion;
    
    public List<Experiencia> list(){
        return rEducacion.findAll();
    }
    
    public Optional<Experiencia> getOne(int id){
        return rEducacion.findById(id);
    }
    
    public Optional<Experiencia> getByNombreE(String nombreE){
        return rEducacion.findByNombreE(nombreE);
    }
    
    public void save(Experiencia expe){
        rEducacion.save(expe);
    }
    
    public void delete(int id){
        rEducacion.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rEducacion.existsById(id);
    }
    
    public boolean existsByNombreE(String nombreE){
        return rEducacion.existsByNombreE(nombreE);
    }
}

