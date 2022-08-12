package ObjectOriented;

public class ConstructorTest {
    public static void main(String[] args) {
        Student s = new Student();
        Person ss = s;

        Person a = new Student();

        System.out.println(a instanceof Person);
        System.out.println(a instanceof Student);
    }
}


