/**
 * Created by seven on 04/06/2015.
 */
public class Vehiculo {
    private String color;
    private int cv, ruedas;
    private int velocidad;
    private String cristales;


    //Constructor
    public Vehiculo(String color, int cv, int ruedas){
        this.color=color;
        this.cv=cv;
        this.ruedas=ruedas;
    }


    //Gets
    public String getColor() {
        return color;
    }

    public int getCv() {
        return cv;
    }

    public int getRuedas() {
        return ruedas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getCristales() {
        return cristales;
    }

    //metodos
    public void acelera(){
        velocidad += cv/20;
    }

    public void frena(){
        velocidad = 0;
    }
}
