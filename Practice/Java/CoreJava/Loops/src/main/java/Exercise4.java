// for loop to iterate by 5s to 100 and skip 25-75 with continue
public class Exercise4 {
    public static void main(String[] args) {

        for(int count = 1; count <= 100; count++) {
            if(count >= 25 && count <= 75)
                continue;
            if(count % 5 == 0) {
                System.out.println(count);
            }

        }

    }
}
