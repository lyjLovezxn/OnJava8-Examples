//: patterns/doubledispatch/TypedBin.java
// An ArrayList that can grab the right type.
package patterns.doubledispatch;
import patterns.trash.*;
import java.util.*;

public abstract class TypedBin {
  ArrayList v = new ArrayList();
  protected boolean addIt(Trash t) {
    v.add(t);
    return true;
  }
  public Iterator elements() {
    return v.iterator();
  }
  public boolean add(DDAluminum a) {
    return false;
  }
  public boolean add(DDPaper a) {
    return false;
  }
  public boolean add(DDGlass a) {
    return false;
  }
  public boolean add(DDCardboard a) {
    return false;
  }
} ///:~