public class fullPermutation {

	static int count = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str = "1234".toCharArray();
		permutation(str,0,3);
		System.out.println(count);
	}

	private static void permutation(char[] str, int start, int end) {
		// TODO Auto-generated method stub
		if(start>=end){
			count++;
			System.out.println(String.valueOf(str));
		}else{
			for(int i=start;i<=end;i++){
				swap(str,start,i);
				permutation(str,start+1,end);
				swap(str,start,i);
				
			}
			
		}
	}
	static void swap(char array[],int a,int b){
		char temp = array[a];
		array[a]=array[b];
		array[b]=temp;
	}

}
