package threads;

import models.Cruche;

public class ViderThread extends CrucheThread{

    private Cruche cruche;


    public ViderThread(Cruche cruche){
        this.cruche = cruche;
    }

    @Override
    public void run() {

        cruche.vider();


    }


}
