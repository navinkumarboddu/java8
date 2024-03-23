package datatypes.coding;

public class ObjectTypes {
    public static void main(String[] args) {
        Person p  = new Person();
        p.setAge(30);

        System.out.println(p.getAge());
        System.out.println(p.isMarried());
    }
}

class Person {

    private int age = 25;
    private boolean isMarried = true;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }
}
