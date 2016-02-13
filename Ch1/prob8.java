 import java.util.*;
/*
	Write a method to replace all spaces in a string with '%20'. You may assume that the
    string has sufficient space at the end of the string to hold the additional characters,
    and that you are given the "true" length of the string.
*/
public class prob8 {

public static boolean isSubstr(String s1, String s2){

	return s1.toLowerCase().contains(s2.toLowerCase());

}

public static boolean checkIfRot(String s1, String s2){

		if(s1.length() == s2.length()){

			if(isSubstr(s1+s1,s2)){
				return true;
			}

		}

		return false;
	}

	public static void main(String args[]){

		System.out.println(checkIfRot("abcdef","defabc"));
	}
}
	
	


