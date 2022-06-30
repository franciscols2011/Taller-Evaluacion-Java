package Ejercicio15;

import java.util.Scanner;

public class MenuDeOpciones {
    public static void main(String[] args){
        int opcion;
        do{
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@ GESTION CINEMATOGRAFICA @@@@@@@@@@@@@@@@@@@@@@@@\n" +
                    "1 - NUEVO ACTOR\n" +
                    "2 - BUSCAR ACTOR\n" +
                    "3 - ELIMINAR ACTOR\n" +
                    "4 - MODIFICAR ACTOR\n" +
                    "5 - VER TODOS LOS ACTORES\n" +
                    "6 - VER PELICULAS DE LOS ACTORES\n" +
                    "7 - VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8 - SALIR\n");
            Scanner ingreso = new Scanner(System.in);
            System.out.println("Ingrese una opcion: ");
            opcion = ingreso.nextInt();
            switch (opcion){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    System.out.println("El numero ingresado no es valido. \n");
            }
        }while(opcion != 8 );
    }
}
