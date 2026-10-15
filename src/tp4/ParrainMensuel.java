package tp4;


public class ParrainMensuel extends Parrain {
    private double virementMensuel;

    public ParrainMensuel(String nom, String prenom, int age,
                          double virementMensuel) {
        super(nom, prenom, age);
        this.virementMensuel=virementMensuel;
    }
    public double getVirementMensuel() {
        return virementMensuel;
    }

    public double calculerVirementTotal() {
        return getnbreEnfantsParraines() *virementMensuel;
    }
    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("virement par enfant: " +virementMensuel+"dt");
        System.out.println("virement total: "+calculerVirementTotal()+ "dt");
    }
}
