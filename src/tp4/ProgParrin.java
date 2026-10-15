package tp4;

public class ProgParrin {
    public static void main(String[] args) {
        Parrain[] parrains=new Parrain[10];
        parrains[0]=new Parrain("Ali", "Ben Ali", 40);
        parrains[1]=new Parrain("Salah", "Ben Salah", 35);
        parrains[2]=new ParrainMensuel("Tounes", "Ben Tounes",45,100.0);
        Enfant[] enfants=new Enfant[1025];
        enfants[0]=new Enfant("Farah", "Ben Farah", 10, "Quatrième année");
        enfants[1]=new Enfant("Amel", "Ben Amel", 12, "Sixième année");
        enfants[2]=new Enfant("Fedy", "Ben Fedy", 11, "Sixième année");
        enfants[3]=new Enfant("Sarra", "Ben Sarra", 9, "Troisième année");
        parrains[0].ajouterEnfant(enfants[0]);
        parrains[2].ajouterEnfant(enfants[1]);
        parrains[2].ajouterEnfant(enfants[2]);
        int tot=0;

        for (int i=0; i<parrains.length; i++) {
            if (parrains[i]!=null) {
                tot+=parrains[i].getnbreEnfantsParraines();
            }
        }
        System.out.println("nb tot enf parrains: "+tot);
        System.out.println("enf en 6eme:");
        for (int i=0; i<parrains.length; i++) {
            if (parrains[i]!= null) {
                parrains[i].affsixieme();
            }
        }
     
    }
}
