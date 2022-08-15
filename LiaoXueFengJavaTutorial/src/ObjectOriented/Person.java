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

    public void run() {
        System.out.println("This is 人类");
    }
}

class Student extends Person {
    private int score;

    @Override
    public void run() {
        System.out.println("This is 学生类");
    }

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
