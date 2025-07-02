package modern.v2.var;

import java.util.List;
import java.util.Map;

public class VarTypeExample {

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
    }

    static String transform(String name){
        return name.toUpperCase();
    }
}
