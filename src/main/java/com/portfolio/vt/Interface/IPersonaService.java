package com.portfolio.vt.Interface;

import com.portfolio.vt.Entity.Persona;
import java.util.List;



public interface IPersonaService {
   //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto de tipo persona por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona (Long id);
}
