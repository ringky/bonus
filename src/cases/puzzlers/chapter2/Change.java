package cases.puzzlers.chapter2;

import java.math.BigDecimal;

public strictfp class Change {
    public strictfp static void main(String args[]) {
        System.out.println(2.00 - 1.10);
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.00")));
        System.out.println(Double.parseDouble("0.9"));
        System.out.println(new Double(0.9));
    }
}
