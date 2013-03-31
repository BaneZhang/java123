package exercise;

/**
 * User: Bane
 * Date: 13-3-28
 * Time: 18:18
 */
public class Parent {
    public void method1() {
        System.out.println(this.getClass().getName() + " method1()");
    }

    public void method2() {
        System.out.println(this.getClass().getName() + " method2()");
    }

    public static void invokeMethods(Parent parent) {
        if (parent instanceof Parent) {
            System.out.println("Parent");
        }
        if (parent instanceof Child) {
            System.out.println("Child");
        }
        parent.method1();
        parent.method2();
    }
}
