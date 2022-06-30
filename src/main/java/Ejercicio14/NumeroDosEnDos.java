package Ejercicio14;

import java.util.Scanner;

public class NumeroDosEnDos {
    public static void main(String[] args){
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = ingreso.nextInt();
        if (numero <= 1000){
            for(int i = numero; i <= 1000; i += 2)
                System.out.println(i);
        }else
            System.out.println("El numero que ingreso es mayor a 1000.");
    }
}
