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
public class Profesor extends Persona {
    private String nmb_materia;

    public Profesor(String Nombre, String apellido, float genero, int edad, String correo, String nmb_materia) {
        super(genero);
        this.nmb_materia=nmb_materia;
    }

    public String getNmb_materia() {
        return nmb_materia;
    }

    public void setNmb_materia(String nmb_materia) {
        this.nmb_materia = nmb_materia;
    }




    
}
