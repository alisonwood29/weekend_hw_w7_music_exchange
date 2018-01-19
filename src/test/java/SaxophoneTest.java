import Instruments.Saxophone;
import Instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone(Type.WOODWIND, "Elkhart 100", "Gold", "Yellow brass", 450, 649.90, "Alto");
    }

    @Test
    public void hasType(){
        assertEquals(Type.WOODWIND, saxophone.getType());
    }

    @Test
    public void hasModel(){
        assertEquals("Elkhart 100", saxophone.getModel());
    }

    @Test
    public void hasColour(){
        assertEquals("Gold", saxophone.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Yellow brass", saxophone.getMaterial());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(450, saxophone.getBuyPrice(), 0.1);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(649.90, saxophone.getSellPrice(), 0.1);
    }

    @Test
    public void hasSize(){
        assertEquals("Alto", saxophone.getSize());
    }

    @Test
    public void canPlay(){
        assertEquals("Puffing away", saxophone.play());
    }
}
