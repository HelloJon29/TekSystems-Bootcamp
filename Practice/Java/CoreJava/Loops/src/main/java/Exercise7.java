// Write a program that outputs palindromes between 1-100
public class Exercise7 {
    public static void main(String[] args) {

        for (int i = 10; i <= 200; i++) {
            String tmp = String.valueOf(i); //this is just a temporary variable to hold the string

            if (tmp.charAt(0) == tmp.charAt(tmp.length() - 1)) {
                System.out.println(tmp);
            }
        }
    }
}
