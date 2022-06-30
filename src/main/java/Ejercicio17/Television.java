package Ejercicio17;

public class Television extends Electrodomesticos {
    int resolucion;
    boolean sintonizadorTDT;

    public Television(){
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }
    public Television(double precioB, double peso){
        this.resolucion = 20;
        this.sintonizadorTDT = false;
        this.peso = peso;
        this.precioB = precioB;
    }

    public Television(int resolucion, boolean sintonizadorTDT){
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double precioFinal(int resolucion, boolean sintonizadorTDT){
        double precioFinal = precioFinal(this.precioB, this.consumoEnerg, this.peso);
        if (resolucion > 40)
            precioFinal += (precioFinal*0.30);
        if (sintonizadorTDT)
            precioFinal += 50;
        return precioFinal;
    }

    public int getResolucion() {
        return this.resolucion;
    }
    public boolean getSintonizadorTDT(){
        return this.sintonizadorTDT;
    }
    @Override public String toString(){
       return "Precio: "+precioB+"\n" +
               "Color: "+color+"\n" +
               "Consumo Energetico: "+consumoEnerg+"\n" +
               "Peso: "+peso+"\n" +
               "Sintonizador TDT: "+sintonizadorTDT+"\n" +
               "Resolucion: "+resolucion+"\n";
    }
}
