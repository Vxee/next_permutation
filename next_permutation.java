import java.util.Scanner;
public class Main {
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="12345";
		int[] a  = new int[]{1,2,3,4,5};
		nextPermutation(a);
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]);
		}
		
	}
	
	public static void nextPermutation(int[] num) 
	{
		if (num.length <= 1) return;
	        
		int i = num.length - 1;
		while (i > 0 && num[i] <= num[i-1])
			--i;
		if (i == 0) {		//这是一个递减的序列
			reverse(0, num.length-1,num);
			return;
		}
			
		--i;
		int j = num.length - 1;
		while (!(num[i] < num[j])) 
			--j;
			
		swap(i,j,num);
		reverse( i + 1, num.length-1,num);
	}
	
	private static void swap(int i, int j,int[] a) {
		// TODO Auto-generated method stub
		int index=a[i];
		a[i]=a[j];
		a[j]=index;
	}

	public static void reverse(int start,int end,int[] a)
	{
		int index,i,j;
		for(i=start,j=end;i<=(start+end)/2;i++,j--)
		{
			index=a[i];
			a[i]=a[j];
			a[j]=index;
		}
	}
	
	
}
