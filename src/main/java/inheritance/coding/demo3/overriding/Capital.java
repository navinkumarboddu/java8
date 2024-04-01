package inheritance.coding.demo3.overriding;

public class Capital extends City {

    @Override
    public String toString() {
        return "Capital{" +
                "name= '" + getName() + '\'' +
                ", population=" + getPopulation() +
                 "}";
    }
}
