package k0r0tk0ff.TestThread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @(#)ThreadSum.java
 *
 * Copyright (c)
 * Free to any use.
 *
 * @author    gkislin
 * @author    k0r0tk0ff
 * @since 		28/01/2016
 * @version		1
 *
 * logic of programm whith AtomicInteger.
 * (Programm test threads)
 *
 * Use SOLID princips.
 */
public class ThreadSum {
    static volatile int sum;
    static final AtomicInteger ATOMIC_SUM = new AtomicInteger();

    public static void main(String ... args) {
        for (int i = 0; i < 1000; i++) {
            new Thread() {
                @Override
                public void run() {
                    ATOMIC_SUM.incrementAndGet();
                }
            }.start();
            System.out.println(ATOMIC_SUM.get());
        }
    }
}
