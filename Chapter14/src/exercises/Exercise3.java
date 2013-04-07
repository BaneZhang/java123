package exercises;

/**
 * User: Bane
 * Date: 13-4-7
 * Time: 16:17
 */
public class Exercise3 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {

        } finally {
            System.out.println("这是finally语句");
        }
    }
}
