package ua.courses.view;

import static ua.courses.controller.ResourceBundleController.resourceBundle;
import static ua.courses.view.StringConstants.INPUT;
import static ua.courses.view.StringConstants.WRONG_INPUT;

public class View {


    /**
     *
     * @param message any message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

//    public void printDataMessage(String dataMessage) {
//        printMessage(bundle.getString(INPUT) + bundle.getString(dataMessage));
//    }

    public String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString.append(v);
        }
        return new String(concatString);
    }

    public void printStringInput(String message) {
        printMessage(concatenationString(
                resourceBundle.getString(INPUT),
                resourceBundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                resourceBundle.getString(WRONG_INPUT),
                resourceBundle.getString(INPUT),
                resourceBundle.getString(message)));
    }


}
