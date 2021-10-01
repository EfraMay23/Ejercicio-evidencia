import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
     
    
    Scanner num = new Scanner(System.in);
    double valor;
    System.out.println("Escribe un valor (double)");
    valor = num.nextDouble();
    System.out.println("El cubo del valor es: " + Math.pow(valor,3));

    num.close();


    }
}
