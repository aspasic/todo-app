package todoapplication.web.dto;



public class UsersRegistrationDTO extends UsersDTO{

    private String password;

    private String repeatedPassword;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeatedPassword() {
        return repeatedPassword;
    }

    public void repeatedPassword(String repeatedPassword) {
        this.repeatedPassword = repeatedPassword;
    }
}
