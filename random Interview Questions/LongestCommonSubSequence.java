public class LongestCommonSubSequence{

	public static void lcs(String s1, String s2){
		int lenS1= s1.length();
		int lenS2 = s2.length();

		int [][] match = new int [lenS1][lenS2];
		int [][] pointer = new int [lenS1][lenS2];

		for(int i =0;i<lenS1;i++){
			for(int j=0;j<lenS2;j++){
				if(s1.charAt(i) == s2.charAt(j) )
				{
					if(i == 0 || j == 0){
						match[i][j] = 1;
					}
					else{
						match[i][j] = match[i-1][j-1] + 1;
					}
					pointer[i][j] = 0;
				}

				//If Mismatch
				else{
					if(i>0 && j>0){
						//Compute Max
						if(match[i-1][j] > match [i][j-1]){
							match [i][j] = match[i-1][j];
							pointer[i][j] = 2;
						}

						else{
							match [i][j] = match[i][j-1];
							pointer[i][j] = 1;
						}
					}

					else if(i==0 && j>0){

						match [i][j] = match[i][j-1];
						pointer[i][j] = 1;
					}

					else if(j==0 && i>0){

						match [i][j] = match[i-1][j];
						pointer[i][j] = 2;
					}
				}

			}
		}

		System.out.println("LEngth "+match[lenS1-1][lenS2-1]);
int j = lenS2-1;
int i=lenS1-1;
StringBuffer lcs = new StringBuffer();	
while(i>=0 && j>=0){
	if(pointer[i][j]==0){
		lcs.append(s1.charAt(i));
		i--; j--;

	}
	else if(pointer[i][j] == 1)
		j--;
	else 
		i--;
}


		System.out.println("String "+lcs.reverse());

	}
	
	
	public static void main(String args[]){

			String s1= "ABACADAEA";
			String s2 = "ABCDFAEA";
			lcs(s1,s2);
	}

}