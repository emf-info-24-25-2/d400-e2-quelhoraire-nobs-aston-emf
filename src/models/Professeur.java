package models;

public class Professeur {

    private String nom;
    private String prenom;
    private ModuleInfo[] modulesEnseignes;

    public Professeur(String prenom, String nom) {
        this.modulesEnseignes = new ModuleInfo[0];
        this.nom = nom;
        this.prenom = prenom;
    }

    public boolean enseigneCeModule(String nomDuModule) {
        boolean profEnseigneCeModule = false;
        for (int j = 0; j < modulesEnseignes.length; j++) {
            if (modulesEnseignes[j] != null) {
                if (modulesEnseignes[j].getNom() == nomDuModule) {
                    profEnseigneCeModule = true;
                    break;
                }
            }
        }

        return profEnseigneCeModule;
    }

    public void ajouterModuleEnseigne(ModuleInfo module) {
        int nbrDeModuleEnseigner = 0;
        for (int i = 0; i < modulesEnseignes.length; i++) {
            if (modulesEnseignes != null) {
                nbrDeModuleEnseigner++;
            }
        }

        ModuleInfo[] nouveauTableau = new ModuleInfo[nbrDeModuleEnseigner];
        //a partire de la je panique

        modulesEnseignes = nouveauTableau;

    }

    public void viderModules() {
        for (int j = 0; j < modulesEnseignes.length; j++) {
            modulesEnseignes[j] = null;
        }

    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public ModuleInfo[] getModulesEnseignes() {
        return modulesEnseignes;
    }

    @Override
    public String toString() {
        return prenom + " " + nom;
    }

}
