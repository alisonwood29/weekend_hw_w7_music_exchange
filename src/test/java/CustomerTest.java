import Customer.Customer;
import Instruments.Guitar;
import Instruments.Saxophone;
import Instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Guitar guitar;
    Saxophone saxophone;

    @Before
    public void before(){
        customer = new Customer("Alison", 80);
        guitar = new Guitar(Type.STRING, "Yamaha GL1", "Brown", "Wood", 44, 62, 6);
        saxophone = new Saxophone(Type.WOODWIND, "Elkhart 100", "Gold", "Yellow brass", 450, 649.90, "Alto");
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


}
