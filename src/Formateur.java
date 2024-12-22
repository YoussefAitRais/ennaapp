import java.util.ArrayList;
import java.util.Scanner;

public class Formateur extends Personne {

    String specialite;
    double salaire;

    ArrayList<Formateur> listeformateur;
    static Scanner scanner = new Scanner(System.in);

    static ArrayList<Formateur> formateurs = new ArrayList();
    ArrayList<Classe> classes = new ArrayList();

    public Formateur(String name, String prenom, String email) {
        super(name, prenom, email);

        Scanner scanner = new Scanner(System.in);
    }

    public Formateur() {
    }


    public static void ajouteformateur () {

            System.out.print("Entrez le nom de formateur : ");
            String nom = scanner.next();

            System.out.print("Entrez le prénom de formateur : ");
            String prenom = scanner.next();

            System.out.print("Entrez l'email de formateur : ");
            String email = scanner.next();

            System.out.println("-------------------------------");
            System.out.println("Apprenant ajouté avec succès ! ");
            System.out.println("-------------------------------");


            formateurs.add(new Formateur(nom, prenom, email));
    }


    public static void afficherforamteur() {

        for (int i = 0; i < formateurs.size(); i++) {
            System.out.println("\n\n\nles listes des formateurs");

            System.out.println("---------------------------");
            System.out.println("L'ID est : " + formateurs.get(i).getID());
            System.out.println("le nom est : " + formateurs.get(i).getName());
            System.out.println("le prenom est : " + formateurs.get(i).getPrenom());
            System.out.println("le email est : " + formateurs.get(i).getEmail() + "\n\n\n");
        }
    }

    public static void modifierforamteur() {

        System.out.println("Entre le nombre de ID");
        int id = scanner.nextInt();

        for (int i = 0; i < formateurs.size(); i++) {
            if (id == formateurs.get(i).getID()) {

                System.out.println("Saisir la nouvelle nom");
                String nom = scanner.next();


                System.out.println("Saisir la nouvelle prenom");
                String prenom = scanner.next();


                System.out.println("Saisir la nouvelle email");
                String email = scanner.next();

                formateurs.get(i).setName(nom);
                formateurs.get(i).setPrenom(prenom);
                formateurs.get(i).setEmail(email);


                System.out.println("-------------------------------");
                System.out.println("Formateur modifié avec succès ! ");
                System.out.println("-------------------------------");


            }
        }
    }

    public static void supprimerformteur() {
        boolean trouveformateur = false;
        System.out.println("Entre le nombre de ID");
        int id = scanner.nextInt();

        for (int i = 0; i < formateurs.size(); i++) {

            if (id == formateurs.get(i).getID()) {
                formateurs.remove(i);
                trouveformateur = true;

                System.out.println("-------------------------------");
                System.out.println("Formateur supprimé avec succès !");
                System.out.println("-------------------------------");
                break;
            }

        }
    }
}


