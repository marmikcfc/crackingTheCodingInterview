 import java.util.*;
/*
	Implement a function void reverse(char* str) in C or C++ which reverses a nullterminated
	string.
*/
public class prob2{
	
	public static String reverseString(String s){

		 StringBuffer buffer = new StringBuffer(s);
       return buffer.reverse().toString().trim();
       

	}

	public static void main(String args[]){

		System.out.println(reverseString("abcdef\0"));
	}
}

