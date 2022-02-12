package videogame3;

public class Main {

    public static void main(String[] args){
        Background back = new Background();
        back.setSprite();
        back.showSprite();

        Player plr = new Player(5,4);
        System.out.println(plr.getX());
        plr.setSprite();

        Zombie zmb = new Zombie(7,3);
        zmb.talk();

        ZombieDog zmbdog = new ZombieDog(7,3);
        zmbdog.talk();


    }

}
