import Instruments.Guitar;
import Instruments.Type;
import MusicShop.MusicShop;
import SellableItems.Tshirt;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;
    Guitar guitar;
    Tshirt tshirt;

    @Before
    public void before(){
        musicShop = new MusicShop("Ray's Music Exchange", 1500);
        guitar = new Guitar(Type.STRING, "Yamaha GL1", "Brown", "Wood", 44, 62, 6);
        tshirt = new Tshirt("M", "Reading Festival 2017 Official", 6, 11.99);
    }

    @Test
    public void hasName(){
        assertEquals("Ray's Music Exchange", musicShop.getName());
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, musicShop.stockCount());
    }

    @Test
    public void hasBudget(){
        assertEquals(1500, musicShop.getBudget(), 0.1);
    }

    @Test
    public void canAddAGuitarToStock(){
        musicShop.addToStock(guitar);
        assertEquals(1, musicShop.stockCount());
        assertEquals(1456, musicShop.getBudget(), 0.1);
    }

    @Test
    public void canAddTshirtToStock(){
        musicShop.addToStock(tshirt);
        assertEquals(1, musicShop.stockCount());
    }

    @Test
    public void cantAddToStockIfOverBudget(){
        MusicShop musicShop1 = new MusicShop("Ray's Music Exchange", 80);
        musicShop1.addToStock(guitar);
        musicShop1.addToStock(guitar);
        assertEquals(1, musicShop1.stockCount());
    }

    @Test
    public void canRemoveFromStock(){
        musicShop.addToStock(guitar);
        musicShop.removeStock(guitar);
        assertEquals(0, musicShop.stockCount());
        assertEquals(1518.0, musicShop.getBudget(), 0.1);
    }

    @Test
    public void canCalculatePotentialProfit(){
        musicShop.addToStock(guitar);
        musicShop.addToStock(tshirt);
        assertEquals(23.99, musicShop.potentialProfit(), 0.1);
    }

}
