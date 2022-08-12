package BasicTest;

public class ConstantTestTwo {
    public static void main(String[] args) {
        PersonTwo person = new PersonTwo();
        String[] strArray = new String[] {"One", "Two", "Three"};

        person.setName(strArray);

        System.out.print("main的字符串 为： ");
        System.out.print(strArray[0]);
        System.out.print(" ");        
        System.out.print(strArray[1]);
        System.out.print(" ");
        System.out.print(strArray[2]);
        System.out.println(" ");
        
        System.out.print("  哈希码为：");
        System.out.print("strArray: ");
        System.out.println(System.identityHashCode(strArray));
        System.out.print("strArray[0]: ");
        System.out.println(System.identityHashCode(strArray[0]));
        System.out.print("strArray[1]: ");
        System.out.println(System.identityHashCode(strArray[1]));
        System.out.print("strArray[2]: ");
        System.out.println(System.identityHashCode(strArray[2]));

        
        System.out.print("类的字符串 为： ");
        System.out.print(person.name[0]);
        System.out.print(" ");
        System.out.print(person.name[1]);
        System.out.print(" ");
        System.out.print(person.name[2]);
        System.out.println(" ");

        System.out.print("  哈希码为：");
        System.out.print("person.name: ");
        System.out.println(System.identityHashCode(person.name));
        System.out.print("person.name[0]: ");
        System.out.println(System.identityHashCode(person.name[0]));
        System.out.print("person.name[1]: ");
        System.out.println(System.identityHashCode(person.name[1]));
        System.out.print("person.name[2]: ");
        System.out.println(System.identityHashCode(person.name[2]));


        strArray[1] = "change";
        System.out.println("\n################分界线################################");
        System.out.print("main的字符串 为： ");
        System.out.print(strArray[0]);
        System.out.print(" ");
        System.out.print(strArray[1]);
        System.out.print(" ");
        System.out.print(strArray[2]);
        System.out.println(" ");

        System.out.print("  哈希码为：");
        System.out.print("strArray: ");
        System.out.println(System.identityHashCode(strArray));
        System.out.print("strArray[0]: ");
        System.out.println(System.identityHashCode(strArray[0]));
        System.out.print("strArray[1]: ");
        System.out.println(System.identityHashCode(strArray[1]));
        System.out.print("strArray[2]: ");
        System.out.println(System.identityHashCode(strArray[2]));


        System.out.print("类的字符串 为： ");
        System.out.print(person.name[0]);
        System.out.print(" ");
        System.out.print(person.name[1]);
        System.out.print(" ");
        System.out.print(person.name[2]);
        System.out.println(" ");

        System.out.print("  哈希码为：");
        System.out.print("person.name: ");
        System.out.println(System.identityHashCode(person.name));
        System.out.print("person.name[0]: ");
        System.out.println(System.identityHashCode(person.name[0]));
        System.out.print("person.name[1]: ");
        System.out.println(System.identityHashCode(person.name[1]));
        System.out.print("person.name[2]: ");
        System.out.println(System.identityHashCode(person.name[2]));
    }
}

class PersonTwo {
    public String[] name;

    public void setName(String[] name) {
        this.name = name;
    }
}

