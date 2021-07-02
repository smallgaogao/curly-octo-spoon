/* @author Xingyu Gao */

public class FibonacciSequenceTest {
	public static void main(String[] args) {
		Fibonacci fi = new Fibonacci();
		
		for(int n=0; n<=9; n++){
			System.out.println(fi.sequence(n));		
		}
	}
}

class Fibonacci {
	private int i;
	
	public int sequence(int i){
		if(i==0){
			return 0;
		}else if(i==1){
			return 1;
		}else{
			return sequence(i-1)+sequence(i-2);
		}
	}	
}