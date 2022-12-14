package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice;
        printInstructions();

        while (!quit){
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - All choices");
        System.out.println("\t 1 - Print Grocery item list");
        System.out.println("\t 2 - Add item in the list");
        System.out.println("\t 3 - Modify item in the list");
        System.out.println("\t 4 - Remove item in the list");
        System.out.println("\t 5 - Search item in the list");
        System.out.println("\t 6 - Quit the application");
    }
    public static void addItem(){
        System.out.println("Enter an item to add : ");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem(){
        System.out.println("Current Item name : ");
        String itemNo = scanner.nextLine();
        System.out.println("Enter replacement item : ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryList(itemNo,newItem);
    }
    public static void removeItem(){
        System.out.println("Enter item name : ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }
    public static void searchForItem(){
        System.out.println("Item to search : ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem );
        }else {
            System.out.println(searchItem + " search item not found");
        }
    }

}
