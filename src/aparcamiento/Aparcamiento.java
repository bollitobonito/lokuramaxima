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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche c1=new Coche("Superman","2345FMG","48592966S");
        Coche c2=new Coche("Largo","2678FMG","48592966A");
        Coche c3=new Coche("CORTO","4567FMG","48592966B");
        
        Moto m1=new Moto("5643AWS","34567890L");
        Moto m2=new Moto("5643JIT","34567890H");
        
        System.out.println(c1.toString());
    }
    
}
