public class Guest extends UserTemplate {
    Guest(String loginCode){
        this.userName = "Invité" ;
        this.password = loginCode;
    }

    public boolean logIn(String userName, String password) {
        System.out.println("Bienvenue sur le compte Invité");
        return true;
    }

    public void logOut() {
        System.out.println("Suppression de toutes les données !");
        System.out.println("Déconnexion Réussie !");
    }

    public void homePage() {
        System.out.println("Bienvenue sur le compte test Invité de notre application");
        System.out.println("NB: En vous déconnectant toutes vos données seront supprimées.");
    }
}