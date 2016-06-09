
/*
* File: HashMapExam.java
*
* We enter data in the two HashMaps, and method compares whether there are the same elements (key/value pairs)
*/

import acm.program.*;

import java.util.*;


public class HashMapExam extends ConsoleProgram  {
	
	public void run() {
		setFont("Times New Roman-24");
		
		println("Input the elements of HashMap1 "); 
		InputHashMap1();
		
		println("Input the elements of HashMap2 "); /
		InputHashMap2();
		
		commonKeyValuePairs(HashMap1, HashMap2); //Returns a count of the number of common key/value pairs in the two HashMaps that are passed in
	}
	
	
	//input data for hashmap1 (name and condition)
	private void InputHashMap1() {
		while (true) {
			String name = readLine("Enter name: ");
			if (name.equals("")) break;
			String condition = readLine("Enter his/her condition: ");
			HashMap1.put(name, condition);
			}
		}
	
    //input data for hashmap2 (name and condition)
	private void InputHashMap2() {
		while (true) {
			String name = readLine("Enter name: ");
			if (name.equals("")) break;
			String condition = readLine("Enter his/her condition: ");
			HashMap2.put(name, condition);
			}
		}
	
	
	/** Method: commonKeyValuePairs(map1, map2)
	*
	* Returns a count of the number of common key/value pairs in the
	* two HashMaps that are passed in.
	*/
	public int commonKeyValuePairs(HashMap<String,String> map1,HashMap<String,String> map2) {
		int count = 0;
		//Get iterator over map1
		Iterator<String> it = map1.keySet().iterator(); 
		while (it.hasNext()) {
			//Get key from map1
			String key = it.next();
			//See if that keys exists in map2
			if (map2.containsKey(key)) { 
				//Look up values associated with key in both maps
				String map1Value = map1.get(key); 
				String map2Value = map2.get(key); 
				//See if values are equal
				if (map2Value.equals(map1Value)) { 
					count++;
				}
			}
		}
		println("There is a " +count+ " key/value pairs in map1 and map2");
		return count;
	}
	
	
	/* Private instance variable */
	private HashMap<String,String> HashMap1 = new HashMap<String,String>(); 
	private HashMap<String,String> HashMap2 = new HashMap<String,String>();

}
