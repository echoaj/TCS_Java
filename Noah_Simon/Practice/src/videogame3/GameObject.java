package videogame3;

public abstract class GameObject {
    private int x;
    private int y;
    public String name;

    public GameObject(int x, int y){
        this.x = x;
        this.y = y;
    }

    public GameObject() {

    }

    // Abstract classes can have implemented methods
    public int getY() {
        return y;
    }
    public int getX() {
        return x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }

    // Abstract classes can have unimplemented methods.
    // Will force subclasses to create printName() method
    public abstract void talk();

}
