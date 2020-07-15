import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long nFact = 1;
        int i = 1;
        do {
            nFact = nFact * (i++ + 1);
        } while (nFact < Math.abs(m) + 1);

        System.out.println(i);
    }
}
