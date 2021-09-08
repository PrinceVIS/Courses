package ua.courses;

import ua.courses.controller.Controller;
import ua.courses.database.Connector;
import ua.courses.model.Model;
import ua.courses.view.View;

/**
 * @author Vlad Saprykin
 * Created on 2 Sep 2021
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        Connector connector = new Connector();
        connector.initConnection();
//        controller.processUser();
        connector.closeConnection();
    }
}
