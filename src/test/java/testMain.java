import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class testMain {
    Main main = new Main();

    @Test
    public void testCreateCoffee() {
        CoffeeMachine machine = new CoffeeMachine();
        Coffee coffee = machine.createCoffee(CoffeeType.AMERICANO);
        assertInstanceOf(Americano.class, coffee);
        assertEquals(1, coffee.milkRatio());
    }

    @Test
    public void testCreateCoffee2() {
        CoffeeMachine machine = new CoffeeMachine();
        Coffee coffee = machine.createCoffee(CoffeeType.CAPUCINO);
        assertInstanceOf(Capucino.class, coffee);
        assertEquals(1, coffee.milkRatio());
    }
}
