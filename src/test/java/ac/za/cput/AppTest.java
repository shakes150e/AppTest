package ac.za.cput;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Ignore
    @Test
    public void disAbledTest(){
        Assert.assertEquals("","");
    }

    @Test
    public void FailingTest() {
            Assert.assertEquals("1","");
    }

    @Test
    public void objIdentity() {
        Assert.assertNotSame("1","");
    }
    @Test
    public void objEquality() {
        Assert.assertEquals("1","1");
    }

}
