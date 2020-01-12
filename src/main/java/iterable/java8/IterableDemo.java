package iterable.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class IterableDemo {
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

        // 使用forEach表达式
        myList.forEach(t -> System.out.println("forEach anonymous class Value::"+t));


    }

}

