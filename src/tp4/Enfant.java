package tp4;

public class Enfant extends Personne {
    private static int c=0;
    private int idEnfant;
    private String classe;

    public Enfant(String nom, String prenom, int age) {
        super(nom, prenom, age);
        c=c+1;
        idEnfant=c;
    }
    public Enfant(String nom, String prenom, int age, String classe) {
        this(nom, prenom, age);
        this.classe=classe;
    }
    public String getClasse() {
        return classe;
    }
    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("id enfant: "+idEnfant);
        System.out.println("classe scolaire: "+classe);
    }
}

