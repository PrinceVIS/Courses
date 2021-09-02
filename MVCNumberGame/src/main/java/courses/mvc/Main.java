package courses.mvc;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        //model.setRange(-1000,1000);
        controller.guessTheNumber();
    }
}
