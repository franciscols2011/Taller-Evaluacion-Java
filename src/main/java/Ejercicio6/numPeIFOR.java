package Ejercicio6;

public class numPeIFOR {
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++){
            if((i % 2) == 0)
                System.out.println("El numero "+i+" es par.");
            else
                System.out.println("El numero "+i+ " es impar.");
        }
    }
}
