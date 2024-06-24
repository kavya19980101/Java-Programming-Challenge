public class Program6_Maxof3no_UsingifelseCondition {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int max;
        if(a>b && a>c)
        {
            max=a;
        } else if (b>a && b>c) {
            max=b;
        }
        else
        {
            max=c;
        }
        System.out.println("Maximum of number is: "+max);
    }
}
