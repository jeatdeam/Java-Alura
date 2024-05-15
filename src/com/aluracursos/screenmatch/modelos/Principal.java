package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;

import java.sql.SQLOutput;

public class Principal {
    public static void main(String[] args) {


   Pelicula miPelicula=new Pelicula();
   miPelicula.setNombre("Encanto");
   miPelicula.setFechaDeLanzamiento(2021);
   miPelicula.setDuracionEnMinutos(120);
   miPelicula.setIncluidoEnElPlan(true);
   miPelicula.muestraFichaTecnica();
   miPelicula.evalua(10);
   miPelicula.evalua(20);
   miPelicula.evalua(30);

 //  System.out.println(miPelicula.getTotalDeLasEvaluaciones());
  // System.out.println(miPelicula.CalculaMedia());

        Serie casaDragon= new Serie();
        casaDragon.setNombre("La casa del dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);

        System.out.println(casaDragon.getDuracionEnMinutos());
        casaDragon.getMinutosPorEpisodio();
        casaDragon.muestraFichaTecnica();

        Pelicula otraPelicula=new Pelicula();
        otraPelicula.setNombre("titanic");
        otraPelicula.setDuracionEnMinutos(120);
        otraPelicula.setFechaDeLanzamiento(2023);

        System.out.println(otraPelicula.getDuracionEnMinutos());
     //   otraPelicula.getDuracionEnMinutos();
    //    otraPelicula.getFechaDeLanzamiento();
        otraPelicula.muestraFichaTecnica();

        CalculadoraDeTiempo calculadora=new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("\n el tiempo total es: "+ calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion=new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio=new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa targaryen");
        episodio.setSerie(casaDragon);
        episodio.setVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);
    }
}
