package exercises;

/**
 * User: Bane
 * Date: 13-4-7
 * Time: 16:14
 */
public class Exercise1 {
    public static void method() throws Exception{
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
