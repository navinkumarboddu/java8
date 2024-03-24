package operators.coding;

public class EqualityOperatorExample {

    public static void main(String[] args) {

        boolean x = 2 == 2.0;
        System.out.println(x);

        long a = 2;
        float b = 2.0F;
        System.out.println(a == b);

        boolean i = true;
        boolean j = (i = false);
        System.out.println(j);

        Car x1 = new Car("blue");
        Car y1 = new Car("blue");
        System.out.println(x1 == y1); //reference comparison

        Car z1 = y1;
        System.out.println(z1 == y1);


        String a1 = "hi";
        String b1 = "hi";
        System.out.println(a1 == b1); //return true as it points to same location from String Literal Pool

        String c1 = new String("hi"); //create new Objects
        System.out.println(c1 == a1); //returns false

        System.out.println(c1.equals(a1)); //returns true as it compares the contents
    }
}


class Car{
    String color;

    public Car(String color) {
        this.color = color;
    }
}