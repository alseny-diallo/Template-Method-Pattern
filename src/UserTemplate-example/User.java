public class User extends UserTemplate {

    User(String userName, String password){
        this.userName = userName;
        this.password = password;

    }

    public boolean logIn(String userName, String password) {

        System.out.println("L'utilisateur est bien connecté!");
        return true;
    }

    public void logOut() {
        System.out.println("L'utilisateur est bien connecté!");
    }

    public void homePage() {
        System.out.println("Bienvenue sur notre application!");
    }

}