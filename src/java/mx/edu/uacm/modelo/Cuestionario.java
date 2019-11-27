/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uacm.modelo;

import java.util.List;

/**
 *
 * @author tomas
 */
public class Cuestionario {
    
    private int id;
    private String categoria;
    private List<Preguntas> preguntas;

    public Cuestionario() {
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    public String getMateria() {
        return categoria;
    }

    public void setMateria(String categoria) {
        this.categoria = categoria;
    }

    
    /**
     * @return the preguntas
     */
    public List<Preguntas> getPreguntas() {
        return preguntas;
    }

    /**
     * @param preguntas the preguntas to set
     */
    public void setPreguntas(List<Preguntas> preguntas) {
        this.preguntas = preguntas;
    }
    
    
    
    
}
