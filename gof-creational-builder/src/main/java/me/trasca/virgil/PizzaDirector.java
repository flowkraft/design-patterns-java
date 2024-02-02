// Participant: Director
public class PizzaDirector {
    private PizzaBuilder builder;
    
    public PizzaDirector(PizzaBuilder builder) {
        this.builder = builder;
    }
    
    public Pizza makePizza() {
        return builder.prepareDough()
                      .addSauce()
                      .addToppings()
                      .build();
    }
}
