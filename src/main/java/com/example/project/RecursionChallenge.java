package com.example.project;

public class RecursionChallenge {

    public static int bunnyEars(int n) {
        if (n == 1) {
            return 2;
        }
        return 2 + bunnyEars(n - 1);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sumNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumNumbers(n - 1);
    }

    public static String countDown(int n) {
        if (n == 0) {
            System.out.print("Blast off!");
            return "Blast Off!";
        }
        System.out.print(n);
        return n + countDown(n - 1);
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }

    public static int countX(String s) {
        if (s.equals("")) {
            return 0;
        }
        if (s.charAt(0) == 'x') {
            return 1 + countX(s.substring(1));
        }
        return countX(s.substring(1));
    }

    public static String changePi(String s) {
        if (s.equals("")) {
            return "";
        }
        try {
            if (s.substring(0, 2).equals("pi")) {
                return "3.14" + changePi(s.substring(2));
            }
        } catch (Exception e) {

        }
        return s.substring(0, 1) + changePi(s.substring(1));
    }

    public static String reverse(String s) {
        if (s.equals("")) {
            return "";
        }
        return reverse(s.substring(1)) + s.substring(0, 1);
    }

    public static Boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        if (!s.substring(0, 1).equals(s.substring(s.length() - 1))) {
            return false;
        }
        System.out.println(s);
        return isPalindrome(s.substring(1, s.length() - 1));
    }

}