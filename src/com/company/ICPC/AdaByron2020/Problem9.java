package com.company.ICPC.AdaByron2020;

import java.util.*;

class Problem9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        while(sc.hasNext()) {
            a = sc.nextInt();
            if(calculateSum(a) == 9) {
                System.out.println(a);
            }
        }
        sc.close();
    }

    public static int calculateSum(int a) {
        if(a < 10)
            return a;
        else{
            int b = 0;
            while(a > 10) {
                b += a % 10;
                a /= 10;
            }
            b += a;
            return calculateSum(b);
        }
    }
}