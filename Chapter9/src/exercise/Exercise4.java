package exercise;

/**
 * User: Bane
 * Date: 13-3-26
 * Time: 下午5:23
 */
public class Exercise4 {
    public static void main(String[] args) {
        if (args != null && args.length == 2) {
            System.out.println(appendTwoString(args[0], args[1]));
        }
    }

    public static String appendTwoString(String str1, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str1);
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }
}
