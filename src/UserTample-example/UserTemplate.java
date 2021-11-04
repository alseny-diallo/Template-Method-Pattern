abstract class UserTemplate {

    String userName;
    String password;

    UserTemplate() {}

    public void start() {
        if(logIn(userName, password))
        {
            homePage();
            logOut();
        }
        
    }

    abstract boolean logIn(String userName, String password);

    abstract void logOut();

    abstract void homePage();
}