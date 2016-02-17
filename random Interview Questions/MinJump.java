public class MinJump{

	public static int getMinJump(int [] a){

		
		if(a.length< 1 )
			return 0;
		int ladder= a[0];
		int stairs = a[0]; 
		int jump =1;
		for (int level =1;level<a.length ;level++ ) {
			if(level == a.length -1)
				return jump;
			if(level + a[level] > ladder)
				ladder=level+a[level];
			stairs--;
			if(stairs == 0){
				jump++;
				stairs=ladder - level;
			}
		}
		return jump;
	}

	public static void main(String args[]) {

		int [] a = {1,4,3,7,1,2,6,7,6,10};
		System.out.println(getMinJump(a));

	}
}