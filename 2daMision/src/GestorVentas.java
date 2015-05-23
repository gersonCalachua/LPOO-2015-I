import java.util.Scanner;

/**
 * Created by seven on 22/05/2015.
 */
public class GestorVentas {
    private Scanner reader;
    private Integer cantidad;
    private Float   montoVenta;
    private Float bono;

    public GestorVentas(Scanner reader, Integer cantidad, Float montoVenta, Float bono, Vendedor vendedor1) {
        this.reader = reader;
        this.cantidad = cantidad;
        this.montoVenta = montoVenta;
        this.bono = bono;
        this.vendedor1 = vendedor1;
    }


    private Vendedor vendedor1;
    public GestorVentas() {
        Vendedor vendedor1 = new Vendedor("Stiven");
    }

    public void actualizar(){
        reader = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de ventas: ");
        cantidad = reader.nextInt();
        if (cantidad<30){
            bono=20f;
        }
        if (cantidad>40&&cantidad<=100) {
            bono = 50f;
        }
        if (cantidad>100){
            bono=100f;
        }

        Float bonoAux;
        bonoAux=0f;
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduzca el monto de la venta: " + (i + 1));
            montoVenta = reader.nextFloat();
            montoVenta= montoVenta*82/100;
            if (montoVenta<500){
                bonoAux=montoVenta*3/100+bonoAux;
            }
            if (montoVenta>1000&&montoVenta<=1500){
                bonoAux=montoVenta*5/100+bonoAux;
            }
            if (montoVenta>1500){
                bonoAux=montoVenta*7/100+bonoAux;
            }
        }
        bono=bono+bonoAux;
    }
    public void mostrar(){
        vendedor1.reporte();
    }
}
