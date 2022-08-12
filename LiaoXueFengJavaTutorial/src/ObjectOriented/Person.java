package ObjectOriented;

public class Person extends Object{
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this(name, 18);
    }

    public Person() {

    }

    public void setName(String name) {
        this.name = name;
    }
}

class Student extends Person {
    private int score;

    public String hello() {
        return "Hello" + super.name;
    }

    Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    Student() {

    }
}
