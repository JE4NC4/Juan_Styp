/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.model;

/**
 *
 * @author Ambiente
 */
public class cuenta{
    public String titular;
    public int cantidad;
    
    public cuenta(String titular, int cantidad){
    this.titular = titular;
    this.cantidad = cantidad;
}
    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String toString() {
        return "cuenta{titular="+this.titular + ", cantidad=" + id_est + ", nombre=" + nombre +", genero="+ this.genero+", materia=" + materia + ", nmb_materia=" + nmb_materia + ", nota=" + nota + '}';
    }
    
    public string ingresar (){
        
    }
    
}
