package datatypes.coding;

public class StudyFields {
    public static void main(String[] args) {
        Employee e = new Employee("Joe",99);
        System.out.println(e);
    }
}

class Employee{
    private String name;
    private int age = 25;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 18 || age > 65){
            throw new IllegalArgumentException("Age is out of range. " +
                    "Accepted range between 18 and 65.");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}