package ua.courses.controller;

import java.util.Locale;
import java.util.ResourceBundle;

import static ua.courses.view.StringConstants.*;

public class ResourceBundleController {
    private static final Locale bundlesLocale = new Locale(LOCALE_EN);
    public static final ResourceBundle regexpBundle = ResourceBundle.getBundle(
            BUNDLE_NAME_REGEXP, bundlesLocale);

    public static final ResourceBundle resourceBundle = ResourceBundle.getBundle(
            BUNDLE_NAME_MESSAGES, bundlesLocale);

    public static final ResourceBundle databaseBundle = ResourceBundle.getBundle(
            BUNDLE_NAME_DATABASE, Locale.ENGLISH);
}
