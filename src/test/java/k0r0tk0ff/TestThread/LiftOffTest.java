
package k0r0tk0ff.TestThread;

import org.junit.Test;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;
import org.hamcrest.*;


/**
 * @(#)LiftOffTest.java
 *
 * Copyright (c)
 * Free to any use.
 *
 * @author_tester           k0r0tk0ff
 * @date		07/11/2016
 * @version		1
 *
 * Test methods for
 *
 */

public class LiftOffTest {
    @Test
    public void testLiftOff() throws Exception {

        /**
         * Checking the LiftOff method
         */

        LiftOff liftOff = new LiftOff(1);
        liftOff.run();

        /**
         * Check out to console
         */
        //System.out.println(liftOff.array.get(0));

        assertThat("#0#LiftOff!", equalTo(liftOff.array.get(0)));

        /**need to use assertThat from developer`s test packet hamcrest-all
         * /http://www.vogella.com/tutorials/Hamcrest/article.html
         * https://en.wikipedia.org/wiki/Hamcrest
         * http://hamcrest.org/JavaHamcrest/
         */
    }
}