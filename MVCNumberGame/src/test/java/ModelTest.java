import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModelTest {

    Model model;

    @Before
    public void setUp() throws Exception {
        model = new Model();
    }

    @Test
    public void get1Attempt() {
        model.check(50);
        assertEquals(1, model.getAttempts());
    }

    @Test
    public void get2Attempts() {
        model.check(50);
        model.check(51);
        assertEquals(2, model.getAttempts());
    }

    @Test
    public void rand() {
    }

    @Test
    public void testRand() {
    }

    @Test
    public void check() {
    }
}