package videogame3;

public class Background implements IsVisable{


    @Override
    public void setSprite() {
        System.out.println("Placing sprite at top left");
    }

    @Override
    public void showSprite() {
        System.out.println("Sprite is visible");
    }
}
