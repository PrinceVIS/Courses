package ua.courses.controller;

import ua.courses.database.Connector;
import ua.courses.model.ExistingUserException;
import ua.courses.model.Model;
import ua.courses.view.View;

import java.util.Scanner;

import static ua.courses.controller.ResourceBundleController.regexpBundle;
import static ua.courses.view.StringConstants.*;

public class Controller {
    private final Model model;
    private final View view;
    private final Connector connector;
    private static final Scanner SCANNER = new Scanner(System.in);


    public Controller(Model model, View view, Connector connector) {
        this.model = model;
        this.view = view;
        this.connector = connector;
    }

    public void processUser() {
        processFirstName();
        processLastName();
        processPatronimic();
        processLogin();

    }

    private void processLogin(){
        String login;
        do {
            login = inputString(LOGIN,
                    regexpBundle.getString(LOGIN_REGEXP));
            try {
                if (isLoginUnique(login)) {
                    model.setLogin(login);
                }
            } catch (ExistingUserException e) {
                view.printWrongMessage();
            }
        } while (model.getLogin() == null);
    }

    private void processPatronimic() {
        model.setPatronymic(inputString(PATRONYMIC,
                regexpBundle.getString(FULL_NAME_REGEXP)));
    }

    private void processFirstName() {
        model.setFirstName(inputString(FIRST_NAME,
                regexpBundle.getString(FULL_NAME_REGEXP)));
    }

    private void processLastName() {
        model.setLastName(inputString(LAST_NAME,
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


    private boolean isLoginUnique(String login) throws ExistingUserException {
        String[] logins = connector.getLoginsFromDB();
        for (int i = 0; i < logins.length; i++) {
            if (logins[i].equals(login))
                throw new ExistingUserException();
        }
        return true;
    }
}
