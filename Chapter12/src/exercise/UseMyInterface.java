package exercise;

/**
 * User: Bane
 * Date: 13-4-2
 * Time: 12:23
 */
public class UseMyInterface {
    public static void main(String[] args) {
        MyImpl1 myImpl1 = new MyImpl1();
        useMyInterface(myImpl1);

        MyImpl2 myImpl2 = new MyImpl2();
        useMyInterface(myImpl2);
    }

    static void useMyInterface(MyInterface myInterface) {
        if (myInterface instanceof MyImpl1) {
            myInterface.method1();
        } else if (myInterface instanceof MyImpl2) {
            myInterface.method2();
        }
    }
}
