import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Application {

    static Scanner scanner = new Scanner(System.in);

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
                    menuForamteur();
                    break;
                case 3:
                    menuClasse();
                    break;
                case 4:
                    System.exit(0);
                    break;


            }
        }
    }

    public static void menuApprenant() {
        int choix = 0;
        while (choix != 5) {
            System.out.println("------------------------------- ");
            System.out.println("1 >> Ajouter un apprenant : ");
            System.out.println("2 >> Modifier un apprenant :");
            System.out.println("3 >> Supprimer un apprenant :");
            System.out.println("4 >> Afficher un apprenant :");
            System.out.println("5 >> La liste Principale :");
            System.out.println("---------------------------------");
            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    Apprenant.ajoutapprenannt();
                    break;

                case 2:
                    Apprenant.modifierapprenant();
                    break;

                case 3:
                    Apprenant.supprimerapprenant();
                    break;

                case 4:
                    Apprenant.afficherapprenant();
                    break;
                case 5:
                    System.out.println(" Voila la liste principale");
                    break;


            }
        }
    }

        public static void menuForamteur() {
        int choix = 0;
        while (choix != 5) {
            System.out.println("------------------------------- ");
            System.out.println("1 >> Ajouter un formateur : ");
            System.out.println("2 >> Modifier un foramteur :");
            System.out.println("3 >> Supprimer un foramteur :");
            System.out.println("4 >> Afficher un foramteur :");
            System.out.println("5 >> La liste Principale :");
            System.out.println("---------------------------------");
            Scanner scanner = new Scanner(System.in);
            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    Formateur.ajouteformateur();
                    break;

                case 2:
                    Formateur.modifierforamteur();
                    break;

                case 3:
                    Formateur.supprimerformteur();
                    break;

                case 4:
                    Formateur.afficherforamteur();
                    break;
                case 5:
                    System.out.println("Voila la liste principales");

            }
        }
    }

    public static void menuClasse() {
        int choix = 0;
        while (choix != 5) {
            System.out.println("------------------------------- ");
            System.out.println("1 >> Ajouter un classe : ");
            System.out.println("2 >> Modifier un classe :");
            System.out.println("3 >> Supprimer un classe :");
            System.out.println("4 >> Afficher un classe :");
            System.out.println("5 >> La liste Principale :");
            System.out.println("---------------------------------");
            Scanner scanner = new Scanner(System.in);
            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    Classe.ajouteclasse();
                    break;

                case 2:
                    Classe.modifierclasse();
                    break;

                case 3:
                    Classe.supprimerclasse();
                    break;

                case 4:

                    Classe.afficherclasse();
                    break;
                case 5:
                    System.out.println("Voila la liste principale");
                    break;

            }
        }
    }

}

