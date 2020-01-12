package iterable.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class IterableConsumerDemo {
    public static void main(String[] args) {

        // 创建集合
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=0; i<10; i++) myList.add(i);

        // 使用 迭代器 iterator
        Iterator<Integer> it = myList.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println("Iterator Value::"+i);
        }

        // 使用forEach表达式，使用 Consumer
        myList.forEach(new Consumer<Integer>() {

            public void accept(Integer t) {
                System.out.println("forEach anonymous class Value::"+t);
            }

        });

        // 执行 子定义Consumer
        MyConsumer action = new MyConsumer();
        myList.forEach(action);

    }

}

// 实现 Consumer 接口
class MyConsumer implements Consumer<Integer> {

    public void accept(Integer t) {
        System.out.println("消费者变量值::"+t);
    }


}
