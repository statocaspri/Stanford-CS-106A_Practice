/*
* File: rotateArrayElements.java
*
*/
import acm.program.*;
import acm.graphics.*;
import java.util.*;

public class rotateArrayElements extends ConsoleProgram {
	
	public void run () {
		
		int[] list = {10, 20, 30, 40, 50};
		int[] list1 = {10, 20, 30, 40, 50};
				
		mistery(list1);
		printMistery(list1);
		
		rotate (list);
		printRotated(list);
		
	}
	
	// rotates array elements, ie moves them for one position
	private void rotate(int[] array) {
		int tmp = array[array.length - 1];
		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}
		array[0] = tmp;
		
	}
	
	private void printRotated (int[] array) {
		println("Elementi rotiranog niza su: ");
		for (int i = 0; i<array.length; i++) {
			println(array[i]);
		}
	}
	
	// does not rotates array elements, it changesthe first and the last and the remaining elements are all the same = 10, overwrites them
	private void mistery (int[] array) {
		int tmp = array[array.length - 1];
		for (int i = 1; i < array.length; i++) {
			array[i] = array[i - 1];
		}
		array[0] = tmp;
	
	}
	
	private void printMistery (int[] array) {
		println("Elementi misterioznog niza su: ");
		for (int i = 0; i<array.length; i++) {
			println(array[i]);
		}
	}

}
