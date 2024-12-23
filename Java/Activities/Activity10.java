package activities;

import java.util.ArrayList;
import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        
    	HashSet<String> hs = new HashSet<>();
    	//Adding element to hashset
        hs.add("M");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        hs.add("M");
        hs.add("X");
        
        //Print hashset
        System.out.println("Original hash set:" +hs);
        //check size
        System.out.println("Size of hash set:" +hs.size());
        //remove element
        System.out.println("Removing from a Hashset:" +hs.remove("A"));
        
        //remove element not present in set
        if(hs.remove("Z")) {
        	System.out.println("Z removed from set");
        }
        else {
        	System.out.println("Z is not present in the set");
        }
        
        //Search for element
        System.out.println("Checking if M is present " + hs.contains("M"));
        //print updated hashset
        System.out.println("Updated HashSet: " + hs);
        
    }
}