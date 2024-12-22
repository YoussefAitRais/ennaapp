import java.util.ArrayList;
import java.util.Scanner;

public class Classe extends Personne {



    ArrayList<Classe> listeclasse;
    static Scanner scanner = new Scanner(System.in);
    Classe classe = new Classe();
    static ArrayList<Classe> classes = new ArrayList();





    public Classe(String name, String prenom, String email) {
        super(name, prenom, email);

        Scanner scanner = new Scanner(System.in);
    }

    public Classe() {
    }

    public static void ajouteclasse() {

        System.out.print("Entrez le nom de classe : ");
        String nom = scanner.next();

        System.out.print("Entrez le prénom de classe : ");
        String prenom = scanner.next();

        System.out.print("Entrez l'email de classe : ");
        String email = scanner.next();

        System.out.println("-------------------------------");
        System.out.println("Apprenant ajouté avec succès ! ");
        System.out.println("-------------------------------");


//            classes.add(new Classe(nom, prenom, email));
    }


    public static void afficherclasse() {

        for (int i = 0; i < classes.size(); i++) {
            System.out.println("\n\n\nles listes des classes");

            System.out.println("---------------------------");
            System.out.println("L'ID est : " + classes.get(i).getID());
            System.out.println("le nom est : " + classes.get(i).getName());
            System.out.println("le prenom est : " + classes.get(i).getPrenom());
            System.out.println("le email est : " + classes.get(i).getEmail() + "\n\n\n");
        }
    }

    public static void modifierclasse() {

        System.out.println("Entre le nombre de ID");
        int id = scanner.nextInt();

        for (int i = 0; i < classes.size(); i++) {
            if (id == classes.get(i).getID()) {

                System.out.println("Saisir la nouvelle nom");
                String nom = scanner.next();


                System.out.println("Saisir la nouvelle prenom");
                String prenom = scanner.next();


                System.out.println("Saisir la nouvelle email");
                String email = scanner.next();

                classes.get(i).setName(nom);
                classes.get(i).setPrenom(prenom);
                classes.get(i).setEmail(email);


                System.out.println("-------------------------------");
                System.out.println("Classes modifié avec succès ! ");
                System.out.println("-------------------------------");


            }
        }
    }

    public static void supprimerclasse() {
        boolean trouveclasse = false;
        System.out.println("Entre le nombre de ID");
        int id = scanner.nextInt();

        for (int i = 0; i < classes.size(); i++) {

            if (id == classes.get(i).getID()) {
                classes.remove(i);
                trouveclasse = true;

                System.out.println("-------------------------------");
                System.out.println("Classe supprimé avec succès !");
                System.out.println("-------------------------------");
                break;
            }

        }
    }
}
