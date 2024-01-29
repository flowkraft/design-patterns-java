// Client
public class Application {
    private Button button;
    private Window window;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        window = factory.createWindow();
    }

    public void paint() {
        button.paint();
        window.paint();
    }

    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory();
        Application app = new Application(factory);
        app.paint();
    }
}
