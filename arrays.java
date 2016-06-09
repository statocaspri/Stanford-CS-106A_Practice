
/* File:Arrays.java
*
* Array exercise
*
* Checks the one part of Sudoku game (3x3 array) to see if it correctly contains one copy of each digit
* between 1 and 9 
*
*/

import acm.program.*;

public class arrays extends ConsoleProgram {
	
	public void run () {
		
		int[][] matrix = new int[3][3]; 
		
		for (int i = 0; i < matrix.length; i++) { 
			for (int j = 0; j < matrix[0].length; j++) { 
				matrix[i][j] = readInt("Unesite brojeve od 1-9 u matricu: "); 
			}
		}
				
		checkUpperLeftCorner(matrix); 
		
		if (checkUpperLeftCorner(matrix)) { 
			println("Unos ispravan, u matrici nema duplih brojeva od 1-9, niti brojeva van tog ranga!!");
		} else {
			println("Neispravan unos, U matrici ima duplih brojeva ili su brojevi van ranga, molimo Vas unesite brojeve ponovo!!");
		}
	}

/** Method: checkUpperLeftCorner
*
* This method checks the upper left corner of a Sudoku array
* to see if it correctly contains one copy of each digit
* between 1 and 9. If so, the method returns true. If it
* contains values that are duplicated or out of range, the
* method returns false.
*/
	private boolean checkUpperLeftCorner(int[][] matrix) {
		boolean[] alreadyUsed = new boolean[10];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int digit = matrix[i][j];
				if (digit < 1 || digit > 9) return false;
				if (alreadyUsed[digit]) return false; 
				alreadyUsed[digit] = true;            
			}
		}
		return true;
	}
	

}
