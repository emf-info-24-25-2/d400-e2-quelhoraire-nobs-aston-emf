package models;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class Bloc {

    public static final int NBRE_DEMI_JOURS_SEMAINE = 10;
    private String nom;
    private ModuleInfo[] modules;

    public Bloc(String nom) {
        this.modules = new ModuleInfo[NBRE_DEMI_JOURS_SEMAINE];
        this.nom = nom;

        modules[0] = new ModuleInfo("Matu");
        modules[1] = new ModuleInfo("Matu");
        modules[2] = new ModuleInfo("Matu");
        modules[3] = new ModuleInfo("Matu");
    }

    public boolean planifierModule(ModuleInfo module) {
        boolean planificationReussi = false;
        for (int demi_journees_disponibles = 0; demi_journees_disponibles < 3;) {
            for (int i = 0; i < this.modules.length; i++) {
                if (modules[i] == null) {
                    demi_journees_disponibles++;
                }
                //placer module dans les case vide du tableau modules
                modules[i] = module;

                planificationReussi = true;

            }
        }

        return false;

    }

    public void afficherHoraire() {
        System.out.println(
                DayOfWeek.values()[0].getDisplayName(TextStyle.FULL, Locale.FRANCE) + " matin   :" + modules[0] + " après-midi  :" + modules[1]
                + DayOfWeek.values()[1].getDisplayName(TextStyle.FULL, Locale.FRANCE) + " matin   :" + modules[2] + " après-midi  :" + modules[3]
                + DayOfWeek.values()[2].getDisplayName(TextStyle.FULL, Locale.FRANCE) + " matin   :" + modules[4] + " après-midi  :" + modules[5]
                + DayOfWeek.values()[3].getDisplayName(TextStyle.FULL, Locale.FRANCE) + " matin   :" + modules[6] + " après-midi  :" + modules[7]
                + DayOfWeek.values()[4].getDisplayName(TextStyle.FULL, Locale.FRANCE) + " matin   :" + modules[8] + " après-midi  :" + modules[9]);
    }

    public boolean estTotalementPlanifie() {
        return false;
    }

    public boolean contientModule(ModuleInfo module) {
        return false;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return nom;
    }

}
