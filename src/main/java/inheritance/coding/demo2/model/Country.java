package inheritance.coding.demo2.model;

import java.util.ArrayList;
import java.util.List;

public class Country {

    List<City> cities;

    public List<String> getCityNames(){
        List<String> names = new ArrayList<>();
        for(City city: cities){
            names.add(city.name);
        }
        return names;
    }
}
