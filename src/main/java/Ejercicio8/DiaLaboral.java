package Ejercicio8;

import java.util.Locale;
import java.util.Scanner;

public class DiaLaboral {
    public static void main(String[] args){
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese dia: ");
        String dia = ingreso.nextLine();
        switch (dia.toLowerCase()){
            case "domingo":
                System.out.println("El dia "+dia+", es un dia no laborable.");
                break;
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
            case "sabado":
                System.out.println("El dia "+dia+", es un dia laborable.");
                break;
        }
    }
}
