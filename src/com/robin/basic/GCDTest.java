package com.robin.basic;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: bin
 * Date: 2017-12-26
 */
public class GCDTest {
    /**
     * 计算两个非负整数 p 和 q 的最大公约数：若 q 是 0，则最大公约数为 p。
     * 否则，将 p 除以 q 得到余数 r，p 和 q 的最大公约数即为 q 和 r 的最大公约数。
     */
    public static int gcd(int p, int q){
        if (q == 0){
            return p;
        }else {
            int r = p % q;
            return gcd(q,r);
        }
    }

    public static void main(String [] args){
        System.out.print(gcd(5,10));
    }
}
