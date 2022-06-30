package Ejercicio4;

import java.util.Scanner;

public class CalcularPrecioConIVA {
    public static void main(String[] args){
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese el precio: ");
        double precio = ingreso.nextDouble();
        double precioIVA = precio * 0.21;
        System.out.println("El precio con IVA es: "+(precio + precioIVA));
    }
}
