package Clase3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numA = input.nextInt();
        System.out.println("Ingrese otro numero: ");
        int numB = input.nextInt();

        int multiplicacion = daMultiplicacion(numA, numB);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);

    }

    //3.Método que reciba dos enteros y retorne la multiplicación de la misma.

    public static int daMultiplicacion(int num1, int num2){
        int multiplica = num1 * num2;
        return multiplica;
    }

}
