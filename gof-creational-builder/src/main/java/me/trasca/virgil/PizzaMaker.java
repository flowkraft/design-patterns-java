// Participant: Client
public class PizzaMaker {
    public static void main(String[] args) {
        PizzaBuilder builder = new MargheritaPizzaBuilder();
        PizzaDirector director = new PizzaDirector(builder);
        Pizza pizza = director.makePizza();
        System.out.println(pizza);
    }
}
