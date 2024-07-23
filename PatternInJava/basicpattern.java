package PatternInJava;

import java.util.Scanner;

public class basicpattern {
    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("1. Solid Rectangle ");
        System.out.println("2. Hollo Rectangle ");
        System.out.println("3. Half Pyramid ");
        System.out.println("4. Inverted Half Pyramid ");
        System.out.println("5. Inverted & Rotated Half Pyramid  ");
        System.out.println("6. Half Pyramid with Numbers ");
        System.out.println("7. Inverted Half Pyramid with Numbers ");
        System.out.println("8. Floyd's Triangle ");
        System.out.println("9. 0-1 Triangle ");
        System.out.println("which pattern you want to try ?");
        int index = Sc.nextInt();

        switch (index) {
            case 1:
                System.out.println("1. Solid Rectangle ");
                Solid_rectangle();
                break;
            case 2:
                System.out.println("2. Hollo Rectangle ");
                HolloRectangle();
                break;
            case 3:
                System.out.println("3. Half Pyramid ");
                HalfPyramid();
                break;
            case 4:
                System.out.println("4. Inverted Half Pyramid ");
                InvertedHalfPyramid();
                break;
            case 5:
                System.out.println("5. Inverted & Rotated Half Pyramid  ");
                InvertedAndRotatedHalfPyramid();
                break;
            case 6:
                System.out.println("6. Half Pyramid with Numbers ");
                HalfPyramidwithNumbers();
                break;
            case 7:
                System.out.println("7. Inverted Half Pyramid with Numbers");
                InvertedHalfPyramidwithNumbers();
                break;    
            case 8:
                System.out.println("8. Floyd's Triangle ");
                FloydsTriangle();
                break;
            case 9:
                System.out.println("9. 0-1 Triangle ");
                TriangleWith0and1();
                break;
            default:
                break;
        }
    }
    static void Solid_rectangle(){
        for(int i=0;i<4;i++){
              for(int j=0;j<5;j++){
                System.out.print("* ");
              }
              System.out.println("");
        }
    }
    static void HolloRectangle(){
          for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                   if(i==0 || i==3 || j==0 || j == 4){
                    System.out.print("* ");
                   }
                   else{
                    System.out.print("  ");
                   }
            }
            System.out.println();
          }
    }
    static void HalfPyramid(){
           for(int i=0;i<5;i++){
               for(int j=0;j<=i;j++){
                   System.out.print("* ");
               }
               System.out.println();
           }
    }
    static void InvertedHalfPyramid(){
          for(int i=0;i<5;i++){
            for(int j=5;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
          }
    }
    static void InvertedAndRotatedHalfPyramid(){
        
            for(int i=0;i<5;i++){
                for(int j=5;j>i;j--){
                  System.out.print("  ");
                }
                for(int j=0;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
    static void HalfPyramidwithNumbers(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    static void InvertedHalfPyramidwithNumbers(){
             for(int i=5;i>=1;i--){
                for(int j=1;j<=i;j++){
                     System.out.print(j);
                }
                System.out.println();
             }
    }
    static void FloydsTriangle(){
          int k=0;
          for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                 k++;
                 System.out.print(k + "  ");
            }
            System.out.println();
          }
    }
    static void TriangleWith0and1(){
           for(int i=0;i<5;i++){
              for(int j=0;j<=i;j++){
                   if((i+j)%2==0){
                       System.out.print("1 ");
                   }
                   else{
                    System.out.print("0 ");
                   }
              }
              System.out.println();
           }

    }
    
}
