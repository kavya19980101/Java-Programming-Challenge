import java.util.Scanner;

public class Program7_findEvenorOddnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int number=sc.nextInt();
        if(number%2==0 && number>=2)
        {
            System.out.println(number+ " is the even number");
        }
        else if(number%2!=0 && number!=0) {
            System.out.println(number + " is the odd number");
        }
        else
        {
            System.out.println("The given input is not valid number/input");
        }
    }
}
