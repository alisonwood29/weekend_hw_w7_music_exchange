import Instruments.Guitar;
import Instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(Type.STRING, "Yamaha GL1", "Brown", "Wood", 44, 62, 6);
    }

    @Test
    public void hasType(){
        assertEquals(Type.STRING, guitar.getType());
    }

    @Test
    public void hasModel(){
        assertEquals("Yamaha GL1", guitar.getModel());
    }

    @Test
    public void hasColour(){
        assertEquals("Brown", guitar.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(44, guitar.getBuyPrice(), 0.1);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(62, guitar.getSellPrice(), 0.1);
    }

    @Test
    public void hasStrings(){
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Strumming away", guitar.play());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(18, guitar.calculateMarkUp(), 0.1);
    }
}
