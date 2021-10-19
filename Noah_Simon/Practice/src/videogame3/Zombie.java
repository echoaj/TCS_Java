package videogame3;

public class Zombie extends GameObject implements IsVisable, Followable{

    public Zombie(int x, int y){
        super(x, y);
    }

    @Override
    public void talk() {
        System.out.println("Grrrrr ARRRRR");
        System.out.println("I'm a zombie named ZACKERY!");
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
        System.out.println("I am following " + target + " and will scratch it");
    }
}
