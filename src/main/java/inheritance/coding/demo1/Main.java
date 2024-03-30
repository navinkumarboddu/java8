package inheritance.coding.demo1;

public class Main {

    public static void main(String[] args) {
        City city = new City("Paris");
        city.setPopulation(-10);

        System.out.println(city.getName());
        System.out.println(city.getPopulation());
    }
}
