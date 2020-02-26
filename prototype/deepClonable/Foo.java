package prototype.deepClonable;

public class Foo implements Cloneable {
    private int x;
    private int y;
    private String text;

    public Foo(Foo foo) {
        this.x = foo.getX();
        this.y = foo.getY();
        this.text = foo.getText();
    }

    public Foo(int x, int y, String text) {
        this.x = x;
        this.y = y;
        this.text = text;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
