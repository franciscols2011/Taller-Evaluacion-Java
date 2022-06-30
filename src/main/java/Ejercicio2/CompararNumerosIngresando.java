package Ejercicio2;

import java.util.Scanner;
public class CompararNumerosIngresando {
    public static void main(String[] args){
        Scanner ingresar = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        double num1 = ingresar.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        double num2 = ingresar.nextDouble();
        if (num1 > num2)
            System.out.println("El numero "+num1+ "es mayor que el numero " +num2);
        else if (num1 < num2)
            System.out.println("El numero "+num2+" es mayor que el numero "+num1);
        else
            System.out.println("Los numeros ingresados son iguales");
    }
}
