import java.util.*;
/*
	Implement a method to perform basic string compression using the counts
    of repeated characters. For example, the string aabcccccaaa would become
    a2blc5a3. If the "compressed" string would not become smaller than the original
    string, your method should return the original string.
*/
public class prob5{
	
	public static String compression(String s){

		TreeMap <Character,Integer> h = new TreeMap<Character,Integer>();

		for(int i=0; i<s.length();i++){
			if(h.containsKey(s.charAt(i))){
				int temp = h.get(s.charAt(i));
				temp++;
				h.put(s.charAt(i),temp);
			}
			else{
				h.put(s.charAt(i),1);
			}
		}

		String compressedString="";
		for(Map.Entry<Character,Integer> entry : h.entrySet()) {
			  Character key = entry.getKey();
  			  Integer value = entry.getValue();
  			  compressedString=compressedString+key+value;
		}


		if(compressedString.length() > s.length()){
			return s;
		}
		else {
			return compressedString;
		}

	}



	public static void main(String args[]){

		System.out.println(compression("qqqqaa"));
	}
}