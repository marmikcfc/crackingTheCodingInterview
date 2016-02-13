 import java.util.*;
/*
	Given two strings, write a method to decide if one is a permutation of the other.
*/
public class prob3{
	
	public static String sortStrings(String s){


		char a []= new char[s.length()];
		a=s.toCharArray();
		Arrays.sort(a);
		return new String(a);
	}

		public static boolean checkIfAnagrams(String s1, String s2){

		//consider the input is unicode and not ASCII, If it's ASCII simple array of size 256 and a character count
			if( sortStrings(s1.trim()).equals(sortStrings(s1.trim())))
				return true;
			else 
				return false;
		
	}

	public static void main(String args[]){

		System.out.println(checkIfAnagrams("abcdef\0","abcedf"));
	}
}

