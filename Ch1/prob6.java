/*
	Given an image represented by an NxN matrix, where each pixel in the image is
	4 bytes, write a method to rotate the image by 90 degrees. Can you do this in
	place?
*/
public class prob6{
	 public static void rot90(int[][] m) {
		
		//Transpose	

 		 for (int i = 0; i < m.length; i++) {
 			for (int j = i+1; j < m[0].length;j++) {
 			int temp = m[i][j];
 			m[i][j] = m[j][i];
 			m[j][i] = temp; 
		}
 	}

		System.out.println("Transpose Matrix ");

 			for (int i = 0; i < m.length; i++) {
 			for (int j = 0; j < m[0].length; j++) {
 				System.out.print(m[i][j]);
 			}

 			System.out.println();
 		}


 	//Change Columns

 			 for (int i = 0; i < m.length; i++) {
 			int temp = m[i][0];
 			m[i][0] = m[i][m.length-1];
 			m[i][m.length-1] = temp; 
		}
 	


 		System.out.println("Matrix ");

 			for (int i = 0; i < m.length; i++) {
 			for (int j = 0; j < m[0].length; j++) {
 				System.out.print(m[i][j]);
 			}

 			System.out.println();
 		}

 }

  public static void rot90_another(int[][] m) {
		
 		 for (int i = 0; i < m.length/2; i++) {
 			for (int j = 0; j < (m[0].length/2)+1;j++) {
 			int temp = m[i][j];
 			m[i][j] = m[j][m.length-1-i];
 			m[j][m.length-1-i] = m[m.length-1-i][m.length-1-j]; 
 			m[m.length-1-i][m.length-1-j] = m[m.length-1-j][i];
 			m[m.length-1-j][i] = temp;
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

	


 			for (int i = 0; i < m.length; i++) {
 			for (int j = 0; j < m[0].length; j++) {
 				System.out.print(m[i][j]);
 			}

 			System.out.println();
 		}

 			//m[1][2]=0;
		rot90_another(m);


	}
}