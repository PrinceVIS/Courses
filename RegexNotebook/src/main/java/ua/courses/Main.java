package ua.courses;

import ua.courses.controller.Controller;
import ua.courses.model.Model;
import ua.courses.view.View;

/**
 * @version 0.1
 * @author Vlad Saprykin
 * Created on 2 Sep 2021
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
