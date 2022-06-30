package Ejercicio3;

import java.util.Scanner;

public class CalcularAreaCirculo {
    public static void main(String[] args){
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        double radio = ingreso.nextDouble();
        double area = Double.parseDouble(String.valueOf(Math.PI * (Math.pow(radio, 2))));
        System.out.println("El area del circulo con radio "+radio+" es: "+area+"cm².");
    }
}
