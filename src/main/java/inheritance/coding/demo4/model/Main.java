package inheritance.coding.demo4.model;

public class Main {

    public static void main(String[] args) {
        Capital london = new Capital();
        london.setName("London");

        Capital newYork = new Capital();
        newYork.setName("New York");

        int c1 = london.compareTo(newYork);
        System.out.println(c1 == 0 ? "Same" : "Not same");
    }
}
