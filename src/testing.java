import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class testing {
    /*
    Definition of testing functions are underneath
    */
    Main homework1;

    @Test
    public void testExercise1() {
        //If the following lines give you no error then your code works fine :) ! You should not touch those tests.
        assertEquals(811181, homework1.exercise1(9119));
        assertEquals(4114, homework1.exercise1(2112));
        assertEquals(0, homework1.exercise1(0));
        assertEquals(361649, homework1.exercise1(6423));
        assertEquals(25162564, homework1.exercise1(5458));
        assertEquals(1681649, homework1.exercise1(4983));
    }
}
    @Test
    public void testExercise2() {
        //If the following lines give you no error then your code works fine :) ! You should not touch those tests.
        assertArrayEquals(homework1.exercise2(new long[]{1, 2, 3}, 2), new long[]{2, 4, 6});
        assertArrayEquals(homework1.exercise2(new long[]{1, 2, 3, 4, 5}, -1), new long[]{-1, -2, -3, -4, -5});
        assertArrayEquals(homework1.exercise2(new long[]{42}, 5134), new long[]{215628});
        assertArrayEquals(homework1.exercise2(new long[]{4, 8, 94, 25, 9}, 1), new long[]{4, 8, 94, 25, 9});
        assertArrayEquals(homework1.exercise2(new long[]{1, 2, 3}, 0), new long[]{0, 0, 0});
        assertArrayEquals(homework1.exercise2(new long[]{}, 5678), new long[]{});
    }

    @Test
    public void testExercise3() {
        //If the following lines give you no error then your code works fine :) ! You should not touch those tests.
        assertEquals("nahsirk", homework1.exercise3("krishan"));
        assertEquals("nortlu", homework1.exercise3("ultr53o?n"));
        assertEquals("", homework1.exercise3(""));
        assertEquals("", homework1.exercise3("!*)[!&@)$*"));
        assertEquals("zcuthu", homework1.exercise3("uh(tucz§0"));
        assertEquals("ioPilK", homework1.exercise3("Kl98i$*Poi"));
    }

    @Test
    public void testExercise4() {
        //If the following lines give you no error then your code works fine :) ! You should not touch those tests.
        assertEquals("Camilelea", homework1.exercise4("Camillelleeaa"));
        assertEquals("l", homework1.exercise4("lllllllll"));
        assertEquals("abcde", homework1.exercise4("aabbccddee"));
        assertEquals("", homework1.exercise4(""));
        assertEquals("Asignment", homework1.exercise4("Assignment"));
        assertEquals("Aah finaly done !", homework1.exercise4("Aaaaahhh finally done        !"));
    }
}

*/
