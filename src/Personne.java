public abstract class Personne
{
    private static int compteur=1;
    private int ID;
    private String name;
    private String prenom;
    private String email;


    public Personne (  String name, String prenom , String email) {
        this.ID = compteur;
        this.name = name;
        this.prenom = prenom;
        this.email = email;
        compteur++;

    }

    public Personne() {
    }
}
