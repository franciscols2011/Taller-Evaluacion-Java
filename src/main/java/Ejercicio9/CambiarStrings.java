package Ejercicio9;

import java.util.Scanner;

public class CambiarStrings {
    public static void main(String[] args){
        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        String  nuevoTexto = texto.replace('a', 'e');
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String texto2 = ingreso.nextLine();
        nuevoTexto = nuevoTexto + " " + texto2;
        System.out.println("El nuevo texto es: "+nuevoTexto);

    }
}
