package ObjectOriented;

public class Main2 {
    public static void main(String[] agrs) {
        System.out.println(Person2.flag);
        Person2.setFlag("ok");
        System.out.println(Person2.flag);
    }
}

class Person2 {
    public String name;
    public int age;

    public static int number = 0;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static String flag;
    public static void setFlag(String string) {
        flag = string;
    }
}
