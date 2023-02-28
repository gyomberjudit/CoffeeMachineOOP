import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class testMain {
    Main main = new Main();

    @Test
    public void testString() {
        String testString = "aa bbb cccc ddeedd";
        String[] testArray = {"bbb", "ee"};

        assertEquals("aa *** cccc dd**dd", main.string(testString, testArray));
    }

    @Test
    public void testCreateCoffee() {
        CoffeeMachine machine = new CoffeeMachine();
        Coffee coffee = machine.createCoffee(CoffeeType.AMERICANO);
        assertInstanceOf(Americano.class, coffee);
        assertEquals(1, coffee.milkRatio());
    }
}
