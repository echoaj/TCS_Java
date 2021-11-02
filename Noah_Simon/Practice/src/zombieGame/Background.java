package zombieGame;

public class Background implements IsVisable{

    @Override
    public void setSprite() {
        System.out.println("Placing sprite at top left of screen");
    }

    @Override
    public void showSprite() {
        System.out.println("Sprite is visable");
    }
}
