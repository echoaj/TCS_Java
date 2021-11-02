package zombieGame;

public class Player extends GameObject implements IsVisable{

    public Player(int x, int y) {
        super(x, y);
    }

    @Override
    public void talk() {
        System.out.println("I am a human");
        System.out.println("My name is Alex");
    }

    @Override
    public void setSprite() {
        System.out.println("Placing sprite at bottom of screen");
    }

    @Override
    public void showSprite() {
        System.out.println("Sprite is visable");
    }
}
