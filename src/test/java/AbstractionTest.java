import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AbstractionTest {

    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void calculateWage() {
        Person p = new Person("yaseen",32,12,14.0,4);
        Wage w = new Person("yaseen",32,12,14.0,4);
        double actual = p.getWage();
        Assert.assertEquals(w.calculateWage(),actual);
    }
}