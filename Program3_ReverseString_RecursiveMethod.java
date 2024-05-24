public class Program3_ReverseString_RecursiveMethod {
    public static void main(String[] args) {
        String str = Reverse("Kavya");
        System.out.println("The Reverse String is " + str);
    }

    public static String Reverse(String s) {
        if (s.length() == 0){
            return "";}
        return s.charAt(s.length() - 1) + Reverse(s.substring(0, s.length() - 1));

    }
}
