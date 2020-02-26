package prototype.deepClonable;

public class ClassADeep implements Cloneable {

    private int intField;
    private String stringField;
    private Foo fooField;

    public ClassADeep() {
    }

    // Copy constructor is required for example to create deep copy by constructor in classes which contains ClassA as a field - see ClassB
    public ClassADeep(ClassADeep classADeep) {
        this.setIntField(classADeep.getIntField());
        this.setStringField(classADeep.getStringField());
        this.setFooField(new Foo(classADeep.getFooField()));
    }

    public ClassADeep(int intField, String stringField, Foo fooField) {
        this.intField = intField;
        this.stringField = stringField;
        this.fooField = fooField;
    }

    //clone method overriding ensures deep cloning
    @Override
    //changed to public because I invoke clone method out of package scope. Protected gives access in package or out of package for extenders
    public Object clone() throws CloneNotSupportedException {
        ClassADeep classADeepCloned = (ClassADeep) super.clone();
        classADeepCloned.setFooField((Foo) classADeepCloned.getFooField().clone());
        return classADeepCloned;
    }

    public int getIntField() {
        return intField;
    }

    public void setIntField(int intField) {
        this.intField = intField;
    }

    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }

    public Foo getFooField() {
        return fooField;
    }

    public void setFooField(Foo fooField) {
        this.fooField = fooField;
    }
}
