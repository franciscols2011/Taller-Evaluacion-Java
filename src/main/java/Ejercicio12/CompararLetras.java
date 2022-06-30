package Ejercicio12;

import  java.io.IOException;
import java.util.Scanner;

public class CompararLetras {
    public static void main(String[] args){
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese la primera palabra: ");
        String palabra1 = ingreso.nextLine();
        System.out.println("Ingrese la segunda palabra: ");
        String palabra2 = ingreso.nextLine();
        boolean largo = true;
        if (palabra1.equals(palabra2))
            System.out.println("Las palabras son iguales.");
        else{
            for (int i = 0; i < Math.max(palabra1.length(), palabra2.length()); i++){
                try {
                    char charPalabra1 = palabra1.charAt(i);
                    char charPalabra2 = palabra2.charAt(i);
                    if (charPalabra1 != charPalabra2)
                        System.out.println("Los caracteres son diferentes en la posicion " + (i + 1) +". ("+charPalabra1+" distinto de "+charPalabra2+").");
                } catch (Exception e){
                    largo = false;
                }
            }
            if (largo == false)
                System.out.println("Las palabras no tienen el mismo largo.");
            System.out.println("Las palabras son diferentes.");
        }
    }
}
