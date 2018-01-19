import SellableItems.Reeds;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReedsTest {

    Reeds reeds;

    @Before
    public void before(){
        reeds = new Reeds("Single", 4, 2, 3.99);
    }

    @Test
    public void hasType(){
        assertEquals("Single", reeds.getType());
    }

    @Test
    public void hasNumberInBox(){
        assertEquals(4, reeds.getNumberInBox());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(2, reeds.getBuyPrice(), 0.1);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(3.99, reeds.getSellPrice(), 0.1);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(1.99, reeds.calculateMarkUp(), 0.1);
    }
}
