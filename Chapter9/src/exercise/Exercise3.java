package exercise;

/**
 * User: Bane
 * Date: 13-3-26
 * Time: 下午5:18
 */
public class Exercise3 {
    public static void main(String[] args) {
        String str = "OOPS";
        noUse(str);
        System.out.println(str);
    }

    public static void noUse(String str) {
        str = "O" + str;    //因为str并非类属性，所以修改对main中的str局部变量不造成影响
    }
}
