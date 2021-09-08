import courses.mvc.Model;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ModelTest {

    Model model;

    @Before
    public void setUp() {
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
    public void randWithMax() {
        int maxNumber = model.getMaxNumber();
        int number;
        for (int i = 0; i < Math.abs(maxNumber) * 100; i++) {
            number = Model.rand(maxNumber);
            assertTrue(number > model.getMinNumber() && number < model.getMaxNumber());
        }
    }

    @Test
    public void testWithRange() {
        int maxNumber = model.getMaxNumber();
        int minNumber = model.getMinNumber();
        int number;
        for (int i = 0; i < (Math.abs(minNumber) + Math.abs(maxNumber)) * 100; i++) {
            number = Model.rand(maxNumber);
            assertTrue(number > model.getMinNumber() && number < model.getMaxNumber());
        }
    }

    @Test
    public void checkLess() {
        assertEquals(-1, model.check(model.getMaxNumber()));
    }

    @Test
    public void checkMore() {
        assertEquals(1, model.check(model.getMinNumber()));
    }

    @Test
    public void checkEquals() {
        assertEquals(0, model.check(model.getRandomNumber()));
    }
}