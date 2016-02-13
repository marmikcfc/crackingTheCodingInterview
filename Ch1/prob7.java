

 import java.util.*;
/*
	Implement an algorithm to determine if a string has all unique characters. What
    if you cannot use additional data structures?
*/
public class prob7{
	 public static void zeroReplace(int[][] m) {
 		boolean[] row = new boolean[m.length];
 		boolean[] column = new boolean[m[0].length];

		 for (int i = 0; i < m.length; i++) {
 			for (int j = 0; j < m[0].length;j++) {
 			if (m[i][j] == 0) {
 				row[i] = true;
 				column[j] = true;
 			}
 		}
 	}	

 			for (int i = 0; i < m.length; i++) {
 			for (int j = 0; j < m[0].length; j++) {
 				if (row[i] || column[j]) {
 					m[i][j] = 0;
 				}
 			}
 		}

 		System.out.println("Matrix ");

 			for (int i = 0; i < m.length; i++) {
 			for (int j = 0; j < m[0].length; j++) {
 				System.out.print(m[i][j]);
 			}

 			System.out.println();
 		}

 }


	public static void main(String args[]){

		int x =1;
		int [][] m =new int [3][3];
		for(int i =0;i<3;i++){
			for(int j=0;j<3;j++){

				m[i][j] = x;
				x++;
			}
		}

		m[1][2]=0;
		zeroReplace(m);
	}
}