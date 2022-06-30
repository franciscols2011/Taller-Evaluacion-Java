package Ejercicio5;

public class numPeI {
    public static void main(String[] args){
        int i = 1;
        while (i <= 100){
            if ((i % 2) == 0)
                System.out.println("El numero "+i+" es par.");
            else
                System.out.println("El numero "+i+ " es impar.");
            i += 1;
        }
    }
}
