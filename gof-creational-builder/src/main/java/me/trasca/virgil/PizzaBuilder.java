// Participant: Builder
public interface PizzaBuilder {
    PizzaBuilder prepareDough();
    PizzaBuilder addSauce();
    PizzaBuilder addToppings();
    Pizza build();
}
