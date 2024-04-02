package inheritance.coding.demo5;

public class City {
    String name;

    int population;

    public City() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public City(String name) {
        this.name = name;
    }
}
