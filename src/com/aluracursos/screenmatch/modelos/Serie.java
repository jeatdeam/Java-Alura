package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo{

    int temporadas;
    int episodiosPorTemporada;
    int minutosPorEpisodio ;

    @Override
    public int getDuracionEnMinutos() {
        return temporadas*episodiosPorTemporada*minutosPorEpisodio;
    }

    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;

    }
    public int getTemporadas(){
        return temporadas;
    }
    public void setEpisodiosPorTemporada(int EpisodiosPorTemporada){
        this.episodiosPorTemporada = EpisodiosPorTemporada;
    }
    public void getEpisodiosPorTemporada(){
        System.out.println("Temporadas: " + temporadas);
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
    public void getMinutosPorEpisodio(){
        System.out.println(minutosPorEpisodio);
    }
}
