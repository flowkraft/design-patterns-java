// Participant: ConcreteBuilder for Margherita Pizza
public class MargheritaPizzaBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();
    
    public MargheritaPizzaBuilder prepareDough() {
        pizza.setDough("Thin Crust");
        return this;
    }
    
    public MargheritaPizzaBuilder addSauce() {
        pizza.setSauce("Tomato");
        return this;
    }
    
    public MargheritaPizzaBuilder addToppings() {
        pizza.addTopping("Mozzarella");
        pizza.addTopping("Basil");
        return this;
    }
    
    public Pizza build() {
        return pizza;
    }
}
