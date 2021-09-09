package ua.courses.view;

import static ua.courses.controller.ResourceBundleController.resourceBundle;
import static ua.courses.view.StringConstants.INPUT;
import static ua.courses.view.StringConstants.WRONG_INPUT;

public class View {


    /**
     * @param message any message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printWrongMessage() {
        printMessage(resourceBundle.getString(WRONG_INPUT));
    }

    public void printInputData(String message) {
        printMessage(resourceBundle.getString(INPUT)
                + resourceBundle.getString(message));
    }
    public void printWrongInput(String message) {
        printMessage(resourceBundle.getString(WRONG_INPUT)
                + resourceBundle.getString(INPUT)
                + resourceBundle.getString(message));
    }


}
