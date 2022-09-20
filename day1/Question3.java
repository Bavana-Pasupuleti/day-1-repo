import java.util.*;

class BigSmall{
	
	public int sum(int x,int y,int z){
	   
		int[] arr=new int[3];
		arr[0]=x;
		arr[1]=y;
		arr[2]=z;
		Arrays.sort(arr);
		int res=arr[0]+arr[2];
		 System.out.println("Sum is "+res);
		return res;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		//sc.close();
		System.out.println("Enter 3 numbers that you wish");
		
		BigSmall o=new BigSmall();
		o.sum(a,b,c);
		
	}
}