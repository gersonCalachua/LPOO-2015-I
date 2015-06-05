/**
 * Created by seven on 04/06/2015.
 */
public class Moto extends Vehiculo{
    private boolean repararCadena;

    //Constructor
    public Moto  (String color,int cv, boolean repararCadena){
        super (color,cv,2);
        this.repararCadena=repararCadena;
    }

}
