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
public class Coche extends Vehiculo {

    private String tipo;

    public Coche(String tipo, String matricula, String nifdue) {
        super(matricula, nifdue);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
          String otro = "";
        if (tipo.equalsIgnoreCase("Corto") && tipo.equalsIgnoreCase("largo")) {
            otro = tipo;
        } else {
            otro = "no es correcto";
        }

        this.tipo = tipo;
    }
   


}
