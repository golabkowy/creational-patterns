package prototype.shallowClonable;

public class ClassAShallow implements Cloneable {

    private int number;
    private String text;
    private SomeObject someObject;

    // in this case shallow copy is create. There is only reference copied for "someObject field"
    // change in one object will affect all copies, to avoid thad see deep copy example
    public ClassAShallow(ClassAShallow classAShallow) {
        this.number = classAShallow.number;
        this.text = classAShallow.text;
        this.someObject = classAShallow.someObject;
    }

    public ClassAShallow(int number, String text, SomeObject someObject) {
        this.number = number;
        this.text = text;
        this.someObject = someObject;
    }

    // in this case shallow copy is create. There is only reference copied for "someBbject field"
    // change in one object will affect all copies, to avoid thad see deep copy example
    @Override
    //changed to public because I invoke clone method out of package scope. Protected gives access in package or out of package for extenders
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getnumber() {
        return number;
    }

    public void setnumber(int number) {
        this.number = number;
    }

    public String gettext() {
        return text;
    }

    public void settext(String text) {
        this.text = text;
    }

    public SomeObject getSomeObject() {
        return someObject;
    }

    public void setSomeObject(SomeObject someObject) {
        this.someObject = someObject;
    }
}
