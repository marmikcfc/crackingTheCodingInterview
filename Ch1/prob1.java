import java.util.*;
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


	public static void main(String args[]){

		System.out.println(hasUniqueCharacters("qwerty"));
	}
}