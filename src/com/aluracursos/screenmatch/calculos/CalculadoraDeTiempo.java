package com.aluracursos.screenmatch.calculos;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;


public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal(){
        return tiempoTotal ;
    }
//polimorfismo para no llamar a una clase pelicula y serie por separador
    //podemos llamar a una clase titulo que es la padre la cual contiene a esas dos
    //sub clases ya llamada
    
    public void incluye(Titulo titulo){
        this.tiempoTotal +=titulo.getDuracionEnMinutos();

    }
}
