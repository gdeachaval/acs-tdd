import org.junit.Before;
import org.junit.Test;

public class UnitTest1 {

    private Speed speed;

    @Before
    public void setup() {
        this.speed = new Speed(new KmPerHour(), 10);
    }


    @Test
    public void test001_ASpeedValueWhenIncreasePercentShouldUpdateValue() {

    }

}
