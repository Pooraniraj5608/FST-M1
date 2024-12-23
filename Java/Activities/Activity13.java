package activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		// create the objects
		Scanner scan = new Scanner(System.in);
		List<Integer> numArr = new ArrayList<>();
		Random indexGen = new Random();
		
		//Statement to show users to indicate when they can type
		System.out.println("Enter the numbers for the list");
		System.out.println("Enter a EOl or any non integer char to stop");
		
		//loop to take only integers from console
		while(scan.hasNextInt()) {
			numArr.add(scan.nextInt());
		}
		
		//Generate random index
		int generatedIndex = indexGen.nextInt(numArr.size());
		//print the random index and the value of that index4
	
		System.out.println("Random index generated " +generatedIndex);
		System.out.println("The number at generated index is " +numArr.get(generatedIndex));
	}

}
