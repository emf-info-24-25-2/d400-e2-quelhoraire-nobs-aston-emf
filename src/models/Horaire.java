package models;

public class Horaire {

    public static final int NBRE_DE_BLOC = 6;
    private Bloc[] blocs;

    public Horaire() {
        this.blocs = new Bloc[NBRE_DE_BLOC];

        blocs[0] = new Bloc("B1S1");
        blocs[1] = new Bloc("B2S1");
        blocs[2] = new Bloc("B3S1");
        blocs[3] = new Bloc("B4S2");
        blocs[4] = new Bloc("B5S2");
        blocs[5] = new Bloc("B6S2");
    }

    public boolean planifier(ModuleInfo[] modules, Professeur[] profs) {
        //chercher un prof qui peut enseigner le module en question
        boolean nouveauModuleAEnseigner = false;
        for (int i = 0; i < profs.length; i++) {
            if (profs[i].getModulesEnseignes() == modules) {
                modulesEnseignes
                        
            }
        }
        return;
    }

    public void afficherHoraire() {
        for (int j = 0; j < blocs.length; j++) {
            System.out.println(blocs[j]);
        }
    }

    public Bloc moduleDansQuelBloc(ModuleInfo module) {
        //renvoyer le bloc dans le quel le module a été planifier
        return null;
    }

}
