package BaoZhuangLei;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal d1 = new BigDecimal(123.456);
        BigDecimal d2 = new BigDecimal(23.456789);
        BigDecimal d3 = d1.divide(d2, 10, RoundingMode.HALF_UP);    // 四舍五入
        BigDecimal d4 = d1.divide(d2);
    }
}


