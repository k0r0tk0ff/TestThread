package k0r0tk0ff.TestThread;

import k0r0tk0ff.TestThread.LiftOff;

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
        System.out.println("Method one \n");


        LiftOff liftOff = new LiftOff(1);
        liftOff.run();

        /**
         * Method two.
         */

        System.out.println("\n\n Method two \n");

        Thread thread = new Thread(new LiftOff(10));
        thread.start();
    }
}

