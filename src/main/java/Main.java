import models.Cruche;
import threads.RemplirThread;
import threads.ViderThread;

public class Main {




    public static void main(String... args) throws InterruptedException {

        Cruche cruche = new Cruche();




       while(true){
//           System.out.println("boucle des threads");

           Integer pileOuFace = (int) (Math.random() * 100);

//           System.out.println("le pile ou face donne " +pileOuFace);
           if(pileOuFace>50){
               new Thread(new RemplirThread(cruche)).start();
           }
           else{
               new Thread(new ViderThread(cruche)).start();
           }

           Thread.sleep(500);
       }




    }




}
