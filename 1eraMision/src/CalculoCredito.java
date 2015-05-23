/**
 * Created by seven on 22/05/2015.
 */
public class CalculoCredito {
    public Double modificarTasa(Double tasaAnual) {
        Double tasaMensual = Math.pow(1.0D + tasaAnual, 1.0D / 12.0D)-1;
        return tasaMensual;
    }

    public Double pagoMensual(int credito, int meses, double tasaMensual ) {
        Double pagoMes = (tasaMensual * (double)credito) / (1.0D - Math.pow(1.0D + tasaMensual, (-meses)));
        return pagoMes;
    }

    public Double interes(Double saldoVivo, Double tasaMensual){
        Double interes = saldoVivo*tasaMensual;
        return interes;
    }

    public Double amortizacion(Double pagoMes, Double interes){
        Double amortizacion = pagoMes-interes;
        return amortizacion;
    }
}
