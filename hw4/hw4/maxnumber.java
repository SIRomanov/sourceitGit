package hw4;

public class maxnumber {
	public static void main(String[] args) {
		int[] arr = {1,9,7,18,6,10,5};
		System.out.println(met(arr));
	}
	static int met( int[] a){
		
		int max = 0;
		for( int k : a){
			if (k > max){
				max = k;
			}
		}
		return max;
	}
}