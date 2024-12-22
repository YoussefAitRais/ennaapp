import java.util.ArrayList;
import java.util.Scanner;

public class Personne
{
    private static int compteur=1;
    private int ID;
    private String name;
    private String prenom;
    private String email;

    static Scanner scanner = new Scanner(System.in);
    Personne personne = new Personne();
    static ArrayList<Personne> personnes = new ArrayList();
    ArrayList<Classe> classes = new ArrayList();

    public Personne (  String name, String prenom , String email) {
        this.ID = compteur;
        this.name = name;
        this.prenom = prenom;
        this.email = email;
        compteur++;

    }
    public Personne(){

    }

    public static void ajoutformateur() {
    }

    public static void afficherformateur() {
    }

    public static void supprimerformateur() {
    }

    public static void modifierformateur() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   


}
