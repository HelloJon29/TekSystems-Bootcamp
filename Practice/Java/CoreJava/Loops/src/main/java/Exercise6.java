// write a nested for loop to write the number of days of 2 weeks
public class Exercise6 {
    public static void main(String[] args) {

        for(int i= 0; i <= 1; i++) { // Start loop here and specify the least occurence weeks, this will pass twice
            if(i == 0) {
                System.out.println("Week 1:");
            } else if(i == 1) {
                System.out.println("Week 2:");
            }
            for( int i2 = 1; i2 <= 5; i2++) { // The inner loop will run every time the outer loop loops, this will be the days printed thise will pass 5 times each
                System.out.println("Day: " + i2);
            }
        }
    }
}
