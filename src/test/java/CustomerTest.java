import Customer.Customer;
import Instruments.Guitar;
import Instruments.Saxophone;
import Instruments.Type;
import SellableItems.Tshirt;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Guitar guitar;
    Saxophone saxophone;
    Tshirt tshirt;

    @Before
    public void before(){
        customer = new Customer("Alison", 80);
        guitar = new Guitar(Type.STRING, "Yamaha GL1", "Brown", "Wood", 44, 62, 6);
        saxophone = new Saxophone(Type.WOODWIND, "Elkhart 100", "Gold", "Yellow brass", 450, 649.90, "Alto");
        tshirt = new Tshirt("S", "Kings of Leon band picture", 6, 12.99);
    }

    @Test
    public void hasName(){
        assertEquals("Alison", customer.getName());
    }

    @Test
    public void hasWallet(){
        assertEquals(80, customer.getWallet(), 0.1);
    }

    @Test
    public void shoppingBagStartsEmpty(){
        assertEquals(0, customer.shoppingBagCount());
    }

    @Test
    public void canAddToShoppingBag(){
        customer.addToShoppingBag(guitar);
        assertEquals(1, customer.shoppingBagCount());
        assertEquals(18, customer.getWallet(), 0.1);
    }

    @Test
    public void cantAddToShoppingBagIfNotEnoughMoney(){
        customer.addToShoppingBag(saxophone);
        assertEquals(0, customer.shoppingBagCount());
        assertEquals(80, customer.getWallet(), 0.1);
    }

    @Test
    public void customerCanPlayInstrument(){
        assertEquals("Strumming away", customer.play(guitar));
    }

    @Test
    public void canPlayInstrumentsInShoppingBag(){
        customer.addToShoppingBag(guitar);
        customer.addToShoppingBag(tshirt);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Strumming away");
        assertEquals(expected, customer.playBoughtInstruments());
    }

    @Test
    public void canPlayInstrumentIfInShoppingBag(){
        customer.addToShoppingBag(guitar);
        assertEquals("Strumming away", customer.playBoughtInstrument(guitar));
    }

    @Test
    public void cantPlayInstrumentIfNotInShoppingBag(){
        assertEquals("You do not own this instrument", customer.playBoughtInstrument(saxophone));
    }


}
