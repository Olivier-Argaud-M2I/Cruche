package threads;

import models.Cruche;

public class RemplirThread extends CrucheThread{

    private Cruche cruche;


    public RemplirThread(Cruche cruche){
        this.cruche = cruche;
    }

    @Override
    public void run() {
//        System.out.println("on rempli la cruche");
        cruche.ajouter();

    }


}
