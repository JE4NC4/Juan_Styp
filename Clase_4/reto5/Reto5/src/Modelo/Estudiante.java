package Modelo;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isaura Suarez
 */
public class Estudiante extends Persona {
    private float id_est;
    private float materia;
    private float nota;

    /**
     *
     * @param id_est
     * @param nombre
     * @param genero
     * @param materia
     * @param nmb_materia
     * @param nota
     */
    public Estudiante(float id_est, float genero, float materia, float nota) {
        super(genero);
        this.id_est = id_est;
        this.materia = materia;
        this.nota = nota;
    }

   

   

    public float getId_est() {
        return id_est;
    }

    public void setId_est(float id_est) {
        this.id_est = id_est;
    }


    public float getMateria() {
        return materia;
    }

    public void setMateria(float materia) {
        this.materia = materia;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

  
    
    //metodo contarRegulares
    public int contarRegulares(){
        int regular=0;
        if (nota>2.5 && nota<=3.5){
            regular=regular+1;
        }
        return regular;
        
    }
    
}
