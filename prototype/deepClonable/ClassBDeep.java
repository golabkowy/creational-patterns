package prototype.deepClonable;

public class ClassBDeep implements Cloneable {

    private int intField;
    private String stringField;
    private ClassADeep classADeepField;

    public ClassBDeep() {
    }

    // Copy constructor is required for example to create deep copy by constructor in classes which contains ClassB as a field - see ClassA
    public ClassBDeep(ClassBDeep classBDeep) {
        this.setIntField(classBDeep.getIntField());
        this.setStringField(classBDeep.getStringField());
        this.setClassADeepField(new ClassADeep(classBDeep.getClassADeepField()));
    }

    public ClassBDeep(int intField, String stringField, ClassADeep classADeepField) {
        this.intField = intField;
        this.stringField = stringField;
        this.classADeepField = classADeepField;
    }

    //clone method overriding ensures deep cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        ClassBDeep classBDeepCloned = (ClassBDeep) super.clone();
        classBDeepCloned.setClassADeepField((ClassADeep) this.getClassADeepField().clone());
        return classBDeepCloned;
    }

    public int getIntField() {
        return intField;
    }

    public ClassBDeep setIntField(int intField) {
        this.intField = intField;
        return this;
    }

    public String getStringField() {
        return stringField;
    }

    public ClassBDeep setStringField(String stringField) {
        this.stringField = stringField;
        return this;
    }

    public ClassADeep getClassADeepField() {
        return classADeepField;
    }

    public ClassBDeep setClassADeepField(ClassADeep classADeepField) {
        this.classADeepField = classADeepField;
        return this;
    }
}
