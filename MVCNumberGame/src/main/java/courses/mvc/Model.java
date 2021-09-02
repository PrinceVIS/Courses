package courses.mvc;

public class Model {
    private final int randomNumber;
    private int minNumber = 0;
    private int maxNumber = 100;
    private int attempts = 0;

    public Model() {
        this.randomNumber = rand(maxNumber);
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public void setRange(int minNumber, int maxNumber) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }

    public static int rand(int min, int max) {
        return (int) (Math.random() * (max - 1) - (min - 1));
    }

    public static int rand(int max) {
        return (int) (Math.random() * (max - 1) + 1);
    }

    public int check(int number) {
        attempts++;
        if (number < randomNumber)
            return 1;
        else if (number > randomNumber)
            return -1;
        return 0;
    }

}
