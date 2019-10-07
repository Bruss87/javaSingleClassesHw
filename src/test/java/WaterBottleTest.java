import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    private WaterBottle myWater;

    @Before
    public void before (){ myWater = new WaterBottle(100);}

    @Test
    public void hasVolume() {assertEquals(100, myWater.getVolume());}

    @Test
    public void isReducingVolume() {assertEquals(90, myWater.drink());}

    @Test
    public void isEmpty(){assertEquals(0, myWater.empty());}

    @Test
    public void isFull(){
        WaterBottle newWater = new WaterBottle(0);
        assertEquals(100, newWater.fill());}
}
