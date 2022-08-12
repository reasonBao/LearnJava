package BasicTest;

public class ConstantTest {
    public static void main(String[] args) {
        Person person = new Person();
        String str = new String("Main");

        person.setName(str);

        System.out.print("main的字符串 为： ");
        System.out.print(str);
        System.out.print("  哈希码为：");
        System.out.println(System.identityHashCode(str));

        System.out.print("   类的字符串为： ");
        System.out.print(person.name);
        System.out.print("  哈希码为：");
        System.out.println(System.identityHashCode(person.name));

        str = "Main-two";

        System.out.print("main的字符串为： ");
        System.out.print(str);
        System.out.print("  哈希码为：");
        System.out.println(System.identityHashCode(str));

        System.out.print("   类的字符串为： ");
        System.out.print(person.name);
        System.out.print("  哈希码为：");
        System.out.println(System.identityHashCode(person.name));
    }
}

class Person {
    public String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

