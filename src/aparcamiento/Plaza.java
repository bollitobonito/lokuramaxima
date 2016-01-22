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
public class Plaza {

    private String num_plaza;
    private Vehiculo vehiculo;
    private String sotano;
    private char tipo;

    public Plaza(String num_plaza, String sotano) {
        this.num_plaza = num_plaza;
        this.sotano = sotano;
    }

    public String getNum_plaza() {
        return num_plaza;
    }

    public void setNum_plaza(String num_plaza) {
        this.num_plaza = num_plaza;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getSotano() {
        return sotano;
    }

    public void setSotano(String sotano) {
        this.sotano = sotano;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int precio(Vehiculo v, char tipo) {
        int total = 0;
        Coche c;
        if (v instanceof Coche) {
             c=(Coche)v;
            if (tipo == 'M') {
                total = 25;
            }
            if (tipo == 'C') {
            }
        }

        return total;
    }
}
