package datatypes.coding;

public class UpCasting {

    public static void main(String[] args) {
        long longNumber = 10L;
        float floatNumber = 2.5F;
        float result = longNumber * floatNumber;

        System.out.println(result);

        //int intNumber = longNumber;
        //Incompatible types. Found: 'long', required: 'int'
        int intNumber = (int) longNumber;
        System.out.println(intNumber);
    }
}
