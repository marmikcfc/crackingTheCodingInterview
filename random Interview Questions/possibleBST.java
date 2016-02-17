import java.util.*;
public class possibleBST{
	
	public static int possibilites(int n, int [] solution){

		if(n==1 || n==0)
			return 1;

		int possibilites=0;
		for(int i=0;i<n;i++){
			if(solution[i] == -1){
				solution[i]=possibilites(i,solution);
			}
			if(solution[n-1-i] == -1){
				solution[n-1-i] = possibilites(n-1-i,solution);
			}
			possibilites += solution[i]*solution[n-1-i];
		}

		return possibilites;
		
	}
	public static void main(String args[]){

			int n=3;
			int [] sol=new int[n];
			for(int i=0;i<n;i++){
				sol[i] = -1;
			}
			System.out.println(possibilites(n,sol));
	}

}