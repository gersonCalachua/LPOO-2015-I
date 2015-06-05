/**
 * Created by seven on 04/06/2015.
 */
public class Principal {
    public static void main(String[] args){
        Coche c = new Coche("Rojo",100, 4);
        Moto m = new Moto("Verde",200,false);

        System.out.println("La velocidad del coche es de: "+c.getVelocidad());
        System.out.println("La velocidad de la moto es de: "+m.getVelocidad());

        c.acelera();
        m.acelera();

        System.out.println("La velocidad del coche es de: " + c.getVelocidad());
        System.out.println("La velocidad de la moto es de: " + m.getVelocidad());
    }
}
