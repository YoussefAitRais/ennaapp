import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Apprenant> apprenants = new ArrayList();
        ArrayList<Classe> classes = new ArrayList();
        ArrayList<Formateur> formateurs = new ArrayList();

        int choix=0;
        while (choix != 4) {


            //affichage
            System.out.println("1--Systeme gestion des Apprenants");

            System.out.println("2--Systeme gestion des Formateurs");

            System.out.println("3--Systeme gestion des Classes");

            System.out.println("4--Quitter");

            System.out.println("-------------------------------");

            choix = scanner.nextInt();
            switch (choix) {
                case 1: menuApprenant();


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

            System.out.println("Ajouter un apprenant : ");
            System.out.println("Modifier un apprenant :");
            System.out.println("Supprimer un apprenant :");
            System.out.println("Afficher un apprenant :");

            choix=scanner.nextInt();
            switch (choix) {
                case 1:
                    System.out.println("Ajouter un apprenant : ");
                    break;

                case 2:
                    System.out.println("Modifier un apprenant :");
                    break;

                case 3:
                    System.out.println("Supprimer un apprenant :");
                    break;

                case 4:
                    System.out.println("Afficher un apprenant :");
                    break;

            }
        }
    }
}
