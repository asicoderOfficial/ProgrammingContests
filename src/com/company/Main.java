package com.company;

import java.util.Random;
import java.util.Scanner;

class Main {
    static Scanner sc = new Scanner(System.in);

    public static void solver(int a, int b) {
        int m = (a + b) / 2;
        System.out.println(m);
        String response = sc.nextLine();
        if(response.equals("TOO_SMALL"))
            solver(m + 1, b);
        else if(response.equals("TOO_BIG"))
            solver(m-1, b);
    }
    public static void main(String[] args) {
	// write your code here
        int n, a, b, res;
        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();
        a++;
        while(n != 0) {
            if(sc.nextLine().equals("TOO_SMALL"))
                a++;
            else if(sc.nextLine().equals("TOO_BIG"))
                b--;
            n--;
        }

    }
}
