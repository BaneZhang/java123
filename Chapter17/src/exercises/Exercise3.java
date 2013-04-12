package exercises;

import java.util.Set;
import java.util.HashSet;

/**
 * User: Bane
 * Date: 13-4-12
 * Time: 15:21
 */
public class Exercise3 {
    public static void main(String[] args) {
        Goods goods1 = new Goods("GOODS_NO_000001", "自动炮塔");
        Goods goods2 = new Goods("GOODS_NO_000001", "普通炮塔");
        Set<Goods> goods = new HashSet<Goods>();
        goods.add(goods1);
        goods.add(goods2);
        Object[] goodsArray = goods.toArray();
        for (int i = 0; i < goodsArray.length; i++) {
            System.out.println(goodsArray[i].toString());
        }
    }
}
