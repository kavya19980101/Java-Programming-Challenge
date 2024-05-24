import java.util.Scanner;

public class Program4_StringRevese_StringBuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.next();

        StringBuilder rev=new StringBuilder(str);
        rev.reverse();
        System.out.println("The Reverse String are "+rev);
    }
}
