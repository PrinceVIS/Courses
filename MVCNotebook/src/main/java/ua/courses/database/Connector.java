package ua.courses.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static ua.courses.controller.ResourceBundleController.databaseBundle;
import static ua.courses.view.StringConstants.*;

public class Connector {

    private Connection connection;
    private Statement statement;

    public void initConnection() {
        try {
            connection = DriverManager.getConnection(
                    databaseBundle.getString(DATABASE_URL),
                    databaseBundle.getString(DATABASE_USERNAME),
                    databaseBundle.getString(DATABASE_PASSWORD));
            statement = connection.createStatement();
        } catch (SQLException throwable) {
            //throwable.printStackTrace();
        }
    }

    public void closeConnection(){
        try {
            connection.close();
        } catch (SQLException throwable) {
           // throwable.printStackTrace();
        }
    }
}
