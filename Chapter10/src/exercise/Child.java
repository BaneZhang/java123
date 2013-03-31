package exercise;

/**
 * User: Bane
 * Date: 13-3-28
 * Time: 18:22
 */
public class Child extends Parent {
    public void method1() {
        System.out.println(this.getClass().getName() + " method1()");
    }
}
