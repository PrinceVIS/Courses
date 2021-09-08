package ua.courses.controller;

import java.util.Locale;
import java.util.ResourceBundle;

import static ua.courses.view.StringConstants.*;

public class ResourceBundleController {
    private static final Locale bundlesLocale = new Locale(LOCALE_UA, "UA");
    public static final ResourceBundle regexpBundle = ResourceBundle.getBundle(
            BUNDLE_NAME_REGEXP, bundlesLocale);

    public static final ResourceBundle resourceBundle = ResourceBundle.getBundle(
            BUNDLE_NAME_MESSAGES, bundlesLocale);
}
