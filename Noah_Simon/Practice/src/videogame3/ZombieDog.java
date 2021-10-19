package videogame3;

public class ZombieDog extends GameObject implements IsVisable, Followable{


    public ZombieDog(int x, int y) {
        super(x, y);
    }

    @Override
    public void talk() {
        System.out.println("Woof Woof Grrrr I'm a hell hound");
        System.out.println("My name is Henry");
    }
    @Override
    public void setSprite() {
        System.out.println("Placing sprite at out of screen");
    }

    @Override
    public void showSprite() {
        System.out.println("Sprite is not visible");
    }

    @Override
    public void setTarget(String target) {
        System.out.println("I am following " + target + " and will bite it");
    }

}
