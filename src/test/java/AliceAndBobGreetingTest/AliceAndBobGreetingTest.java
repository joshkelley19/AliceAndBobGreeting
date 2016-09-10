package AliceAndBobGreetingTest;

import org.junit.Assert;
import org.junit.Test;
import AliceAndBobGreeting.*;

/**
 * Created by joshuakelley on 9/9/16.
 */
public class AliceAndBobGreetingTest {
    @Test
    public void aliceBobTest(){
        AliceAndBobGreeting test = new AliceAndBobGreeting();
        Assert.assertEquals("Should return Hello Alice", "Hello Alice", test.greet("Alice"));
    }
}
