package iterable.java8;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        String str = "OptionalDemo";
        // 创建 Optional
        Optional<String> opt = Optional.ofNullable(str);

        // 获取 Optional 中的值
        String optValue = opt.get();
    }

}
