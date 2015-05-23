import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * Created by seven on 22/05/2015.
 */
public class Cliente {
    private Scanner reader;
    private Double saldoVivo;
    private Integer meses;
    private Integer tasaAnual;
    HSSFWorkBook libro = new HSSFWorkbook();
    HSSFSheet hoja1=libro.createSheet("Hoja de calculo");
    HSSFRow fila = hoja1.createRow(5);

    public Cliente(Scanner reader, Double saldoVivo, Integer meses, Integer tasaAnual) {
        this.reader = reader;
        this.saldoVivo = saldoVivo;
        this.meses = meses;
        this.tasaAnual = tasaAnual;
    }

    public Double getSaldoVivo() {
        return saldoVivo;
    }

    public void setSaldoVivo(Double saldoVivo) {
        this.saldoVivo = 15000.0;
    }

    public Scanner getReader() {
        return reader;
    }

    public void setReader(Scanner reader) {
        this.reader = reader;
    }

    public Integer getMeses() {
        return meses;
    }

    public void setMeses(Integer meses) {
        this.meses = meses;
    }

    public Integer getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(Integer tasaAnual) {
        this.tasaAnual = tasaAnual;
    }


    private Cliente cliente1;
    public Cliente(){
        Cliente cliente = new Cliente();
    }

    public void mostrar(){
        reader = new Scanner(System.in);
        System.out.println("Ingrese numero de meses en que desea pagar: ");
        meses = reader.nextInt();
        for (int i=0;i<meses;i++){
            HSSFCell celda = fila.createCell(1);
            System.out.println("Numero de cuota"+i);
            CalculoCredito calculoCredito = new CalculoCredito();
            calculoCredito.modificarTasa();
            calculoCredito.pagoMensual();
            HSSFCell celda = fila.createCell(2);
            System.out.println("Pago mensual: " + pagoMensual);
            calculoCredito.amortizacion();
            HSSFCell celda = fila.createCell(3);
            System.out.println("Amortizacion: " + amortizacion);
            calculoCredito.interes();
            HSSFCell celda = fila.createCell(4);
            System.out.println("Interes: " + interes);
            HSSFCell celda = fila.createCell(5);
            saldoVivo= saldoVivo-amortizacion;
            System.out.println("Saldo Vivo: "+ saldoVivo);
        }
    }
}


