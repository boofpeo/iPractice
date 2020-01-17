package lambda.demo;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 1、找出2011年发生的所有交易，并按交易额排序
 * <p>
 * 2、交易员在哪些不同的城市工作过
 * <p>
 * 3、查找所有来自剑桥的交易员，并按姓名排序
 * <p>
 * 4、返回所有交易员的姓名字符串，并按字母顺序排序
 * <p>
 * 5、有没有交易员在米兰工作的？
 * <p>
 * 6、打印生活在剑桥的交易员的所有交易额
 * <p>
 * 7、所有交易中，最高的交易额是多少
 * <p>
 * 8、找到交易额最小的交易
 */
public class DemoClass {
    /**
     * 内置接口：
     * Consumer 消费者
     * <p>
     * Supplier 供给型
     * <p>
     * Function 函数型
     * <p>
     * Predicate 断言型
     * <p>
     * 一、方法引用
     * 对象::实例方法   参数列表，返回值要一致
     * 静态::方法       参数列表，返回值要一致
     * 类  :: 方法      对应的引用 = String::equals;  //(x, y) -> x.equals(y); 类::方法
     * <p>
     * 二、 构造器引用
     * ClassName:: new
     * 参数列表一致匹配
     * <p>
     * 三、数组引用
     * 创建一个长度为某某的数组
     * Type[]::new
     */
    public static void main(String[] args) {
        Trader zhangsan = new Trader("zhangsan", "Cambridge");
        Trader lisi = new Trader("lisi", "Milan");
        Trader wangwu = new Trader("wangwu", "beijing");
        Trader zhaoliu = new Trader("zhaoliu", "Cambridge");


        List<Transaction> transactions = Arrays.asList(
                new Transaction(zhangsan, 2011, 300),
                new Transaction(lisi, 2011, 800),
                new Transaction(wangwu, 2011, 900),
                new Transaction(zhaoliu, 2011, 400),
                new Transaction(lisi, 2012, 1000),
                new Transaction(zhangsan, 2012, 710),
                new Transaction(wangwu, 2012, 700),
                new Transaction(zhaoliu, 2012, 950)
        );

        //1、找出2011年发生的所有交易，并按交易额排序
         question1(transactions);

        //2、交易员在哪些不同的城市工作过
//        question2(transactions);
    }

    private static void question1(List<Transaction> transactions) {
//        Stream<Transaction>.of(transactions)
//                .forEach(x ->System.out.println(x.));
        Stream<Transaction> stream = transactions.stream();
        transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
//                .sorted((transaction1, transaction2) -> {
//                    //800 > 300 数字越小越靠前
//                    if (transaction1.getValue() > transaction2.getValue()) {
//                        return -1;
//                    } else {
//                        return 1;
//                    }
//                })
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);
    }

    private static void question2(List<Transaction> transactions) {

        Map<String, Transaction> map = new HashMap<>();

        List<Map<String, Transaction>> collect = transactions.stream()
                .map(transaction -> {
                    String city = transaction.getTrader().getCity();
                    map.put(city, transaction);
                    return map;
                })
                .distinct()
                .collect(Collectors.toList());

        System.out.println(collect);
//


}


}
