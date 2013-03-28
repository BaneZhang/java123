package exercise;

/**
 * User: Bane
 * Date: 13-3-28
 * Time: 18:26
 */
public class Exercise2 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent.invokeMethods(parent);
        Child child = new Child();
        Parent.invokeMethods(child);
        Child2 child2 = new Child2();
        Parent.invokeMethods(child2);
    }
}
