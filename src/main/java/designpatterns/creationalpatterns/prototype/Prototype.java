package designpatterns.creationalpatterns.prototype;

public abstract class Prototype implements Cloneable {

    protected int value;

    public Prototype() {
        for (int i = 0; i < 32767; i++) {
            value += 1;
        }
    }

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

}
