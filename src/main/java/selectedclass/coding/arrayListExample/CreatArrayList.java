package selectedclass.coding.arrayListExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class CreatArrayList {

    public static void main(String[] args) {
        out.println("\n** Create ArrayList ** \n");

        ArrayList arrayList = new ArrayList();

        ArrayList arrayList1 = new ArrayList(10);

        ArrayList<String> arrayList3 = new ArrayList<>();

        List list = new ArrayList();

        String[] arr = {"red", "green", "blue"};
        list = Arrays.asList(arr);

        out.println("list :" + list.toString());

        List list1 = new ArrayList(list);
        out.println("list1 :" + list1);

        arrayList = new ArrayList(Arrays.asList(arr));
        out.println("arrayList :" + arrayList.toString());
    }
}
