
    public class Rev {
        public static String ReverseStr(String str) {
            if (str.length() == 0)
                return "";
                return str.charAt(str.length() - 1) + ReverseStr(str.substring(0, str.length() - 1));
        }
    }

