/**
 * Created by seven on 22/05/2015.
 */
public class Vendedor {
    String nombre;
    Float bono;

    public Vendedor(String nombre) {
        this.nombre = nombre;
    }

    public Vendedor(Float bono) {
        this.bono = bono;
    }
    public void ActualizarBonos(float bon){
        bono=bono+bon;
    }
    public  void reporte(){
        System.out.println(nombre+ " tiene "+bono+" soles de bono");
    }
}
