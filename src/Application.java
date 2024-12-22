import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Application {

    static Scanner scanner = new Scanner(System.in);
    Apprenant apprenant = new Apprenant();
    static ArrayList<Apprenant> apprenants = new ArrayList();
    ArrayList<Classe> classes = new ArrayList();
    ArrayList<Formateur> formateurs = new ArrayList();

    public static void main(String[] args) {


        int choix = 0;
        while (choix != 4) {


            //affichage
            System.out.println("-------------------------------");

            System.out.println("1--Systeme gestion des Apprenants");

            System.out.println("2--Systeme gestion des Formateurs");

            System.out.println("3--Systeme gestion des Classes");

            System.out.println("4--Quitter");

            System.out.println("-------------------------------");

            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    menuApprenant();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;


            }
        }
    }

    public static void menuApprenant() {
        int choix = 0;
        while (choix != 4) {
            System.out.println("------------------------------- ");
            System.out.println("1 >> Ajouter un apprenant : ");
            System.out.println("2 >> Modifier un apprenant :");
            System.out.println("3 >> Supprimer un apprenant :");
            System.out.println("4 >> Afficher un apprenant :");
            System.out.println("---------------------------------");
            choix = scanner.nextInt();
            switch (choix) {
                case 1:
//                    ajoutapprenannt();
                    Apprenant.ajoutapprenannt();

                    break;

                case 2:
//                    modifierapprenant();
                    Apprenant.modifierapprenant();
                    break;

                case 3:
//                    supprimerapprenant();
                    Apprenant.afficherapprenant();
                    break;

                case 4:

//                    afficherapprenant();
                    Apprenant.afficherapprenant();
                    break;

            }
        }
    }
    public static void menuPersonne() {
        int choix = 0;
        while (choix != 4) {
            System.out.println("------------------------------- ");
            System.out.println("1 >> Ajouter un personne : ");
            System.out.println("2 >> Modifier un personne :");
            System.out.println("3 >> Supprimer un personne :");
            System.out.println("4 >> Afficher un personne :");
            System.out.println("---------------------------------");
            choix = scanner.nextInt();
            switch (choix) {
                case 1:
//                    ajoutapprenannt();
                    Personne.ajoutapprenannt();

                    break;

                case 2:
//                    modifierapprenant();
                    Personne.modifierapprenant();
                    break;

                case 3:
//                    supprimerapprenant();
                    Personne.afficherapprenant();
                    break;

                case 4:

//                    afficherapprenant();
                    Personne.afficherapprenant();
                    break;

            }
        }
    }

}

