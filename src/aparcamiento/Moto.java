package aparcamiento;
/**
 *
 * @author sdam1
 */
public class Moto extends Vehiculo{
    private int numruedas;

    public Moto( String matricula, String nifdue) {
        super(matricula, nifdue);
        
    }

    public int getNumruedas() {
        return numruedas;
    }

    public void setNumruedas(int numruedas) {
        this.numruedas = numruedas;
    }
       
}
