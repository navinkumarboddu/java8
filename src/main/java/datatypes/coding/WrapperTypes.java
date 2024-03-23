package datatypes.coding;

import java.util.ArrayList;
import java.util.List;

public class WrapperTypes {

    public static void main(String[] args) {
        Integer a = new Integer(10); //constructor
        Integer b = 10; //primitive type

        System.out.println("Min value:" + a.MIN_VALUE);
        System.out.println("Min value:" + a.MAX_VALUE);

        int a1 = 10;
        int b1 = 10;

        System.out.println(a1 == b1); //compares values so true
        System.out.println(a == b); //compares reference so false

        System.out.println(a.intValue() == b.intValue()); //true
        System.out.println(a.equals(b)); //true
        System.out.println(a.compareTo(b)); // returns 0 as they are equal

        //Boxing and UnBoxing
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add(i); // int are boxed to Integer
        }

        System.out.println(list);

        Boolean isSomething = null;

        if(isSomething == null){
            System.out.println("Something is null...");
        }
    }
}
