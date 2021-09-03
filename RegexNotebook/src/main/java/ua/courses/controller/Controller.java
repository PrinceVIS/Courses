package ua.courses.controller;

import ua.courses.model.Model;
import ua.courses.view.View;

import java.util.Scanner;

import static ua.courses.controller.ResourceBundleController.regexpBundle;
import static ua.courses.view.StringConstants.FIRST_NAME;
import static ua.courses.view.StringConstants.FULL_NAME_REGEXP;

public class Controller {
    private final Model model;
    private final View view;


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        inputStringValueWithScanner(FIRST_NAME, regexpBundle.getString(FULL_NAME_REGEXP));
    }

//    public void inputNote() {
//        String str = (String.valueOf(View.resource_bundle.getLocale()).equals("ua"))
//                ? REGEX_NAME_UKR : REGEX_NAME_LAT;
//
//        this.firstName = inputStringValueWithScanner
//                (FIRST_NAME, str);
//        this.login = inputStringValueWithScanner
//                (LOGIN_DATA, REGEX_LOGIN);
//    }

    String inputStringValueWithScanner(String message, String regex) {
        Scanner scanner = new Scanner(System.in);
        view.printStringInput(message);
        String res;
        while (!(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return res;
    }
}
