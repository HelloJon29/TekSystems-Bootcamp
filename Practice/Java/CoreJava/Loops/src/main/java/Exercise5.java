// Write a program that breaks after iterating by multiple of 5s at 50
public class Exercise5 {
    public static void main(String[] args) {

        for (int count = 1; count <= 100; count++) {
            if (count > 50)
                break;
            if (count % 5 == 0) {
                System.out.println(count);
            }
        }
    }
}
