import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GUITest {
    @Test
    public void testWindowsFactory() {
        GUIFactory factory = new WindowsFactory();
        Button button = factory.createButton();
        Window window = factory.createWindow();
        assertTrue(button instanceof WindowsButton);
        assertTrue(window instanceof WindowsWindow);
    }

    @Test
    public void testMotifFactory() {
        GUIFactory factory = new MotifFactory();
        Button button = factory.createButton();
        Window window = factory.createWindow();
        assertTrue(button instanceof MotifButton);
        assertTrue(window instanceof MotifWindow);
    }
}
