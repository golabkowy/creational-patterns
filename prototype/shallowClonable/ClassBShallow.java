package prototype.shallowClonable;

public class ClassBShallow implements Cloneable {

    private int number;
    private String text;
    private SomeObject someObject;

    // in this case shallow copy is create. There is only reference copied for "someObject field"
    // change in one object will affect all copies, to avoid thad see deep copy example
    public ClassBShallow(ClassBShallow classBShallow) {
        this.number = classBShallow.getNumber();
        this.text = classBShallow.getText();
        this.someObject = classBShallow.getSomeObject();
    }

    public ClassBShallow(int number, String text, SomeObject someObject) {
        this.number = number;
        this.text = text;
        this.someObject = someObject;
    }

    // in this case shallow copy is create. There is only reference copied for "someBbject field"
    // change in one object will affect all copies, to avoid thad see deep copy example
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public SomeObject getSomeObject() {
        return someObject;
    }

    public void setSomeObject(SomeObject someObject) {
        this.someObject = someObject;
    }
}
