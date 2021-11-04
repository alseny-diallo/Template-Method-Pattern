public class Admin extends UserTemplate {
    Admin(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public boolean logIn(String userName, String password) {
        System.out.println("Administrateur bien connecté!");
        return true;
    }

    public void logOut() {
        System.out.println("Administrateur bien déconnecté!");
    }

    public void homePage() {
        System.out.println("Bienvenue sur votre DashBoard cher Administrateur !");
        
    }
}