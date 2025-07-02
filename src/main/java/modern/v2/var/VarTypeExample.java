package modern.v2.var;

import java.util.List;
import java.util.Map;

public class VarTypeExample {

    //var in the class properties is not allowed
    //private var x = "abc";

    public static void main(String[] args) {
        var list = List.of("nibhish","navin");
        System.out.println("list = " + list);

        for(var name : list){
            System.out.println(name);
        }

        var map = Map.ofEntries(Map.entry("n",List.of("nibhish","navin")));
        System.out.println(map);

        map.forEach(( k, strings) -> System.out.println(k + strings));

        var transformedName = transform("navin");
        System.out.println(transformedName);

        //Limitations
        //var x = null;

        //var x = "ABC";
        //x=5; //Changing the type is not allowed

        var var = "Java"; //is allowed

    }

    //var in the function parameters is not allowed
    //static String transform(var name) // not allowed
    static String transform(String name){
        return name.toUpperCase();
    }
}
