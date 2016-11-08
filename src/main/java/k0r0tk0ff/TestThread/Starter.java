package k0r0tk0ff.TestThread;

import k0r0tk0ff.TestThread.LiftOff;
import k0r0tk0ff.TestThread.Febonachi;


/**
 * @(#)Starter.java
 *
 * Copyright (c)
 * Free to any use.
 *
 * @author    Bryus Ekkel
 * @author    k0r0tk0ff
 * @since 		07/11/2016
 * @version		1
 *
 * Start of main logic of programm.
 * (Programm test threads)
 *
 * Use SOLID princips.
 */

public class Starter {

    public static void main(String[] arg){

        System.out.println("Start success \n");

        /**
         * Method one.
         */
        //System.out.println("Method one \n");


        //LiftOff liftOff = new LiftOff(10);
        //liftOff.run();

        /**
         * Method two.
         */

        //System.out.println("\n\n Method two \n");

        //Thread thread = new Thread(new LiftOff(10));
        //thread.start();

        /**
         * Febbonachi
         */

        Thread thread5 = new Thread(new Febonachi(6));
        thread5.start();

        Thread thread6 = new Thread(new Febonachi(10));
        thread6.start();

        Thread thread7 = new Thread(new Febonachi(10));
        thread7.start();
    }
}

