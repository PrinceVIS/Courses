package ua.courses.model;

public class Model {
    private String lastName;
    private String firstName;
    private String patronymic;
    private String login;

    public Model() {
    }

    public Model(String lastName, String firstName, String patronymic, String login) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.login = login;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getLogin() {
        return login;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
