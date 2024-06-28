
//Program of Maximum of 3 numbers using Ternary Operator
public class Program05_Maxof3no_Usingternaryoperator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int max=a>b?(a>c?a:c):(b>c?b:c);
        System.out.println("the max of number is "+max);//Terary Operator
    }
}
