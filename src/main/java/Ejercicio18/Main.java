package Ejercicio18;

public class Main {
    public static void main(String[] args) {
        Serie serie1 = new Serie("Breaking Bad", 5, "Drama Criminal", "Vince Gilligan, Michael Slovis");
        Serie serie2 = new Serie("Better Call Saul", 6, "Drama Criminal", "Vince Gilligan, Peter Gould");
        Serie serie3 = new Serie("Okupas", "Bruno Stagnaro");
        Serie serie4 = new Serie();
        Serie serie5 = new Serie("", 4, "Drama criminal", "Jenna Bans");
        Serie[] series = {serie1, serie2, serie3, serie4, serie5};

        VideoJuego vj1 = new VideoJuego();
        VideoJuego vj2 = new VideoJuego("League of Legends", 8);
        VideoJuego vj3 = new VideoJuego("Counter Strike: Global Offensive", 11, "Shooter", "Valve");
        VideoJuego vj4 = new VideoJuego();
        VideoJuego vj5 = new VideoJuego("Mortal Kombat 11", 6);
        VideoJuego[] videojuegos = {vj1, vj2, vj3, vj4, vj5};

        serie1.entregar();
        serie3.entregar();
        serie5.entregar();
        vj2.entregar();
        vj3.entregar();

        int contadorSeriesEntregadas = 0;
        int contadorVideojuegosEntregados = 0;

        VideoJuego mayorHorasEstimadas = videojuegos[0];
        Serie mayorTemporadas = series[0];

        for(VideoJuego videojuego : videojuegos){
            if(videojuego.isEntregado()){
                System.out.println("El videojuego "+videojuego.titulo+" esta entregado.");
                videojuego.devolver();
                contadorVideojuegosEntregados += 1;
            }
            mayorHorasEstimadas = (VideoJuego)mayorHorasEstimadas.compareTo(videojuego);
        }

        for(Serie serie : series){
            if(serie.isEntregado()){
                System.out.println("La serie "+serie.titulo+" esta entregada.");
                serie.devolver();
                contadorSeriesEntregadas += 1;
            }
            mayorTemporadas = (Serie)mayorTemporadas.compareTo(serie);
        }

        System.out.println("La cantidad de videojuegos entregados es: "+contadorVideojuegosEntregados+".");
        System.out.println("La cantidad de series entregadas es: "+contadorSeriesEntregadas+".");
        System.out.println("\nLa serie con mayor temporadas es: ");
        System.out.println(mayorTemporadas);
        System.out.println("\nEl videojuego con mayor cantidad de horas estimadas es: ");
        System.out.println(mayorHorasEstimadas);
    }
}