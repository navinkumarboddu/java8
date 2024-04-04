package exception.coding.demo2;

import java.io.IOException;

public class Person {

    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void setAge1(int age) throws IllegalArgumentException{
        if(age < 0){

        }
        this.age=age;
    }

    void setAge2(int age) throws IOException{
        this.age= age;
    }
}
