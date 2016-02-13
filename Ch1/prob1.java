import java.util.*;
/*
	Implement an algorithm to determine if a string has all unique characters. What
    if you cannot use additional data structures?
*/
public class prob1{
	
	public static boolean hasUniqueCharacters(String s){

		HashMap <Character,Integer> h = new HashMap<Character,Integer>();

		for(int i=0; i<s.length();i++){
			if(h.containsKey(s.charAt(i))){
				return false;
			}
			else{
				h.put(s.charAt(i),1);
			}
		}

		return true;

	}

		public static boolean hasUniqueCharacters1(String s){

			boolean[] check = new boolean[256];
			for(int i=0; i<s.length();i++){

			if(check[s.charAt(i)]){
				return false;
			}

			check[s.charAt(i)] = true;

		}

		return true;

	}


	public static void main(String args[]){

		System.out.println(hasUniqueCharacters1("qwertwy"));
	}
}