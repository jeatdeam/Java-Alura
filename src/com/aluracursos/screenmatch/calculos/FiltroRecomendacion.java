package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {

    public void filtra(Clasificacion clasificacion){
        if(clasificacion.getClasificacion()>=4){
            System.out.println("la pelicula fue recomendada");
        }
        else if(clasificacion.getClasificacion()>=2){
            System.out.println("la pelicula no fue tan recomendada");
        }
            else{
            System.out.println("darle una oportunidad para verla");
        }
    }

}
