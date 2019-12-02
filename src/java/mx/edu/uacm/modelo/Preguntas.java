/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uacm.modelo;

/**
 *
 * @author tomas
 */
public class Preguntas {
    
    private int id;
    private String pregunta;
    private Respuesta[] respuesta;

    public Preguntas() {
        
        
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

    /**
     * @return the pregunta
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * @param pregunta the pregunta to set
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * @return the respuesta
     */
    public Respuesta[] getRespuesta() {
        return respuesta;
    }

    /**
     * @param respuesta the respuesta to set
     */
    public void setRespuesta(Respuesta[] respuesta) {
        this.respuesta = respuesta;
    }
    
    
    
}
