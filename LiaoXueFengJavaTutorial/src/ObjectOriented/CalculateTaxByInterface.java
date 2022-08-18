package ObjectOriented;

public class CalculateTaxByInterface {
    public static void main(String[] args) {
        IncomeInterFace[] incomeInterFaces = new IncomeInterFace[] {
                new NormalIncome(100),
                new SalaryIncome(350)
        };

        System.out.println(calculateTax(incomeInterFaces));
    }

    public static double calculateTax(IncomeInterFace[] incomeInterFaces) {
        double sum = 0;
        for (IncomeInterFace incomeInterFace : incomeInterFaces) {
            sum += incomeInterFace.getTax();
        }
        return sum;
    }
}

// 通过接口算税，接口其实就是没有字段的抽象类咯，不用想的多复杂
interface IncomeInterFace {
    double getTax();    // 定义抽象方法：获取税，定义具体的子类去实现这个接口即可
}

class NormalIncome implements IncomeInterFace {
    private double income;

    public NormalIncome(double income) {    // 定义构造函数，默认只有一个无参数的构造函数
        this.income = income;
    }

    @Override
    public double getTax() {    // 实现接口定义的抽象方法
        return 1*income;
    }
}

class SalaryIncome implements IncomeInterFace {
    private double income;
    public SalaryIncome(double income) {
        this.income = income;
    }

    @Override
    public double getTax() {    // 实现接口定义的抽象方法
        return 2*income;
    }
}