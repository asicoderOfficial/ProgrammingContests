package com.company.ICPC.AdaByron2020;

import java.util.*;

public class Primes {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> ins = new ArrayList<>();
        int maximum = -1, a, res = 0;
        while(sc.hasNext()) {
            a = sc.nextInt();
            ins.add(a);
            if (a > maximum)
                maximum = a;
        }
        boolean[] primes = sieve(maximum);
        for (Integer in : ins) {
            if (primes[in]) {
                ++res;
            }
        }

        switch (res) {
            case 0 :
                System.out.println("No prime numbers were found!");
                break;
            case 1 :
                System.out.println("Only one prime number was found!");
                break;
            default :
                System.out.println(res + " prime numbers were found!");
        }
    }

    public static boolean[] sieve(int maximum) {
        boolean[] primes = new boolean[maximum+1];
        for(int i=2; i<=maximum; ++i) {
            primes[i] = true;
        }
        for (int i = 2; i * i <= maximum; ++i) {
            if(primes[i]) {
                for (int j = i * i; j <= maximum; j+=i) {
                    primes[j] = false;
                }
            }
        }
        return primes;
    }
}