public class View {
    public static final String WRONG_INPUT =
            "Wrong input! If it's number - it's out of range!";
    public static final String WIN =
            "Congratulations! You've guessed the number! ";
    public static final String GUESS = "Try to guess the number: ";
    public static final String LESS_THEN = "The number is less then ";
    public static final String MORE_THEN = "The number is more then ";
    public static final String CURRENT_RANGE = "Current range: ";
    public static final String TO = " to ";
    public static final String ATTEMPTS_COUNT = "Your attempts: ";
    public static final String EXCEPTION = "Some exception occurred";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printRange(int minNumber, int maxNumber) {
        System.out.println(CURRENT_RANGE + (minNumber + 1) + TO + (maxNumber - 1));
    }
}
