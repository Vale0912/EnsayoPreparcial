package com.backend.digitalhouse;


import org.apache.log4j.Logger;

public class Leon extends Animal{

    private boolean esAlfa;
    private static final Logger LOGGER = Logger.getLogger(Leon.class);

    public Leon(String nombre, int edad) {
        super(nombre, edad);
        if (edad < 0) {
            LOGGER.error("La edad del león es menor a cero"); // Log de error
            throw new IllegalArgumentException("La edad no puede ser menor a cero");
    }}


    @Override
    public void correr() {
        //Sout será reemplazado por un logger
        //System.out.println("El León esta corriendo");
        //Implementando el logger
        LOGGER.info("El León" + this.getNombre() + " esta corriendo");
    }

    public void esMayorA10(int edad){
        if(this.getEdad() > 10){
            //Sout será reemplazado por un logger
            //System.out.println("La edad del león es mayor a 10");
            //Implementando el logger
            LOGGER.info("La edad del león es mayor a 10");
        } else {
            //Implementando el logger
            LOGGER.info("La edad del león es menor a 10");
            //System.out.println("La edad del león es menor a 10");
        }
    }

    public void esAlfa(){
        if(this.esAlfa){
            //Sout será reemplazado por un logger
            //System.out.println("El león es Alfa");
            //Implementando el logger
            LOGGER.info("El león es Alfa");
        }
    }

    public boolean isEsAlfa() {
        return esAlfa;
    }

    public void setEsAlfa(boolean esAlfa) {
        this.esAlfa = esAlfa;
    }
}
