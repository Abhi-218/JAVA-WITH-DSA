package PatternInJava;

import java.util.Scanner;

public class advancepattern {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("1. pattern 1");
        System.out.println("2. pattern 2");
        System.out.println("3. pattern 3");
        System.out.println("4. pattern 4");
        System.out.println("5. pattern 5");
        System.out.println("6. Print a hollow Butterfly.");
        System.out.println("7. pattern 7");
        System.out.println("8. pattern 8");
        System.out.println("9. pattern 9");
        System.out.println("10. pattern 10");
        System.out.println(" which pattern you want to try");
        int index = Sc.nextInt();

        switch (index) {
            case 1:
                System.out.println("1. pattern 1");
                pattern_1();
                break;
            case 2:
                System.out.println("2. pattern 2");
                pattern_2();
                break;
            case 3:
                System.out.println("3. pattern 3");
                pattern_3();
                break;
            case 4:
                System.out.println("4. pattern 4");
                pattern_4();
                break;
            case 5:
                System.out.println("5. pattern 5");
                pattern_5();
                break;
            case 6:
                System.out.println("6. pattern 6");
                pattern_6();
                break;
            case 7:
                System.out.println("7. pattern 7");
                pattern_7();
                break;
            case 8:
                System.out.println("8. pattern 8");
                pattern_8();
                break;
            case 9:
                System.out.println("9. Print a hollow Rhombus");
                pattern_9();
                break;
            case 10:
                System.out.println("10. Print Pascal’s Triangle");
                pattern_10();
                break;
            default:
                System.out.println("This number in not defined");
                break;
        }
    }

    static void pattern_1() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            int spaces = 2 * (3 - i);
            for (int j = 0; j <= spaces; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern_2() {
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < 5; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern_3() {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void pattern_4() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    static void pattern_5() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern_6() {
        System.out.println("Print a hollow Butterfly.");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--){
               for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
               }
               for(int j=1;j<=5-i;j++){
                  System.out.print("  ");
               }
               for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
               }
               System.out.println();
        }
    }

    static void pattern_7() {
         for(int i=1;i<=5;i++){
              for(int j=1;j<=5-i;j++){
                System.out.print(" ");
              }
              for(int j=1;j<=i;j++){
                System.out.print(j + " ");
              }
              System.out.println();
         }
    }

    static void pattern_8() {
                for(int i=1;i<=5;i++){
                    for(int j=5-i;j>=0;j--){
                    System.out.print(i);
                    }
                    System.out.println();
                }
    }

    static void pattern_9() {
        System.out.println("Print a hollow Rhombus");
           for(int i=1;i<=5;i++){
               for(int j=1;j<=5-i;j++){
                  System.out.print(" ");
               }
               for(int j=1;j<=5;j++){
                 if(i==1 || j==1 || j==5 || i==5){
                    System.out.print("*");
                 }
                 else{
                    System.out.print(" ");
                 }
               }
               System.out.println();
           }
    }

    static void pattern_10() {
        System.out.println("Print Pascal’s Triangle");
        for (int i=1;i<=5;i++) {
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            int C = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(C + " ");
                C = C * (i - j) / j;
            }
            System.out.println();
        }
    }

}
