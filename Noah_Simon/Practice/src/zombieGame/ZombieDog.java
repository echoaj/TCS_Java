package zombieGame;

public class ZombieDog extends GameObject implements IsVisable, IsFollowable{

    public ZombieDog(int x, int y) {
        super(x, y);
    }

    @Override
    public void talk() {
        System.out.println("Woof Woof GRR ARR");
        System.out.println("I am a zombie Dog named Ryan");
    }

    @Override
    public void setSprite() {
        System.out.println("Placing sprite at top of screen");
    }

    @Override
    public void showSprite() {
        System.out.println("Sprite is visable");
    }

    @Override
    public void setTarget(String target) {
        System.out.println("I am following " + target + " and will bite it");
    }
}
