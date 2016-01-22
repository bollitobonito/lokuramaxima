/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcamiento;

/**
 *
 * @author sdam1
 */
public class Vehiculo {
    private String matricula;
    private String color;
    private String modelo;
    private String nifdue;
    private String telefono;

    public Vehiculo(String matricula, String nifdue) {
        this.matricula = matricula;
        this.nifdue = nifdue;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNifdue() {
        return nifdue;
    }

    public void setNifdue(String nifdue) {
        this.nifdue = nifdue;
    }

    public String getTelefono() {
       return telefono;
    }

    public void setTelefono(String telefono) {
         String numero= "";
        if(numero.length() <9){
            telefono = numero;
        }
        else 
            telefono="telefono erroneo";
        this.telefono = telefono;
    }
     @Override
    public String toString(){
        String datos="";
           return datos= this.matricula+"\t"+this.modelo+"\t"+this.color;
        
        
    } 
    
    
    
}
