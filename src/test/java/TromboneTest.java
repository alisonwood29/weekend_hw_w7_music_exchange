import Instruments.Trombone;
import Instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TromboneTest {

    Trombone trombone;

    @Before
    public void before(){
        trombone = new Trombone(Type.BRASS, "pBone", "Purple", "Plastic", 18, 24.95, 3);
    }

    @Test
    public void hasType(){
        assertEquals(Type.BRASS, trombone.getType());
    }

    @Test
    public void hasModel(){
        assertEquals("pBone", trombone.getModel());
    }

    @Test
    public void hasColour(){
        assertEquals("Purple", trombone.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Plastic", trombone.getMaterial());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(18, trombone.getBuyPrice(), 0.1);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(24.95, trombone.getSellPrice(), 0.1);
    }

    @Test
    public void hasValves(){
        assertEquals(3, trombone.getValves());
    }

    @Test
    public void canPlay(){
        assertEquals("Sliding up and down", trombone.play());
    }
}
