package BasicTest;

import java.util.Arrays;

public class ConstantTest {
    public static void main(String[] args) {


        Person p = new Person();
        String[] fullName = new String[] {"bao", "ruisehn"};
        p.setName(fullName);
        System.out.println(p.getName());

        fullName[0] = "ZHANG";
        System.out.println(p.getName());
    }
}

class Person {
    private String[] name;

    public String getName() {
        return this.name[0] + " " + this.name[1];
    }

    public void setName(String[] name) {
        this.name = name;
    }
}
