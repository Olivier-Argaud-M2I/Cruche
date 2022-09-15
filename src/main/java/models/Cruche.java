package models;


public class Cruche {

    private Integer capacity = 100;

    private Integer level = 0;

    private Integer min = 1;
    private Integer max = 100;

    public Boolean isFull(){
        return level==capacity;
    }

    public synchronized void ajouter(){

        try {
            while(isFull()){
                    wait();
            }
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Integer quantity = (int) ((Math.random() * (max - min)) + min);
        level = level+quantity>capacity?capacity:level+quantity;
        System.out.println("on ajoute "+quantity+" litres a la cruche");
        System.out.println("Le niveau de la cruche est : "+level);
        notifyAll();
    }

    public synchronized void vider(){

        try {
            while(!isFull()){
                wait();
            }
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Integer quantity = (int) ((Math.random() * (max - min)) + min);
        level = level-quantity<0?0:level-quantity;
        System.out.println("on enleve "+quantity+" litres a la cruche");
        System.out.println("Le niveau de la cruche est : "+level);
        notifyAll();
    }

}
