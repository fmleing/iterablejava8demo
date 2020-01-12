package iterable.java8;

@FunctionalInterface
public interface Interface2 {

    void doSomething();

    default void log(String str){
        System.out.println("I2 logging::"+str);
    }

}
