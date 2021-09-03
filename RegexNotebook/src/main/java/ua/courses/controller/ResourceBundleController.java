package ua.courses.controller;

import java.util.Locale;
import java.util.ResourceBundle;

import static ua.courses.view.StringConstants.*;

public class ResourceBundleController {
    public static final ResourceBundle regexpBundle = ResourceBundle.getBundle(
            BUNDLE_NAME_REGEXP,
            new Locale(LOCALE_EN)    //English
            //new Locale ("ua", "UA")   //Ukrainian
    );

    public static final ResourceBundle resourceBundle = ResourceBundle.getBundle(
            BUNDLE_NAME_MESSAGES,
            new Locale(LOCALE_EN)    //English
            //new Locale ("ua", "UA")   //Ukrainian
    );
}
