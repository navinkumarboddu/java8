package selectedclass.coding.arrayListExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class AddingRemovingElements {

    public static void main(String[] args) {
        out.println("\n** Adding and Removing Elements ** \n");

        String[] arr = {"red","green","blue"};
        ArrayList aList1 = new ArrayList(Arrays.asList(arr));
        out.println("1. aList1 = " + aList1.toString());

        aList1.add("purple");
        out.println("2. aList1 = " + aList1.toString());

        aList1.add(0,"orange");
        out.println("3. aList1 = " + aList1.toString());

        String[] arr2 = {"black","white","blue"};
        List<String> list1 = new ArrayList<>(Arrays.asList(arr2));
        out.println("4. list1 = " + aList1.toString());

        aList1.addAll(list1);
        out.println("5. aList1 = " + aList1.toString());

        String item = (String) aList1.get(1);
        out.println("6. aList1[1] : " + item);
        out.println("7. aList1 : " + aList1.toString());

        aList1.set(1,"yellow");
        out.println("8. aList1 :" + aList1.toString());


    }
}
