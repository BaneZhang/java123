package exercises;

import java.util.List;
import java.util.ArrayList;

/**
 * User: Bane
 * Date: 13-4-12
 * Time: 15:14
 */
public class Exercise2 {
    public static void main(String[] args) {
        Goods goods1 = new Goods("GOODS_NO_000001", "自动炮塔");
        Goods goods2 = new Goods("GOODS_NO_000001", "普通炮塔");
        List<Goods> list = new ArrayList<Goods>();
        list.add(goods1);
        list.add(goods2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
