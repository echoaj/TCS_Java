package zombieGame;

public class Zombie extends GameObject implements IsVisable, IsFollowable{
    public Zombie(int x, int y) {
        super(x, y);
    }

    @Override
    public void talk() {
        System.out.println("Grrrr ARRRR ");
        System.out.println("I am a zombie named ZACK");
    }

    @Override
    public void setSprite() {
        System.out.println("Placing sprite off screen");
    }

    @Override
    public void showSprite() {
        System.out.println("Sprite is not visable");
    }

    @Override
    public void setTarget(String target) {
        System.out.println("I am following " + target + " and will scratch it");
    }
}
