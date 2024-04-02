package inheritance.coding.demo5;

public class City {
    String name;

    int population;

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

    public City() {

    }

    public City(String name) {
        this(name, 0);
    }

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }
}
