package Ejercicio17;

public class Main {
    public static void main(String[] args){
        Lavadora lav1 = new Lavadora();
        Lavadora lav2 = new Lavadora(200, 50);
        Lavadora lav3 = new Lavadora(80);
        Television tv1 = new Television();
        Television tv2 = new Television(500, 25);
        Television tv3 = new Television(55, true);
        Television tv4 = new Television(43, false);
        Electrodomesticos batidora = new Electrodomesticos();
        Electrodomesticos licuadora = new Electrodomesticos(100, 1);
        Electrodomesticos cafetera = new Electrodomesticos(300, "Blanco", 'C',1.5);

        Electrodomesticos[] productos = {lav1, lav2, lav3, tv1, tv2, tv3, tv4, batidora, licuadora, cafetera};
        double precioTotalLavadora = 0;
        double precioTotalTelevision = 0;
        double precioTotalElectrodomesticos = 0;
        double precio;
        for (Electrodomesticos producto : productos){
            if (producto.getClass() == Lavadora.class){
                precio = ((Lavadora) producto).precioFinal(((Lavadora) producto).getCarga());
                precioTotalLavadora += precio;
                precioTotalElectrodomesticos += precio;
                System.out.println("Es una lavadora y el precio final es: €"+precio);
            } else if (producto.getClass() == Television.class) {
                precio = ((Television) producto).precioFinal(((Television) producto).resolucion,((Television) producto).sintonizadorTDT);
                precioTotalTelevision += precio;
                precioTotalElectrodomesticos += precio;
                System.out.println("Es una television el mi precio final es: €"+precio);
            } else if (producto.getClass() == Electrodomesticos.class) {
                precio = producto.precioFinal(producto.precioB, producto.consumoEnerg, producto.peso);
                precioTotalElectrodomesticos += precio;
                System.out.println("Es un electrodomestico y el precio final es de: €"+precio);
            }
        }
        System.out.println("\nEl precio total de televisores es: €"+precioTotalTelevision);
        System.out.println("\nEl precio total de la lavadora es: €"+ precioTotalLavadora);
        System.out.println("\nEl precio total de los electrodomesticos es: €"+precioTotalElectrodomesticos);

    }
}
