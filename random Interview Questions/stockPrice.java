public class stockPrice  {

	public static int profit(int[] arr){
		int min=arr[0];
		int maxProfit=arr[1] - arr[0];
		for(int i=2;i<arr.length;i++){
			int currProfit = arr[i] - min;
			maxProfit=Math.max(maxProfit,currProfit);
			if(min>arr[i]){
				min = arr[i];
			}

		}
		return maxProfit;
	}

	public static void main(String args[]){

//		int [] arr =   {10, 7, 5, 8, 11, 9};

			int [] arr =   {11,10,9,8,7,6,5,4,3,2};

		System.out.println(profit(arr));

	}
	
}