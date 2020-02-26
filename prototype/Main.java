package prototype;

import prototype.deepClonable.ClassADeep;
import prototype.deepClonable.Foo;
import prototype.shallowClonable.ClassAShallow;
import prototype.shallowClonable.SomeObject;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //DEEP COPY TEST
        ClassADeep classADeep1 = new ClassADeep(1, "Wombat", new Foo(5, 5, "Baz"));
        ClassADeep classADeep2 = (ClassADeep) classADeep1.clone();
        classADeep1.getFooField().setX(10);
        classADeep1.getFooField().setY(10);
        classADeep1.getFooField().setText("TEST DEEP COPY!");

        //and now classADeep2 mutable fields "foo field" should have the same value as before
        System.out.println(classADeep2.getFooField().getX());
        System.out.println(classADeep2.getFooField().getY());
        System.out.println(classADeep2.getFooField().getText());
        //and trust me it print (5,5,Baz) ;) Deep copy works properly

        //shallow copies
        ClassAShallow classAShallow1 = new ClassAShallow(1, "Wombat", new SomeObject(1, 2, "Wombat"));
        ClassAShallow classAShallow2 = (ClassAShallow) classAShallow1.clone();

        classAShallow1.getSomeObject().setX(5);
        classAShallow1.getSomeObject().setY(5);
        classAShallow1.getSomeObject().setText("TEST SHALLOW COPY");

        System.out.println(classAShallow1.getSomeObject().getX());
        System.out.println(classAShallow1.getSomeObject().getY());
        System.out.println(classAShallow1.getSomeObject().getText());
        //and trust me it print (5,5, TEST SHALLOW COPY) ;) so shallow copy...
    }
}
