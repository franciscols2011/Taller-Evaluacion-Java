package Ejercicio17;

public class Lavadora extends Electrodomesticos{
    double carga;

    public Lavadora(){
        this.carga = 5;
    }

    public Lavadora(double precioB, double peso){
        this.precioB = precioB;
        this.peso = peso;
        this.carga = 5;
    }
    public Lavadora (double carga){
        this.carga = carga;
    }
    public double precioFinal(double carga){
        double precioFinal = precioFinal(this.precioB, this.consumoEnerg, this.peso);
        if (carga > 30)
            precioFinal += 50;
        return precioFinal;
    }
    @Override public String toString(){
        return "Precio: "+precioB+"\n"+
                "Color: "+color+"\n"+
                "Consumo Energetico: "+consumoEnerg+"\n"+
                "Peso: "+peso+"kgs\n"+
                "Carga: "+carga+"\n";
    }
    public double getCarga(){
        return this.carga;
    }
}
