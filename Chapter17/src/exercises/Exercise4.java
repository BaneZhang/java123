package exercises;

import java.util.Map;
import java.util.HashMap;

/**
 * User: Bane
 * Date: 13-4-12
 * Time: 15:37
 */
public class Exercise4 {
    public static void main(String[] args) {
        Goods goods1 = new Goods("GOODS_NO_000001", "普通炮塔");
        Goods goods2 = new Goods("GOODS_NO_000002", "自动炮塔");
        Map<String, Goods> goodsMap = new HashMap<String, Goods>();
        goodsMap.put(goods1.getId(), goods1);
        goodsMap.put(goods2.getId(), goods2);
        System.out.println(goodsMap.get(goods1.getId()));
    }
}
