package k0r0tk0ff.TestThread;

import java.util.ArrayList;

/**
 * Created by root on 11/8/16.
 */
public class Febonachi implements Runnable{

    /**
     * Theese variable need to understand,
     * that in every thread id rather
     * (+1 in every thread)
     */
    private static int taskCount = 0;
    private final int id = taskCount++;

    int limit = 5;
    int buffer;

    public Febonachi() {}

    public Febonachi(int limit) {
        this.limit = limit;
    }


    public void run() {
        ArrayList<Integer> exit_list = new ArrayList<>(limit);
        if(limit == 0) exit_list.add(1);
        if(limit == 1) {exit_list.add(1); exit_list.add(1);}
        if(limit == 2) { exit_list.add(1); exit_list.add(1); exit_list.add(2);}

        if(limit>2) { exit_list.add(1); exit_list.add(1); exit_list.add(2);
            for (int i = 3; i < limit; i++) {
                buffer = exit_list.get(i-1) + exit_list.get(i-2);
                exit_list.add(buffer);
            }
        }

        for (Object o : exit_list.toArray()) {
            System.out.println(" (Thread:" + id + ") " + o);
        }

        //for(int j = 0; j < exit_list.arr; j++) {
        //    System.out.println(exit_list.get(j));
        //}

        Thread.yield();

    }
}

