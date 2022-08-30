package machine;

import java.util.Objects;
import java.util.Scanner;

public class CoffeeMachineClass {
    Scanner scanner = new Scanner(System.in);
    int water = 400;
    int milk = 540;
    int beans = 120;
    int cups = 9;
    int money = 550;
    boolean on = true;
    String action;


    public void start() {
        printActionOptions();
    }

    private void printMachineState() {
        System.out.println("The coffee machine has:\n" +
                water + " ml of water\n" +
                milk + " ml of milk\n" +
                beans + " g of coffee beans\n" +
                cups + " disposable cups\n" +
                "$" + money + " of money"
        );
        System.out.println();
    }

    private void printActionOptions() {
        while (on) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.next();
            System.out.println();
            switch (action) {
                case "buy":
                    buy();
                    printActionOptions();
                    break;
                case "fill":
                    fill();
                    printActionOptions();
                    break;
                case "take":
                    take();
                    printActionOptions();
                    break;
                case "remaining":
                    printMachineState();
                    printActionOptions();
                    break;
                case "exit":
                    on = false;
                    break;
            }
        }

    }

    private void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String choice = scanner.next();
        if (Objects.equals(choice, "back")) {
            System.out.println();
            printActionOptions();
        } else {
            switch (choice.charAt(0)) {
                case '1':
                    if (water >= 250 && beans >= 16 && cups >= 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        water -= 250;
                        beans -= 16;
                        cups -= 1;
                        money += 4;
                        break;
                    } else if (water < 250) {
                        System.out.println("Sorry, not enough water!");
                        break;
                    } else if (beans < 16) {
                        System.out.println("Sorry, not enough coffee beans!");
                        break;
                    } else {
                        System.out.println("Sorry, not enough cups!");
                        break;
                    }
                case '2':
                    if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        water -= 350;
                        milk -= 75;
                        beans -= 20;
                        cups -= 1;
                        money += 7;
                        break;
                    } else if (water < 350) {
                        System.out.println("Sorry, not enough water!");
                        break;
                    } else if (milk < 75) {
                        System.out.println("Sorry, not enough milk!");
                        break;
                    } else if (beans < 20) {
                        System.out.println("Sorry, not enough coffee beans!");
                        break;
                    } else {
                        System.out.println("Sorry, not enough cups!");
                        break;
                    }
                case '3':
                    if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        water -= 200;
                        milk -= 100;
                        beans -= 12;
                        cups -= 1;
                        money += 6;
                        break;
                    } else if (water < 200) {
                        System.out.println("Sorry, not enough water!");
                        break;
                    } else if (milk < 100) {
                        System.out.println("Sorry, not enough milk!");
                        break;
                    } else if (beans < 12) {
                        System.out.println("Sorry, not enough coffee beans!");
                        break;
                    } else {
                        System.out.println("Sorry, not enough cups!");
                        break;
                    }
                default:
                    break;
            }
            System.out.println();
        }

    }

    private void fill() {
        System.out.println("Write how many ml of water you want to add:");
        water += scanner.nextInt();

        System.out.println("Write how many ml of milk you want to add:");
        milk += scanner.nextInt();

        System.out.println("Write how many grams of coffee beans you want to add:");
        beans += scanner.nextInt();

        System.out.println("Write how many disposable cups you want to add:");
        cups += scanner.nextInt();

        System.out.println();
    }

    private void take() {
        System.out.println("I gave you $" + money);
        money = 0;

        System.out.println();
    }

}
