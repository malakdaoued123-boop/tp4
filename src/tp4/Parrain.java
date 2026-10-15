package tp4;


public class Parrain extends Personne {
    public static int MAX=100;
    private static int c = 0;
    private int idParrain;
    private int nombreEnfantsParraines;
    private Enfant[] mesEnfants;

    public Parrain(String nom, String prenom, int age) {
        super(nom, prenom, age);
        c=c+1;
        idParrain=c;
        nombreEnfantsParraines=0;
        mesEnfants=new Enfant[MAX];
    }
    public void ajouterEnfant(Enfant enfant) {
        if (enfant !=null && nombreEnfantsParraines < MAX) {
            mesEnfants[nombreEnfantsParraines]=enfant;
            nombreEnfantsParraines++;
        }
    }

    public int getnbreEnfantsParraines() {
        return nombreEnfantsParraines;
    }
    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("ID parrain : " + idParrain);
        System.out.println("Nombre d'enfants parraines : " + nombreEnfantsParraines);

        for (int i = 0; i < nombreEnfantsParraines; i++) {
            mesEnfants[i].afficherInfos();
        }
    }


public void affsixieme() {
    for (int i=0;i< nombreEnfantsParraines; i++) {
        if (mesEnfants[i].getClasse().equals("Sixième année")) {
            mesEnfants[i].afficherInfos();
        }
    }
}

    
}


