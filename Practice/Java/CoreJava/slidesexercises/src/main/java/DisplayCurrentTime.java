public class DisplayCurrentTime {
    public static void main(String[] args) {

        long epoch = System.currentTimeMillis(); //
        long sec = (epoch / 1000) % 60;
        long min = (epoch / (1000 * 60)) % 60;
        long hour = (epoch / (1000 * 3600)) % 12;

        System.out.println(hour + ":" + min + ":" + sec);
    }
}
