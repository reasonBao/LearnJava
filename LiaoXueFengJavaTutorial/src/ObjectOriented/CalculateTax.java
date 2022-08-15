package ObjectOriented;

public class CalculateTax {
    public static void main(String[] args) {
        // 给一个有普通收入、工资收入、享受国务院津贴的人算税（主要特点是各部分税率不一样）
        Incomes incomes[] = new Incomes[] {
                // 因为可以向上转型，你不知一个person实际上是学生还是老师，类比这个例子
                new Incomes(1000),
                new Salary(10000),
                new GuoWuYuan(999)
        };
        double ans = calculateTotalTax(incomes);
        System.out.println("答案是 " + ans);
    }


    // 计算所有税的方法
    public static double calculateTotalTax(Incomes[] incomes) {    // 跟数组一样的参数
        double answer = 0;
        for (Incomes tmp : incomes) {
            answer += tmp.getTax();
        }
        return answer;
    }
}

class Incomes {
    protected double income;

    @Override
    public String toString() {
        return "income = " + income;
    }

    public Incomes(double income) {
        this.income = income;
    }

    public double getTax() {
        System.out.println("计算Income的税");
        return income * 0.1;    // 普通收入是10%的税率
    }
}

class Salary extends Incomes {
    public Salary(double income) {
        super(income);    // 构造方法中第一行必须调用父类的构造方法，默认是加上super()这个父类构造方法
    }

    @Override
    public double getTax() {
        if (income < 5000) {
            System.out.println("计算Salary的税");
            return 0;
        }
        else {
            System.out.println("计算Salary的税");
            return (income - 5000) * 0.2;   // 20%税率
        }
    }
}

class GuoWuYuan extends Incomes {
    public GuoWuYuan(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        System.out.println("计算补贴的税");
        return -100;    // 补贴100块，税减去100
    }
}
