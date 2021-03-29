package Test;

import java.math.BigDecimal;

/**
 * @author zhangrongchuan
 * @data 2020-12-2020/12/24-14:56
 * @Description
 */
public class Bigdecimala {
    public static void main(String[] args) {
        BigDecimal doublednzhye = new BigDecimal(0);
        BigDecimal doublelnZhye = new BigDecimal(0);
        BigDecimal doubleiSjkjje = new BigDecimal(0);
        BigDecimal doublexbyjqs_je = new BigDecimal(0);
        BigDecimal doublexcbzdgYjqs_je =new BigDecimal(0);
        BigDecimal doubleiykjje =new BigDecimal(0);
        BigDecimal iSjqsje = new BigDecimal(0);
        doublednzhye = new BigDecimal("633.20");
        doublelnZhye = new BigDecimal("600.58");
        doubleiSjkjje = new BigDecimal("633.20");
        doublexbyjqs_je = new BigDecimal("0");
        doublexcbzdgYjqs_je = new BigDecimal("0.00");
//        633.20
//        600.58
//        633.20
//        0
//        0.00
        iSjqsje = doublednzhye .add(doublelnZhye) .subtract(doubleiSjkjje) .add(doublexbyjqs_je) .add(doublexcbzdgYjqs_je);
        System.out.println(iSjqsje);
    }

}
