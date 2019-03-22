import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UnitTest1 {

    private Speed speed;

    @Before
    public void setup() {
        this.speed = new Speed(new KmPerHour(), 10);
    }

    @Test
    public void test001_ASpeedValueWhenIncreasePercentShouldUpdateValue() {
        this.speed.increasePercentage(10d);
        assertThat(speed.getMagnitude(), is(11d));
    }

    @Test (expected = NegativePercentageException.class)
    public void test002_aSpeedValueWhenNegativePercentShouldThrowException() {
        this.speed.increasePercentage(-10d);
    }
}
