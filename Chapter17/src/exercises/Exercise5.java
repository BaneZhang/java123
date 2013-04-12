package exercises;

import java.io.UnsupportedEncodingException;

/**
 * User: Bane
 * Date: 13-4-12
 * Time: 15:42
 */
public class Exercise5 {
    public static void main(String[] args) {
        String string = "别来无恙";
        byte [] bytes = string.getBytes();
        try {
            String otherString = new String(bytes, "UTF-8");    //此处编码需根据IDE编码保持一致
            System.out.println(otherString);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
