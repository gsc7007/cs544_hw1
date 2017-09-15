package cs544bubsort;
import java.util.*;
import javax.swing.*;

/*Bubble Sort Code:
 * User inputs number list.
 * User pushes button.
 * Main starts up.
 * Main uses getList to retrieve information, and checks if it should accept.
 */

public class Main {

	public static void main(String[] args) {
		int[] numList = new int[8];
		numList = getList();
		if(numList[0] != -1) {
			int listAmt = getListAmt(numList);
			bubbleSort(numList,listAmt);
		}
	}

	public static int[] getList() {
		int[] unorderedList = new int[8];
		for(int i =0;i<8;i++)
			unorderedList[i] = -1;
		String numString = "2 5 3 8";
		Scanner sc1 = new Scanner(numString);
		int j = 0;
		
		//Check if there are 2-8 integers of value 0-9
		boolean numOk = false;
		while (!numOk) {
			while(sc1.hasNextInt()) {
				int temp = sc1.nextInt();
				if((temp < 0) || (temp>9)) {
					JOptionPane.showMessageDialog(null, "Error: Out of Bounds");
					break;
				}
				if (j < 8)
					j++;
				else {
					JOptionPane.showMessageDialog(null, "Error: Too many Numbers");
					break;
				}
			}
			
			if ((sc1.hasNextInt() == false) && (j>2)) {
				numOk = true;
			}
			else if((sc1.hasNextInt() == false) && (j<2)){
				JOptionPane.showMessageDialog(null, "Error: Not enough numbers in the list.");
				break;
			}	
		}
		
		sc1.close();
		if(numOk==false) {
			return null;
		}
		else {
		//Assuming there are 2-8 numbers of range 0-9
		Scanner sc2 = new Scanner(numString);
		for(int k = 0; k<j;k++) {
			unorderedList[k] = sc1.nextInt();
		}
		sc2.close();
		return unorderedList;
		}
	}
	public static int getListAmt(int[] numList) {
		int numInts = 0;
		for(int i = 0; i< 8;i++) {
			if (numList[i] != -1)
				numInts++;
		}
		return numInts;
	}
	public static void bubbleSort(int[] numList, int listAmt) {
		
		for(int i=0; i< listAmt; i++) {
			for(int j=0;j<listAmt-i-1;j++) {
				for(int k=0; k < listAmt; k++) {
					System.out.print(numList[k]+" ");
					if(k == (listAmt-1))
						System.out.println("");
				}
				
				if (numList[j] > numList[j + 1]) {
                    int temp = numList[j];
                    numList[j] = numList[j + 1];
                    numList[j + 1] = temp;
                }
			}
		}
		
		for(int m=0; m < listAmt; m++) {
			System.out.print(numList[m]+" ");
			if(m == (listAmt-1))
				System.out.println("");
		}
	}
}
