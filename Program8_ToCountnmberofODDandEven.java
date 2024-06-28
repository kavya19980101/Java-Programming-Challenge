import java.util.Scanner;
public class Program8_ToCountnmberofODDandEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        int evencount=0;
        int oddcount=0;
        while(number>0)
        {
            int rem=number%10;
            if(rem%2==0)
            {
             evencount++;
            }
            else
            {
                oddcount++;
            }
            number=number/10;
        }
        System.out.println("The number of even number is "+ evencount);
        System.out.println("The number of odd number is "+oddcount);
    }
}
