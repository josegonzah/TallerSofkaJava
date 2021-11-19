package Ejercicio18;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        Serie serie1 = new Serie("Stranger Things", 5, "ciencia ficcion", "netflix" );
        Serie serie2 = new Serie();
        Serie serie3 = new Serie("Squid Game", "netflix");
        Serie serie4 = new Serie("Daredevil", "netflix");
        Serie serie5 = new Serie("Loki", 1, "superheroes", "netflix");

        ArrayList<Serie> ArraySeries=new ArrayList<>();
        ArraySeries.add(serie1);
        ArraySeries.add(serie2);
        ArraySeries.add(serie3);
        ArraySeries.add(serie4);
        ArraySeries.add(serie5);

        ArraySeries.get(0).entregar();
        ArraySeries.get(3).entregar();

        Videojuego videojuego1 = new Videojuego();
        Videojuego videojuego2 = new Videojuego("Need for speed", 15);
        Videojuego videojuego3 = new Videojuego("Pokemon", 48, "aventura", "nintendo");
        Videojuego videojuego4 = new Videojuego("Mario Galaxy", 35, "aventura", "nintendo");
        Videojuego videojuego5 = new Videojuego("Final Fantasy", 100, "rpg", "square enix");

        ArrayList<Videojuego> ArrayVideojuego = new ArrayList<>();
        ArrayVideojuego.add(videojuego1);
        ArrayVideojuego.add(videojuego2);
        ArrayVideojuego.add(videojuego3);
        ArrayVideojuego.add(videojuego4);
        ArrayVideojuego.add(videojuego5);

        ArrayVideojuego.get(2).entregar();
        ArrayVideojuego.get(4).entregar();

        int seriesEntregadas = 0;
        int serieMasTemporadas = 0;
        Serie serieMasTemporadasObj = new Serie();

        for (Serie serie : ArraySeries){
            if(serie.getNumTemporadas() > serieMasTemporadas){
                serieMasTemporadas = serie.getNumTemporadas();
                serieMasTemporadasObj = serie;
            }
            if (serie.isEntregado()){
                seriesEntregadas += 1;
                serie.devolver();
            }
        }

        Videojuego videojuegoMasHoras = new Videojuego();
        int masHorasVideojuego = 0;
        int videojuegosEntregados = 0;
        for(Videojuego videojuego: ArrayVideojuego){
            if(videojuego.getHorasEstimadas() > masHorasVideojuego){
                masHorasVideojuego = videojuego.getHorasEstimadas();
                videojuegoMasHoras = videojuego;
            }
            if(videojuego.isEntregado()){
                videojuegosEntregados += 1;
                videojuego.devolver();
            }
        }

        System.out.println("Series entregadas: "+seriesEntregadas);
        System.out.println("Videojuegos entregados: "+videojuegosEntregados);
        System.out.println("Juego con más horas");
        System.out.println(videojuegoMasHoras.toString());
        System.out.println("Serie con mas temporadas");
        System.out.println(serieMasTemporadasObj.toString());

    }
}
