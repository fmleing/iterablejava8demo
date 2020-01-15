package iterable.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        List<Integer> listData = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            listData.add(i);
        }

        // 1. 获取流Iterator
        Stream<Integer> streamListData = listData.stream();


        // 2. 过滤流 获取集合中从1到10的数据集合
        Stream<Integer> limit1To10 = streamListData.filter(p -> p >= 1 && p <= 10);

        // 3. 打印信息
        limit1To10.forEach(p -> System.out.println("limit1To10 Nums ="+p));

    }
}
