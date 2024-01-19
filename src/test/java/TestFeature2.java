import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class TestFeature2 {

    private util.Counter counter;

    @Before
    public void setUp() {
        counter = new util.Counter();
    }

    @Test
    public void testIncrementToPrime() {
        counter._ctr = 7;
        counter.incrementToPrime();
        Assert.assertEquals(11, counter._ctr);
    }

    @Test
    public void testDecrementToPrime() {
        counter._ctr = 37;
        counter.decrementToPrime();
        Assert.assertEquals(31, counter._ctr);
    }
}