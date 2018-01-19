import MusicShop.ISellable;
import SellableItems.Tshirt;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TshirtTest{

    Tshirt tshirt;

    @Before
    public void before(){
        tshirt = new Tshirt("S", "Kings of Leon band picture", 6, 12.99);
    }

    @Test
    public void hasSize(){
        assertEquals("S", tshirt.getSize());
    }

    @Test
    public void hasDescription(){
        assertEquals("Kings of Leon band picture", tshirt.getDescription());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(6, tshirt.getBuyPrice(), 0.1);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(12.99, tshirt.getSellPrice(), 0.1);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(6.99, tshirt.calculateMarkUp(), 0.1);
    }
}
