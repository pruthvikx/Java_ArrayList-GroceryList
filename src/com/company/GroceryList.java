package com.company;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    //Add method

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    // print method

    public void printGroceryList(){
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    // modify method
    public void modifyGroceryList(String currentItem,String newItem){
        int position = findNewItem(currentItem);
        if (position >= 0){
            modifyGroceryList(position,newItem);
        }
    }
    private void modifyGroceryList(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has modified");
    }

    //remove method
    public void removeGroceryItem(String item){
        int position = findNewItem(item);
        if (position >= 0){
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    //Finding item

    private int findNewItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }
    public boolean onFile(String searchItem){
        int position = findNewItem(searchItem);
        if (position >= 0){
            return true;
        }
        return false;
    }

}
