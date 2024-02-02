import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MargheritaPizzaBuilderTest {
    private PizzaBuilder builder;
    private Pizza pizza;

    @BeforeEach
    void setUp() {
        builder = new MargheritaPizzaBuilder();
        pizza = builder.prepareDough().addSauce().addToppings().build();
    }

    @Test
    void testDoughType() {
        assertEquals("Thin Crust", pizza.getDough(), "Dough type should be 'Thin Crust'");
    }

    @Test
    void testSauceType() {
        assertEquals("Tomato", pizza.getSauce(), "Sauce should be 'Tomato'");
    }

    @Test
    void testToppings() {
        assertTrue(pizza.getToppings().contains("Mozzarella"), "Pizza should contain 'Mozzarella'");
        assertTrue(pizza.getToppings().contains("Basil"), "Pizza should contain 'Basil'");
    }

    @Test
    void testNumberOfToppings() {
        assertEquals(2, pizza.getToppings().size(), "Pizza should have exactly 2 toppings");
    }
}
