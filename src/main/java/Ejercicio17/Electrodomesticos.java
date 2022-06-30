package Ejercicio17;

import java.util.ArrayList;
import java.util.Locale;

public class Electrodomesticos {
    double precioB;
    String color;
    char consumoEnerg;
    double peso;

    public Electrodomesticos() {
        this.color = "Blanco";
        this.consumoEnerg = 'F';
        this.peso = 5;
        this.precioB = 100;
    }

    public Electrodomesticos(double precioB, double peso) {
        this.precioB = precioB;
        this.peso = peso;
    }

    public Electrodomesticos(double precioB, String color, char consumoEnerg, double peso) {
        this.color = comprobarColor(color);
        this.consumoEnerg = comprobarConsumoEnerg(consumoEnerg);
        this.precioB = precioB;
        this.peso = peso;
    }

    public String comprobarColor(String color) {
        ArrayList<String> colores = new ArrayList<>();
        colores.add("blanco");
        colores.add("negro");
        colores.add("rojo");
        colores.add("azul");
        colores.add("gris");
        if (colores.contains(color.toLowerCase()))
            return color;
        else
            return "Blanco";
    }

    public double precioFinal(double precioB, char consumoEnerg, double peso) {
        double precioFinal = precioB;
        switch (consumoEnerg) {
            case 'A':
                precioFinal += 100;
                break;
            case 'B':
                precioFinal += 80;
                break;
            case 'C':
                precioFinal += 60;
                break;
            case 'D':
                precioFinal += 50;
                break;
            case 'E':
                precioFinal += 30;
                break;
            case 'F':
                precioFinal += 10;
                break;
        }
        if (peso <= 19)
            precioFinal += 10;
        else if (peso > 19 && peso <= 49)
            precioFinal += 50;
        else if (peso > 49 && peso <= 79)
            precioFinal += 80;
        else if (peso > 79)
            precioFinal += 100;

        return precioFinal;
    }

    public char comprobarConsumoEnerg(char consumoEnerg) {
        ArrayList<Character> letras = new ArrayList<>();
        letras.add('A');
        letras.add('B');
        letras.add('C');
        letras.add('D');
        letras.add('E');
        letras.add('F');
        if (letras.contains(consumoEnerg))
            return consumoEnerg;
        return 'F';
    }

    public double getPrecioB() {
        return this.precioB;
    }

    public String getColor() {
        return this.color;
    }

    public char getConsumoEnerg() {
        return this.consumoEnerg;
    }

    public double getPeso() {
        return this.peso;
    }

    @Override
    public String toString() {
        return "Precio: " + precioB + "\n" +
                "Color: " + color + "\n" +
                "Consumo Energetico: " + consumoEnerg + "\n" +
                "Peso: " + peso + "kgs\n";
    }

}

