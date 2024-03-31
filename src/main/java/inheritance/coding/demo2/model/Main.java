package inheritance.coding.demo2.model;

public class Main {

    public static void main(String[] args) {
        City city = new City();
        city.setName("Paris");
        city.setPopulation(10);

        System.out.println("Name = " + city.getName());
        System.out.println("Population = " + city.getPopulation());

        process(city);
        System.out.println("Name = " + city.getName());
        System.out.println("Population = " + city.getPopulation());

        int population = city.getPopulation();

        System.out.println("Population = " + population);
        process(population);
    }

    static void process(City city){
        city = new City();
        city.setName("New York");
        city.setPopulation(15);
    }

    static void process(int population){
        population = 100;
    }
}
