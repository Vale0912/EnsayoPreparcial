package com.backend.digitalhouse;


import org.apache.log4j.Logger;

public class Tigre extends Animal{

    private static final Logger LOGGER = Logger.getLogger(Tigre.class);

    public Tigre(String nombre, int edad) {
        super(nombre, edad);
        if (edad < 0) {
            LOGGER.error("La edad del león es menor a cero"); // Log de error
            throw new IllegalArgumentException("La edad no puede ser menor a cero");}
    }

    @Override
    public void correr() {
        //Sout será reemplazado por un logger
        //System.out.println("El tigre esta corriendo");
        //Implementando el logger
        LOGGER.info("El tigre esta corriendo");
    }

    public void esMayorA10(int edad){
        if(this.getEdad() > 10){
            //Sout será reemplazado por un logger
            //System.out.println("La edad del tigre es mayor a 10 y el Alfa");
            //Implementando el logger
            LOGGER.info("La edad del tigre es mayor a 10");
        } else {
            //System.out.println("La edad del tigre es menor a 10");
            //Implementando el logger
            LOGGER.info("La edad del tigre es menor a 10");
        }
    }
}
