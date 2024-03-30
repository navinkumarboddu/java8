package inheritance.coding.demo1;

public class City {

    private String name;
    private int population;

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if(population < 0){
            throw new IllegalArgumentException("Population cannot be negative !!!");
        }
        this.population = population;
    }
}
