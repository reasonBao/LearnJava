package ObjectOriented;

public class ConstructorTest {
    public static void main(String[] args) {
        Student s = new Student();

        Person a = new Person();

        runTwice(a);
    }

    // 多态：指的是我们无法确定调用的方法是自己的方法 还是说是子类的方法，具体看这个实例是哪个类型，就调用哪个
    private static void runTwice(Person p) {
        p.run();
        p.run();//run的是具体哪个类型的方法，是学生就run学生
    }
}


