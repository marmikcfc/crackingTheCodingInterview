import java.util.*;
public class twoSum{
	
	public static void twoSum(int [] arr, int target){
		HashMap <Integer,Integer> h = new HashMap<Integer,Integer>();
		int[] result = new int[2];
		for(int i =0; i<arr.length;i++){
			if(h.containsKey(arr[i])){
				result[0] = arr[i];
				result[1] = h.get(arr[i]);
			}
			else{
				h.put(target-arr[i],arr[i]);
			}
		}

		System.out.println(" "+result[0]+" "+result[1]);
	}
	public static void main(String args[]){

		int target = 9;
		int [] arr={1,2,3,4,5,6,7};
		twoSum(arr,target);
	}

}