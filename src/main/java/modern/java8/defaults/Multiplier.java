package modern.java8.defaults;

import java.util.List;

public interface Multiplier {
    int multiply(List<Integer> integerList);

    default int size(List<Integer> integerList){
        return integerList.size();
    }
}
