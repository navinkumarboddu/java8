package inheritance.coding.demo3.overriding;

public class Main {
    public static void main(String[] args) {
        City newYork = new City();
        newYork.setName("New York");
        newYork.setPopulation(10);

        Capital paris = new Capital();
        paris.setName("Paris");
        paris.setPopulation(20);

        System.out.println("Paris = " + paris.toString());
        System.out.println("New York = " + newYork.toString());

        process(paris);
    }

    static  void process(City city){
        System.out.println("City = " + city.toString());
    }
}
