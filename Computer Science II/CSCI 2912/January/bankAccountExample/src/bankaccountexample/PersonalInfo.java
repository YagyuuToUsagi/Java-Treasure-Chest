package bankaccountexample;

public class PersonalInfo {

    private String userName;
    private String password;

    public PersonalInfo(String userName, String password) { //Constructor 1
        this.userName = userName;
        this.password = password;

    }

    public PersonalInfo() {  //Constructor 2
        this("Peter", "1234"); //If user returns nothing, this will be the default username and password.
    }

    public String getUsername() { //Constructor 3
        return userName; 
    }

    public String getPassword() { //Constructor 3
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

}
