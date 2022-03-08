import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Integer[] t = new Integer[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            t[i] = rand.nextInt(1000);
            if (t[i] % 2 == 0)
                System.out.println(t[i]);
        }
    }
}
