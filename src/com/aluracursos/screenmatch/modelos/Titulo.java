package com.aluracursos.screenmatch.modelos;

public class Titulo
{
        private String nombre;
        private int fechaDeLanzamiento;
        private int duracionEnMinutos;
        private boolean incluidoEnElPlan;
        private double sumaDeLasEvaluaciones;
        private int totalDeLasEvaluaciones;


        public boolean getIncluidoEnElPlan() {
            return incluidoEnElPlan;
        }

        public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
            this.incluidoEnElPlan = incluidoEnElPlan;
        }

        public int getDuracionEnMinutos() {
            return duracionEnMinutos;
        }

        public void setDuracionEnMinutos(int duracionEnMinutos) {
            this.duracionEnMinutos = duracionEnMinutos;
        }

        public int getFechaDeLanzamiento() {
            return fechaDeLanzamiento;
        }

        public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
            this.fechaDeLanzamiento = fechaDeLanzamiento;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public void muestraFichaTecnica(){
            System.out.println("El nombre de la pelicula es: "+nombre);
            System.out.println("Su fecha de lanzamiento es: "+fechaDeLanzamiento);
            System.out.println("Duracion en minutos: "+getDuracionEnMinutos());
        }
        public void evalua(double nota){
            sumaDeLasEvaluaciones+=nota;
            totalDeLasEvaluaciones++;
        }
        public double calcularMedia(){
               return duracionEnMinutos/totalDeLasEvaluaciones;
        }
}
