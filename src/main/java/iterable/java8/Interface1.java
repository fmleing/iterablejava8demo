package iterable.java8;

@FunctionalInterface
public interface Interface1 {

    void active(String str);

    default void log(String str){
        System.out.println("I1 logging::"+str);
    }

    static void print(String str){
        System.out.println("Printing "+str);
    }

    // 可以尝试一下定义Object中的方法 将会得到下面这个错误提示
    //"A default method cannot override a method from java.lang.Object"
    //@Override
    //default String toString(){
    //    return "i1";
    //}

}
