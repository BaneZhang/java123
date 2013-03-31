package com.javaeasy.learnstring;

/**
 * User: Bane
 * Date: 13-3-26
 * Time: 下午2:55
 */
public class UseStringMethod {
    public static void main(String[] args) {
        //长度
        System.out.println("\"length\"字符串的长度为：" + "length".length());

        //获取字符串中指定位置的字符
        System.out.println("\"BaneZhang\"字符串中的第5个字符为：" + "BaneZhang".charAt(4));

        //判断两个字符是否相等
        System.out.println("\'Z\'与\'z\'相等吗？" + ('Z' == 'z'));

        //获取字符串中的一部分
        System.out.println("\"BaneZhang\"的名为：" + "BaneZhang".substring(0, 4));
        System.out.println("\"BaneZhang\"的姓为：" + "BaneZhang".substring(4));

        //判断两个字符串是否相等
        System.out.println("\"BaneZhang\"与\"banezhang\"相等吗？" + "BaneZhang".equals("banezhang"));
        String str1 = "BaneZhang";
        String str2 = str1;
        System.out.println("str1与str2是否指向同一个对象？" + (str1 == str2));

        // 字符串前后缀
        System.out.println("\"Mr Zhang\"是否\"Mr\"作为前缀吗？" + "Mr Zhang".startsWith("Mr"));
        System.out.println("\"Mr Zhang\"是否\"g\"作为后缀吗？" + "Mr Zhang".endsWith("g"));

        //分割字符串
        String path = "/Users/Bane/Code/";
        String[] eachDir = path.split("/");
        System.out.println("以/分割" + path + "的结果如下：");
        for (int i = 0; i < eachDir.length; i++) {
            System.out.println(eachDir[i]);
        }

        //字符首次出现在索引的位置
        System.out.println("\'Z\'在\"BaneZhang\"中首次出现的索引位置为：" + "BaneZhang".indexOf('Z'));
        System.out.println("\"an\"在\"BaneZhang\"中首次出现的索引位置为：" + "BaneZhang".indexOf("an"));
        System.out.println("\"ana\"在\"BaneZhang\"中首次出现的索引位置为：" + "BaneZhang".indexOf("ana"));

        //替换字符串中的内容
        System.out.println("替换\"BaneZhang\"中的\'e\'为空格：" + "BaneZhang".replace('e', ' '));
        System.out.println("替换\"BaneZhang\"中的\"Bane\"为\"Bangquan\"：" + "BaneZhang".replace("Bane", "Bangquan"));
    }
}
