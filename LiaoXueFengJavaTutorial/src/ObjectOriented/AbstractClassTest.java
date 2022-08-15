package ObjectOriented;

public class AbstractClassTest {
    public static void main(String[] args) {
        AbstractTest dad = new AbstractSister();
        AbstractSister son = new AbstractSister();
        dad.run();
        son.run();
    }
}

abstract class AbstractTest {
    public abstract void run();

}

class AbstractSister extends AbstractTest {
    @Override
    public void run() {
        System.out.println("Student");
    }
}
