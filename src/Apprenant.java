import java.util.ArrayList;
import java.util.Scanner;

public  class Apprenant extends Personne
{
   ArrayList<Double> listenote;
   private Classe classe;
   ArrayList<Apprenant> listeApprenants;
    static Scanner scanner = new Scanner(System.in);
    Apprenant apprenant = new Apprenant();
    static ArrayList<Apprenant> apprenants = new ArrayList();
    ArrayList<Classe> classes = new ArrayList();


    public Apprenant(String name, String prenom, String email) {
        super(name, prenom, email);

        Scanner scanner = new Scanner(System.in);
    }

    public Apprenant() {
    }

    public static void ajoutapprenannt() {

        System.out.print("Entrez le nom de l'apprenant : ");
        String nom = scanner.next();

        System.out.print("Entrez le prénom de l'apprenant : ");
        String prenom = scanner.next();

        System.out.print("Entrez l'email de l'apprenant : ");
        String email = scanner.next();

        System.out.println("-------------------------------");
        System.out.println("Apprenant ajouté avec succès ! ");
        System.out.println("-------------------------------");


        apprenants.add(new Apprenant(nom, prenom, email));
    }

    public static void afficherapprenant() {


        for (int i = 0; i < apprenants.size(); i++) {
            System.out.println("\n\n\nles listes des apprenants");

            System.out.println("---------------------------");
            System.out.println("L'ID est : " + apprenants.get(i).getID());
            System.out.println("le nom est : " + apprenants.get(i).getName());
            System.out.println("le prenom est : " + apprenants.get(i).getPrenom());
            System.out.println("le email est : " + apprenants.get(i).getEmail()+"\n\n\n");
        }
    }

    public static void modifierapprenant(){

        System.out.println("Entre le nombre de ID");
        int id =  scanner.nextInt();

        for (int i = 0 ; i < apprenants.size() ; i++)
        {
            if (id==apprenants.get(i).getID()){

                System.out.println("Saisir la nouvelle nom");
                String nom = scanner.next();


                System.out.println("Saisir la nouvelle prenom");
                String prenom = scanner.next();


                System.out.println("Saisir la nouvelle email");
                String email = scanner.next();

                apprenants.get(i).setName(nom);
                apprenants.get(i).setPrenom(prenom);
                apprenants.get(i).setEmail(email);


                System.out.println("-------------------------------");
                System.out.println("Apprenant modifié avec succès ! ");
                System.out.println("-------------------------------");


            }
        }
    }
    public static void supprimerapprenant() {
        boolean trouveapprenant = false;
        System.out.println("Entre le nombre de ID");
        int id = scanner.nextInt();
        for (int i = 0; i < apprenants.size(); i++) {
            if (id == apprenants.get(i).getID()) {
                apprenants.remove(i);
                trouveapprenant = true;

                System.out.println("-------------------------------");
                System.out.println("Apprenant supprimé avec succès !");
                System.out.println("-------------------------------");
                break;


            }

        }
    }
}
