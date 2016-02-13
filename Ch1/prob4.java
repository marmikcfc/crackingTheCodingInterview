 import java.util.*;
/*
	Write a method to replace all spaces in a string with '%20'. You may assume that the
    string has sufficient space at the end of the string to hold the additional characters,
    and that you are given the "true" length of the string.
*/
public class prob4 {
	

public static String replaceSpace(String s){


		String [] stringArray= s.split(" ");
		s="";
		for(int i=0;i<stringArray.length;i++){

			if(i != stringArray.length-1)
				s=s+stringArray[i]+"%20";
			else
				s=s+stringArray[i];

		}

		return s;
	}

	public static void main(String args[]){

		System.out.println(replaceSpace("abc pqr xyz    "));
	}
}
	
	


