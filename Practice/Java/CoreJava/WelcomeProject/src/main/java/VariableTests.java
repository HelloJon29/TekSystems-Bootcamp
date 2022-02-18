public class VariableTests {
    public static void main(String[] args) {
        int x;
        int y;
        final int z = 1;

        x = 1;
        y = 1.0; //this won't work because it is not the same as an INT datatype
        z = 2; // this is an error since we initialized the variable as <final>
        System.out.println();
    }
}
