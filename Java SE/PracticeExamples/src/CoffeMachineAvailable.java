import java.util.Scanner;

public class CoffeMachineAvailable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waterPerCup = 200;
        int cofferPerCup = 15;
        int milkPerCup = 50;
        int maxCupsAvailable = 0;
        System.out.println("Write how many ml of water the coffee machine has: ");
        int waterAvailable = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milkAvailable = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int coffeAvailable = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int coffeCupsRequiered = scanner.nextInt();

        int maxCupsForTheAvailableMilk = milkAvailable / milkPerCup;
        int maxCupsForTheAvailablewater = waterAvailable / waterPerCup;
        int maxCupsForTheAvailablecoffe = coffeAvailable / cofferPerCup;

        if (maxCupsForTheAvailablewater > maxCupsForTheAvailableMilk) {
            if (maxCupsForTheAvailableMilk > maxCupsForTheAvailablecoffe) {
                maxCupsAvailable = maxCupsForTheAvailablecoffe;

            } else {
                maxCupsAvailable = maxCupsForTheAvailableMilk;
            }

        } else {
            if (maxCupsForTheAvailablewater > maxCupsForTheAvailablecoffe) {
                maxCupsAvailable = maxCupsForTheAvailablecoffe;

            } else {
                maxCupsAvailable = maxCupsForTheAvailablewater;
            }
        }

        if (waterAvailable >= waterPerCup * coffeCupsRequiered
                && milkAvailable >= milkPerCup * coffeCupsRequiered
                && coffeAvailable >= cofferPerCup * coffeCupsRequiered) {
            int additionalCups = maxCupsAvailable - coffeCupsRequiered;

            if (additionalCups == 0) {
                System.out.println("Yes, I can make that amount of coffee");
            } else {
                System.out.println("Yes, I can make that amount of coffee (and even " +
                        additionalCups + " more than that)");
            }

        } else {
            System.out.println("No, I can make only " + maxCupsAvailable + " cup(s) of coffee");
        }
    }
}
