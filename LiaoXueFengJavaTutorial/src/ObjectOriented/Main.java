package ObjectOriented;

public class Main {
    public static void main(String[] args) {
        Person3 a = new Person3();
        System.out.println(Person3.getCount());
        Person3 a1 = new Person3();
        System.out.println(Person3.getCount());
        Person3 a2 = new Person3();
        System.out.println(Person3.getCount());

    }
}

interface Person {
    String getName();
    default void run() {
        System.out.println(getName() + " run");
    }
}

class Student implements Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
