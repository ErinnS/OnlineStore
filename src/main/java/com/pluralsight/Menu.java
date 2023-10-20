package com.pluralsight;
import java.util.Scanner;
public class Menu {

    public static int mainMenu() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to the OnlineStore\n");

        System.out.println("What product would you like?");
        System.out.println("1: View available products");
        System.out.println("2: Exit the OnlineStore\n");

        System.out.print("Please make a selection: ");

        return myScanner.nextInt();

    }
    public static int availableProducts(Product[] products) {
        Scanner myScanner = new Scanner(System.in);

        for (int i = 0; i < products.length; i++) {
            if (products[i].isCheckedOut() == false) {

                Product currentProduct = products[i];
                System.out.println(i + 1 ":" + currentProduct.getName() + " - id:" + currentProduct.getId() + "SUK:" + currentProduct.get);
            }
        }
    }



}
