/*Poliformismo:
    -Sobrecarga
    */
public class Principal {
    public static void main(String[] args) {
        Numero num = new Numero();

        num.set(10,5.5);

        System.out.println("El valor de los atributos: num1 = "+ num.getNum1()+" num2 = " +num.getNum2());
    }
}
