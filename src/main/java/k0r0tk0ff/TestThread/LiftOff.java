package k0r0tk0ff.TestThread;

import java.util.ArrayList;

/**
 * @(#)LiftOff.java
 *
 * Copyright (c)
 * Free to any use.
 *
 * @author    Bryus Ekkel
 * @author    k0r0tk0ff
 * @since 		07/11/2016
 * @version		1
 *
 * Countdown with use threads.
 * (Programm test threads)
 *
 * Use SOLID princips.
 */
public class LiftOff implements Runnable {
    protected int countDown = 10;
    protected ArrayList<String> array = new ArrayList<>();

    /**
     * Theese variable need to understand,
     * that in every thread id rather
     * (+1 in every thread)
     */
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff(){}
    public LiftOff(int countDown){
        this.countDown = countDown;
    }

    public String status(){
        return "#" + id + "#" +
                (countDown > 0 ? countDown: "LiftOff!");
    }

    public void run(){
        while(countDown-- > 0){
            System.out.println(status());
            array.add(status());
            Thread.yield();
        }
    }
}
