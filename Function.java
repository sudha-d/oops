package OOPS;

import java.util.Scanner;

class Arithmetic
{
    public double add(int a, int b)
    {
        double result = a + b;
        return result;
    }
}

public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arithmetic ar = new Arithmetic();
        int a;
        int b;
        System.out.println("please enter the first value");
        a = sc.nextInt();
        System.out.println("please enter the second value");
        b = sc.nextInt();
        double result = ar.add(a, b);
        System.out.println("result " + result);
    }
}