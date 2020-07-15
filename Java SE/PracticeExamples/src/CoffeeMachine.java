import java.util.Scanner;

public class CoffeeMachine {
    public static int water = 400;
    public static int milk = 540;
    public static int coffeBeans = 120;
    public static int disposableCups = 9;
    public static int money = 550;
    public static String action = "";
    public static int coffeChoise = 0;
    public static int exit = 1;

    public static void supplyUpdate() {
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                coffeBeans + " of coffe beans\n" +
                disposableCups + " of disposable cups\n" +
                money + " of money");
    }

    public static void isAvaible() {

        if (coffeChoise == 1) {
            if (water >= 250 && coffeBeans >= 16 && disposableCups >= 1) {
                System.out.println("I have enough resources, making you a coffee!");
            } else if (water < 250 && coffeBeans >= 16 && disposableCups >= 1) {
                System.out.println("Sorry, not enough water!");
            } else if (water >= 250 && coffeBeans < 16 && disposableCups >= 1) {
                System.out.println("Sorry, not enough coffe beans!");
            } else if (water >= 250 && coffeBeans >= 16 && disposableCups < 1) {
                System.out.println("Sorry, not enough disposable cups!");
            } else if (water < 250 && coffeBeans < 16 && disposableCups >= 1) {
                System.out.println("Sorry, not enough water and coffe beans!");
            } else if (water < 250 && coffeBeans >= 16 && disposableCups < 1) {
                System.out.println("Sorry, not enough water and disposable cups!");
            } else if (water >= 250 && coffeBeans < 16 && disposableCups < 1) {
                System.out.println("Sorry, not enough coffe beans and disposable cups!");
            } else if (water < 250 && coffeBeans < 16 && disposableCups < 1) {
                System.out.println("Sorry, not enough resources!");
            }

        } else if (coffeChoise == 2) {
            if (water >= 350 && milk >= 75 && coffeBeans >= 20 && disposableCups >= 1) {
                System.out.println("I have enough resources, making you a coffee!");
            } else if (water < 350 && milk >= 75 && coffeBeans >= 20 && disposableCups >= 1) {
                System.out.println("Sorry, not enough water!");
            } else if (water >= 350 && milk < 75 && coffeBeans >= 20 && disposableCups >= 1) {
                System.out.println("Sorry, not enough milk!");
            } else if (water >= 350 && milk >= 75 && coffeBeans < 20 && disposableCups >= 1) {
                System.out.println("Sorry, not enough coffe beans!");
            } else if (water >= 350 && milk >= 75 && coffeBeans >= 20 && disposableCups < 1) {
                System.out.println("Sorry, not enough disposable cups!");
            } else if (water < 350 && milk < 75 && coffeBeans >= 20 && disposableCups >= 1) {
                System.out.println("Sorry, not enough water and milk!");
            } else if (water < 350 && milk >= 75 && coffeBeans < 20 && disposableCups >= 1) {
                System.out.println("Sorry, not enough water and coffe beans!");
            } else if (water < 350 && milk >= 75 && coffeBeans >= 20 && disposableCups < 1) {
                System.out.println("Sorry, not enough water and disposable cups!");
            } else if (water >= 350 && milk < 75 && coffeBeans < 20 && disposableCups >= 1) {
                System.out.println("Sorry, not enough milk and coffe beans!");
            } else if (water >= 350 && milk < 75 && coffeBeans >= 20 && disposableCups < 1) {
                System.out.println("Sorry, not enough milk and disposable cups!");
            } else if (water >= 350 && milk >= 75 && coffeBeans < 20 && disposableCups < 1) {
                System.out.println("Sorry, not enough coffe beans and disposable cups!");
            } else if (water < 350 && milk < 75 && coffeBeans < 20 && disposableCups >= 1) {
                System.out.println("Sorry, not enough water, milk and coffe beans!");
            } else if (water < 350 && milk >= 75 && coffeBeans < 20 && disposableCups < 1) {
                System.out.println("Sorry, not enough water, coffe beans and disposable cups!");
            } else if (water < 350 && milk < 75 && coffeBeans >= 20 && disposableCups < 1) {
                System.out.println("Sorry, not enough water, milk and disposable cups!");
            } else if (water < 350 && milk < 75 && coffeBeans < 20 && disposableCups < 1) {
                System.out.println("Sorry, not enough resources!");
            }
        } else if (coffeChoise == 3) {
            if (water >= 200 && milk >= 100 && coffeBeans >= 12 && disposableCups >= 1) {
                System.out.println("I have enough resources, making you a coffee!");
            } else if (water < 200 && milk >= 100 && coffeBeans >= 12 && disposableCups >= 1) {
                System.out.println("Sorry, not enough water!");
            } else if (water >= 200 && milk < 100 && coffeBeans >= 12 && disposableCups >= 1) {
                System.out.println("Sorry, not enough milk!");
            } else if (water >= 200 && milk >= 100 && coffeBeans < 12 && disposableCups >= 1) {
                System.out.println("Sorry, not enough coffe beans!");
            } else if (water >= 200 && milk >= 100 && coffeBeans >= 12 && disposableCups < 1) {
                System.out.println("Sorry, not enough disposable cups!");
            } else if (water < 200 && milk < 100 && coffeBeans >= 12 && disposableCups >= 1) {
                System.out.println("Sorry, not enough water and milk!");
            } else if (water < 200 && milk >= 100 && coffeBeans < 12 && disposableCups >= 1) {
                System.out.println("Sorry, not enough water and coffe beans!");
            } else if (water < 200 && milk >= 100 && coffeBeans >= 12 && disposableCups < 1) {
                System.out.println("Sorry, not enough water and disposable cups!");
            } else if (water >= 200 && milk < 100 && coffeBeans < 12 && disposableCups >= 1) {
                System.out.println("Sorry, not enough milk and coffe beans!");
            } else if (water >= 200 && milk < 100 && coffeBeans >= 12 && disposableCups < 1) {
                System.out.println("Sorry, not enough milk and disposable cups!");
            } else if (water >= 200 && milk >= 100 && coffeBeans < 12 && disposableCups < 1) {
                System.out.println("Sorry, not enough coffe beans and disposable cups!");
            } else if (water < 200 && milk < 100 && coffeBeans < 12 && disposableCups >= 1) {
                System.out.println("Sorry, not enough water, milk and coffe beans!");
            } else if (water < 200 && milk >= 100 && coffeBeans < 12 && disposableCups < 1) {
                System.out.println("Sorry, not enough water, coffe beans and disposable cups!");
            } else if (water < 200 && milk < 100 && coffeBeans >= 12 && disposableCups < 1) {
                System.out.println("Sorry, not enough water, milk and disposable cups!");
            } else if (water < 200 && milk < 100 && coffeBeans < 12 && disposableCups < 1) {
                System.out.println("Sorry, not enough resources!");
            }
        }

    }

    public static void main(String[] args) {

         do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();
             System.out.println("");

            switch (action) {

                case "remaining":
                    supplyUpdate();
                    System.out.println("");
                    break;

                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String choise = scanner.nextLine();

                    if (choise.length() == 1) {
                        coffeChoise = Integer.parseInt(choise);
                    } else {
                        System.out.println("");
                        break;
                    }

                    switch (coffeChoise) {
                        case 1:
                            isAvaible();
                            if (water >= 250 && coffeBeans >= 16 && disposableCups >= 1) {
                                water -= 250;
                                coffeBeans -= 16;
                                money += 4;
                                disposableCups -= 1;
                                System.out.println("");
                            }
                            break;
                        case 2:
                            isAvaible();
                            if (water >= 350 && milk >= 75 && coffeBeans >= 20 && disposableCups >= 1) {
                                water -= 350;
                                milk -= 75;
                                coffeBeans -= 20;
                                money += 7;
                                disposableCups -= 1;
                                System.out.println("");
                            }
                            break;
                        case 3:
                            isAvaible();
                            if (water >= 200 && milk >= 100 && coffeBeans >= 12 && disposableCups >= 1) {
                                water -= 200;
                                milk -= 100;
                                coffeBeans -= 12;
                                money += 6;
                                disposableCups -= 1;
                                System.out.println("");
                            }
                            break;

                        case 4:
                            System.out.println("");
                            break;

                        default:
                            break;
                    }
                break;


                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    int waterSupply = scanner.nextInt();
                    water += waterSupply;
                    System.out.println("Write how many ml of milk do you want to add: ");
                    int milkSupply = scanner.nextInt();
                    milk += milkSupply;
                    System.out.println("Write how many grams of coffee beans do you want to add: ");
                    int coffeBeansSupply = scanner.nextInt();
                    coffeBeans += coffeBeansSupply;
                    System.out.println("Write how many disposable cups of coffee do you want to add: ");
                    int disposableCupsSupply = scanner.nextInt();
                    disposableCups += disposableCupsSupply;
                    System.out.println("");
                    break;

                case "take":
                    System.out.println("");
                    System.out.println("I gave you $" + money);
                    money = 0;
                    System.out.println("");
                    break;

                case "exit":
                    exit = 0;
                    break;

                default:
                    break;

            }

         } while (exit != 0);
    }
}

