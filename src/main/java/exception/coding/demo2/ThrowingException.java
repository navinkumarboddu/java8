package exception.coding.demo2;

import java.io.IOException;

public class ThrowingException {

    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(20);

        System.out.println(p.getAge());

        p.setAge1(25);

        try {
            p.setAge2(30);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
