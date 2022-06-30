package Ejercicio13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsultarFecha {
    public static void main(String[] args){
        DateTimeFormatter datoTiempo = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("La fecha y hora actual es: "+datoTiempo.format(LocalDateTime.now())+".");
    }
}
