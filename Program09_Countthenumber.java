import java.util.Scanner;

public class Program09_Countthenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        int count=0;
        while(number>0)
        {
            number=number/10;
            count++;
        }
        System.out.println("The number count is "+count);
    }
}
