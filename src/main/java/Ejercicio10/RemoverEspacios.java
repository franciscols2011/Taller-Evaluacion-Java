package Ejercicio10;

import java.util.Scanner;

public class RemoverEspacios {
    public static void main(String[] args){
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String sentencia = ingreso.nextLine();
        String nuevaSentencia = sentencia.replaceAll("\\s+", "");
        System.out.println("La nueva frase es: "+nuevaSentencia);
    }
}
