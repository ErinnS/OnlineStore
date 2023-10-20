package com.pluralsight;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

public class OnlineStoreApp {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        boolean onlineStore = true;

        while (onlineStore) {

        }

    }
    public static void loadInventory() {
        FileReader file = null;
        try {
            FileReader fileReader = new FileReader("src/main/resources/products.csv");
            BufferedReader bufferedReader = new BufferedReader(file);
            String input;
            while ((input = bufferedReader.readLine()) != null) {
                System.out.println(input);
            }
            bufferedReader.close();

        } catch( IOException e) {
            e.printStackTrace();


        }




    }





    }