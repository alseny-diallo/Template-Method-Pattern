import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UserTemplate user = null;
        String userName;
        String password;

        System.out.println("\nChoisissez votre type de compte.\n" +
                "1 - Administrateur\n" +
                "2 - Utilisateur\n" +
                "3 - Invité");
        System.out.println("---------------");
        
        int choice = Integer.parseInt(scan.nextLine());

        switch (choice) {
            case 1:
                System.out.print("Donnez votre Identifiant : ");
                userName = scan.nextLine();
                System.out.print("Donnez votre mot de passe : ");
                password = scan.nextLine();
                user = new Admin(userName, password);
                user.start();
                break;
            
            case 2:
                System.out.print("Donnez votre Identifiant : ");
                userName = scan.nextLine();
                System.out.print("Donnez votre mot de passe : ");
                password = scan.nextLine();
                user = new User(userName, password);
                user.start();
                break;
            
            case 3:
                System.out.print("Donnez votre code de connexion Invité : ");
                password = scan.nextLine();
                user = new Guest(password);
                user.start();
                break;

            default:
                System.out.println("Choix Indisponible.");
                break;
        }
    }
}