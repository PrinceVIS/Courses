import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void guessTheNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            number = scanNumber(scanner);
            processNumber(number);
        } while (number != model.getRandomNumber());
    }

    private int scanNumber(Scanner scanner) {
        int number = model.getMinNumber();
        do {
            view.printRange(model.getMinNumber(), model.getMaxNumber());
            view.printMessage(View.GUESS);
            if (scanner.hasNextInt()){
                number = scanner.nextInt();
            } else {
                view.printMessage(View.WRONG_INPUT);
                view.printRange(model.getMinNumber(), model.getMaxNumber());
            }
            scanner.nextLine();
        } while (number <= model.getMinNumber() || number >= model.getMaxNumber());
        return number;
    }

    private void processNumber(int number) {
        switch (model.check(number)) {
            case 0:
                view.printMessage(View.WIN);
                view.printMessage(View.ATTEMPTS_COUNT + model.getAttempts());
                view.printRange(model.getMinNumber(), model.getMaxNumber());
                break;
            case -1:
                view.printMessage(View.LESS_THEN + number);
                model.setMaxNumber(number);
                break;
            case 1:
                view.printMessage(View.MORE_THEN + number);
                model.setMinNumber(number);
                break;
            default:
                view.printMessage(View.EXCEPTION);
        }
    }

}
