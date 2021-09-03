package ua.courses.controller;

import ua.courses.model.Model;
import ua.courses.view.View;

import java.util.Scanner;

import static ua.courses.controller.ResourceBundleController.regexpBundle;
import static ua.courses.view.StringConstants.*;

public class Controller {
    private final Model model;
    private final View view;
    private static final Scanner SCANNER = new Scanner(System.in);


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        model.setLastName(inputString(LAST_NAME,
                regexpBundle.getString(FULL_NAME_REGEXP)));
        model.setFirstName(inputString(FIRST_NAME,
                regexpBundle.getString(FULL_NAME_REGEXP)));
        model.setPatronymic(inputString(PATRONYMIC,
                regexpBundle.getString(FULL_NAME_REGEXP)));
    }

    private String inputString(String message, String regex) {
        view.printInputData(message);
        String result;
        while (!(SCANNER.hasNext() && (result = SCANNER.next()).matches(regex))) {
            view.printWrongInput(message);
        }
        return result;
    }
}
