package Ejercicio11;

import java.util.Scanner;

public class LongFraseConVocales {
    public static void main(String[] args){
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String texto = ingreso.nextLine();
        int cont = 0;
        for (int i = 0; i < texto.length(); i++){
            char caracter = texto.charAt(i);
            switch (caracter){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    cont += 1;
                    break;
                default:
                    break;
            }
        }
        System.out.println("La frase '"+texto+"' tiene la longitud de "+texto.length()+" caracteres.");
        System.out.println("La frase '"+texto+"' tiene "+cont+" vocales.");
    }
}
