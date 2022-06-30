package Ejercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nombre = ingreso.nextLine();
        System.out.println("Ingrese edad: ");
        int edad = ingreso.nextInt();
        System.out.println("Ingrese sexo: ");
        char sexo = ingreso.next().charAt(0);
        System.out.println("Ingrese peso: ");
        double peso = ingreso.nextDouble();
        System.out.println("Ingrese altura: ");
        double altura = ingreso.nextDouble();

        Persona per1 = new Persona(nombre, edad, sexo, peso, altura);

        Persona per2 = new Persona(nombre, edad, sexo);

        Persona per3 = new Persona();
        per3.setNombre(nombre);
        per3.setEdad(edad);
        per3.setSexo(sexo);
        per3.setPeso(peso);
        per3.setAltura(altura);

        System.out.println("Persona 1: ");
        switch (per1.calcularIMC()){
            case -1:
                System.out.println("La persona esta en su peso ideal.");
                break;
            case 0:
                System.out.println("La persona esta por debajo de su peso ideal.");
                break;
            case 1:
                System.out.println("La persona tiene sobrepeso.");
                break;
        }
        if (per1.esMayorDeEdad())
            System.out.println("La persona es mayor de edad.");
        else
            System.out.println("La persona es menor de edad.");

        System.out.println(per1);

        System.out.println("Persona 2:");
        switch (per2.calcularIMC()){
            case -1:
                System.out.println("La persona esta en su peso ideal.");
                break;
            case 0:
                System.out.println("La persona esta por debajo de su peso ideal.");
                break;
            case 1:
                System.out.println("La persona tiene sobrepeso.");
                break;
        }
        if(per2.esMayorDeEdad())
            System.out.println("La persona es mayor de edad");
        else
            System.out.println("La persona es menor de edad.");

        System.out.println(per2);

        System.out.println("Persona 3:");
        switch (per3.calcularIMC()){
            case -1:
                System.out.println("La persona esta en su peso ideal.");
                break;
            case 0:
                System.out.println("La persona esta por debajo de su peso ideal.");
                break;
            case 1:
                System.out.println("La persona tiene sobrepeso.");
                break;
        }
        if (per3.esMayorDeEdad())
            System.out.println("La persona es mayor de edad.");
        else
            System.out.println("La persona es menor de edad.");

        System.out.println(per3);
    }

}
