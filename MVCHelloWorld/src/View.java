import java.util.Iterator;

public class View {
    public static final String HELLO = "Hello";
    public static final String WORLD = "world!";
    public static final String INPUT = "Type your message: ";
    public static final String WRONG_INPUT = "You've typed wrong message!\n";
    public static final String WRONG_HELLO_INPUT = "You've typed wrong message! Write 'Hello'\n";
    public static final String WRONG_WORLD_INPUT = "You've typed wrong message! Write 'world!'\n";

    public View() {
    }

    public void printMessage(String message){
        System.out.print(message);
    }

    public void printAllValues(Model model){
        for (int i = 0; i < model.getSize(); i++) {
            printMessage(model.getValue(i));
        }
    }
}
