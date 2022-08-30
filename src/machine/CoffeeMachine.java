package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        CoffeeMachineClass coffeeMachine = new CoffeeMachineClass();
        coffeeMachine.start();

        //        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write how many ml of water the coffee machine has: ");
//        int water = scanner.nextInt();
//        System.out.println("Write how many ml of milk the coffee machine has: ");
//        int milk = scanner.nextInt();
//        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
//        int beans = scanner.nextInt();
//        System.out.println("Write how many cups of coffee you will need:");
//        int requestedCups = scanner.nextInt();
//
//        int wCups = water / 200;
//        int mCups = milk / 50;
//        int bCups = beans / 15;
//        int wholeCups;
//
//        if (wCups <= mCups && wCups <= bCups) {
//            wholeCups = wCups;
//        } else if (mCups <= wCups && mCups <= bCups) {
//            wholeCups = mCups;
//        } else {
//            wholeCups = bCups;
//        }
//
//        if (wholeCups == requestedCups) {
//            System.out.println("Yes, I can make that amount of coffee");
//        } else if (wholeCups > requestedCups) {
//            System.out.println("Yes, I can make that amount of coffee (and even " + (wholeCups - requestedCups) + " more than that)");
//        } else {
//            System.out.println("No, I can make only " + wholeCups + " cup(s) of coffee");
//        }
//    int water = cups * 200;
//    int milk = cups * 50;
//    int beans = cups * 15;
//    System.out.println(water + " ml of water");
//    System.out.println(milk + " ml of milk");
//    System.out.println(beans + " ml of coffee beans");

//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Write how many cups of coffee you will need: ");
//    int cups = scanner.nextInt();
//    System.out.println("For " + cups + "cups of coffee you will need:");
//    int water = cups * 200;
//    int milk = cups * 50;
//    int beans = cups * 15;
//    System.out.println(water + " ml of water");
//    System.out.println(milk + " ml of milk");
//    System.out.println(beans + " ml of coffee beans");

//        System.out.println("Starting to make a coffee\n" +
//                "Grinding coffee beans\n" +
//                "Boiling water\n" +
//                "Mixing boiled water with crushed coffee beans\n" +
//                "Pouring coffee into the cup\n" +
//                "Pouring some milk into the cup\n" +
//                "Coffee is ready!");
    }
}
