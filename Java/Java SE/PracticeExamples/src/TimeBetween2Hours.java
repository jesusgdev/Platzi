import java.util.Scanner;

public class TimeBetween2Hours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int hourIn = scanner.nextInt();
        int minIn = scanner.nextInt();
        int segIn = scanner.nextInt();
        int hourOut = scanner.nextInt();
        int minOut = scanner.nextInt();
        int segOut = scanner.nextInt();

        if (hourIn < hourOut) {
            sum = (hourOut - hourIn - 1) * 3600 + (60 - minIn + minOut) * 60 - segIn + segOut;
            System.out.println(sum);
        } else if (hourIn > hourOut) {
            sum = (24 - hourIn + hourOut - 1) * 3600 + (60 - minIn + minOut) * 60 - segIn + segOut;
            System.out.println(sum);
        } else if (hourIn == hourOut && minIn > minOut) {
            sum = 23 * 3600 + 60 - minIn + minOut * 60 - segIn + segOut;
            System.out.println(sum);
        } else if (hourIn == hourOut && minIn <= minOut) {
            sum = (minOut - minIn) * 60 - segIn + segOut;
            System.out.println(sum);
        }
    }
}
