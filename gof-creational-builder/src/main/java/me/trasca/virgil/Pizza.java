import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String dough;
    private String sauce;
    private List<String> toppings = new ArrayList<>();

    public Pizza() {
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getToppings() {
        return new ArrayList<>(toppings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pizza with ");
        sb.append(dough).append(" dough, ");
        sb.append(sauce).append(" sauce, ");
        if (!toppings.isEmpty()) {
            sb.append("toppings: ");
            sb.append(String.join(", ", toppings));
        } else {
            sb.append("no toppings");
        }
        return sb.toString();
    }
}
