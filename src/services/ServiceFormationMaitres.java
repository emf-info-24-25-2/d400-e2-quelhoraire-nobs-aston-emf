package services;

import models.ModuleInfo;
import models.Professeur;

public class ServiceFormationMaitres {

    public void attribuerModules(Professeur[] professeurs, ModuleInfo[] modules) {
         ?  ?  ?  ?  ?  ?  = ( ?  ?  ?)(Math.random() * (MAX - MIN + 1)) + MIN; //tableau avec tout les modules pour genere min et max deviennt les index de ce tableau 
    }

    public boolean tousModulesCouverts(Professeur[] profs, ModuleInfo[] modules) {
        boolean tousCouvert = false
        for (int i = 0; i < toutLesModules.length; i++) {
            if (toutLesModules[i].getProfesseur() == profs) {
                tousCouvert = true;
            }
        }
        return tousCouvert;
    }
}
