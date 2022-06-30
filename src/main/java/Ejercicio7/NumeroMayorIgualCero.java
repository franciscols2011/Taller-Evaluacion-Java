package Ejercicio7;

import java.util.Scanner;

public class NumeroMayorIgualCero {
    public static void main(String[] args){
        Scanner ingreso = new Scanner(System.in);
        double num;
        do{
            System.out.println("Ingrese un numero: ");
            num = ingreso.nextDouble();
        }while (num < 0);
            System.out.println("El numero "+num+" es mayor o igual a 0.");
    }
}
