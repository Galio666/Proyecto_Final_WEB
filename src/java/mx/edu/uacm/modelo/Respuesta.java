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
class Respuesta {
    
    private String respuesta;
    private char inciso;
    private  boolean corecta;

    public Respuesta() {
    }

    /**
     * @return the respuesta
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * @param respuesta the respuesta to set
     */
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * @return the inciso
     */
    public char getInciso() {
        return inciso;
    }

    /**
     * @param inciso the inciso to set
     */
    public void setInciso(char inciso) {
        this.inciso = inciso;
    }

    /**
     * @return the corecta
     */
    public boolean isCorecta() {
        return corecta;
    }

    /**
     * @param corecta the corecta to set
     */
    public void setCorecta(boolean corecta) {
        this.corecta = corecta;
    }
    
    
    
}
