package QuestionInJava;

import java.util.Scanner;

public class advancequestion {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int flag = 1;
        while (flag == 1) {

            System.out.println("which number you want to try ?");
            System.out.println("1) Counter of Positive , Nagative and 0 ");
            System.out.println("2) Power of number");
            System.out.println("3) Gretest common divisor of two numbers");
            System.out.println("4) Fibonacci series");
            int index = Sc.nextInt();

            switch (index) {
                case 1:
                    System.out.print("How many numbers you have : ");
                    int Number = Sc.nextInt();
                    Counter(Number);
                    break;
                case 2:
                    System.out.print("X : ");
                    int X = Sc.nextInt();
                    System.out.print("N :");
                    int N = Sc.nextInt();
                    PowerOfNumber(X, N);
                    break;
                case 3:
                    GretestCommonDivisor();
                    break;
                case 4:
                    FibonacciSeries();
                    break;
                default:
                    flag = 0;
                    break;
            }
        }
    }

    public static void Counter(int n) {
        Scanner Sc = new Scanner(System.in);
        int Positive = 0, Nagative = 0, Zero = 0;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("number " + (i + 1) + " : ");
            numbers[i] = Sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (numbers[i] > 0) {
                Positive++;
            } else if (numbers[i] < 0) {
                Nagative++;
            } else {
                Zero++;
            }
        }
        System.out.println("Positive : " + Positive + " Nagative : " + Nagative + " Zero : " + Zero);

    }

    public static void PowerOfNumber(int x, int n) {
        int power = 1;
        for (int i = 0; i < n; i++) {
            power *= x;
        }
        System.out.println("power of number : " + power);
    }

    public static void GretestCommonDivisor() {
        Scanner Sc = new Scanner(System.in);
        int n1 = Sc.nextInt();
        int n2 = Sc.nextInt();

        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD is : " + n2);
    }
    public static void FibonacciSeries(){
        Scanner Sc = new Scanner(System.in);
        int N = Sc.nextInt();
        int a=0,b=1,c;
        System.out.print(a+""+b);
        for(int i=2;i<N;i++){
            c=a+b;
            a=b;
            b=c;
           System.out.print(c);
        }
    }
}
