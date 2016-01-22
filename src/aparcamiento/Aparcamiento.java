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
public class Aparcamiento {

    public static void main(String[] args) {
        Coche c;
        Moto m;
        Vehiculo v = null;
        Coche c1 = new Coche("Superman", "2345FMG", "48592966S");
        Coche c2 = new Coche("Largo", "2678FMG", "48592966A");
        Coche c3 = new Coche("CORTO", "4567FMG", "48592966B");
        c3.setColor("azul");
        c3.setModelo("Seat ibiza");
        Moto m1 = new Moto("5643AWS", "34567890L");
        Moto m2 = new Moto("5643JIT", "34567890H");

        System.out.println(c3.toString());

        if (v instanceof Coche) {
            c = (Coche) v;
            char ch = 'C';
        } else {
            char ch = 'M';
        }
    }
}
