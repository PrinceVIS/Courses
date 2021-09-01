import java.util.Scanner;

public class Controller {
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void inputStringValue(Scanner scanner, String correctValue) {
        String resultValue;
        int size = model.getSize();
        do {
            view.printMessage(View.INPUT);
            resultValue = scanner.next();
            if (correctValue.equals(resultValue)) {
                model.addValue(resultValue + " ");
            } else {
                view.printMessage(model.validateValue(correctValue));
            }
        } while (model.getSize() == size);
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        inputStringValue(scanner, View.HELLO);
        inputStringValue(scanner, View.WORLD);
        view.printAllValues(model);
    }
}
