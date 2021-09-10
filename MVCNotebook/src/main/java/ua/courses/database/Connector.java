package ua.courses.database;

import java.sql.*;
import java.util.ArrayList;

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

    public String[] getLoginsFromDB(){
        ArrayList<String> result = new ArrayList<>();
        try{
            ResultSet resultSet = statement.executeQuery("SELECT login from notebook.notebook");
            while (resultSet.next()){
                result.add(resultSet.getString(1));
            }
        } catch (SQLException throwables) {
//            throwables.printStackTrace();
        }
        return result.toArray(new String[0]);
    }

}
