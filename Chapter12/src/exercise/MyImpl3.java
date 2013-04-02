package exercise;

/**
 * User: Bane
 * Date: 13-4-2
 * Time: 12:28
 */
public class MyImpl3 implements MyInterface, MyInterface2 {
    public void method1() {
        System.out.println("MyInterface.method1()");
    }

    public void method2() {
        System.out.println("MyInterface.method2()");
    }

    public void method3() {
        System.out.println("MyInterface2.method3()");
    }
}
