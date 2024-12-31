package modern.java8.defaults;

public interface Interface2 extends Interface1{

    default void methodB(){
        System.out.println("Inside Method B");
    }
}
