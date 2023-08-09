package com.backend.digitalhouse;

import org.apache.log4j.Logger;

public abstract class Animal {

    private static final Logger LOGGER = Logger.getLogger(Animal.class);

    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        if (edad < 0){
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        this.edad = edad;
        //LOGGER.info("Se creo un nuevo animal: " + nombre + " edad "+ edad);
    }

    public abstract void correr();

    public abstract void esMayorA10(int edad);

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
