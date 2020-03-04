import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EncapsulationTest {
    private Person p;
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void returnNum() {
        int actual = p.returnNum();
        Assert.assertEquals(5,actual);

    }
}