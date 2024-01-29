// ConcreteFactory2
public class MotifFactory implements GUIFactory {
    public Button createButton() {
        return new MotifButton();
    }
    public Window createWindow() {
        return new MotifWindow();
    }
}
