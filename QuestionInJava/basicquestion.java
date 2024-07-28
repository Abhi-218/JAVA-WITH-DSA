package QuestionInJava;
import java.util.Scanner;
public class basicquestion {
    public static void main(String[] args) {
        int flag=1;
        while (flag == 1) {
            
        
        Scanner Sc = new Scanner(System.in);
        System.out.println("1) Average of three numbers.");
        System.out.println("2) Sum of all odd number 1 to N.");
        System.out.println("3) Greater of two number.");
        System.out.println("4) Circleference of circle.");
        System.out.println("5) Eligible for vote or Not.");
        System.out.println("which number you want to try ?");
        int index = Sc.nextInt();

        switch (index) {
            case 1:
                System.out.print("First number : ");
                float FirstNumber= Sc.nextFloat();
                System.out.print("Second number : ");
                float SecondNumber= Sc.nextFloat();
                System.out.print("Third number : ");
                float ThirdNumber= Sc.nextFloat();
                System.out.println("Average of three number is "+ AvgOfThreeNumber(FirstNumber,SecondNumber,ThirdNumber)); 
                break;
            case 2:
                System.out.print("N :");
                int N = Sc.nextInt();
                System.out.println("Sum of all odd number is " + SumOfAllOddNumber(N)); 
                break;
            case 3:
                 GreaterOfTwoNumber();  
                 break;
            case 4:  
                 System.out.print("Radius : ");
                 double Radius = Sc.nextFloat();
                 System.out.println("Circleference of circle is "+CircleFerenceOfCircle(Radius));
                 break;
            case 5:
                 System.out.print("Enter your Age : ");
                 int Age = Sc.nextInt();
                 Eligibility(Age);
            default:
                flag = 0;
                break;
        }
    }
    }
    public static float AvgOfThreeNumber(float a,float b,float c){
              return (a+b+c)/3;
    }
    public static int SumOfAllOddNumber(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2 == 0){}
            else{
               sum = sum + i;
            }
        }
        return sum;
    }   
    public static void GreaterOfTwoNumber(){
        Scanner Sc = new Scanner(System.in);
        System.out.print("First number : ");
        int FirstNumber = Sc.nextInt();
        System.out.print("Second number : ");
        int SecondNumber = Sc.nextInt();
        if(FirstNumber > SecondNumber){
            System.out.println(FirstNumber + " was greater");
        }
        else{
            System.out.println(SecondNumber + " was greater");
        }
    }
    public static double CircleFerenceOfCircle(double Radius){
        return 6.28*Radius;
    }
    public static void Eligibility(int Age){
        if(Age > 18){
               System.out.println(" You are eligible for vote ");
            }
        else{
            System.out.println(" You are not eligible for vote ");
        }
    }
}
