package prototype.gangOfFourApproach;

public abstract class Prototype <T> implements Cloneable{
    protected abstract T clone() throws CloneNotSupportedException;
}
