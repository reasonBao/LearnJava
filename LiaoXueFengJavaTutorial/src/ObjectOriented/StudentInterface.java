package ObjectOriented;

public class StudentInterface implements PersonInterface{
    String name = "unnamed";

    public StudentInterface(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("学生run");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
