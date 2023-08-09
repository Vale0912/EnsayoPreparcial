package com.backend.digitalhouse;

import org.apache.log4j.Logger;

public class main {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(main.class);



        try{
            Leon leon1 = new Leon("Simba", 9);
            Leon leon2 = new Leon("Bom", 11);

            Tigre tigre1 = new Tigre("Scar",10);
            Tigre tigre2 = new Tigre("Mufasa", 0);

            leon1.correr();
            leon2.correr();
            leon1.esMayorA10(leon1.getEdad());
            leon2.esMayorA10(leon2.getEdad());
            tigre1.correr();
            tigre1.esMayorA10(tigre1.getEdad());

        }
        catch (IllegalArgumentException e){
            logger.error(e.getMessage());

        }


    }
}
