/* @author Xingyu Gao 
** This code is used to test whether there exist a integer, 
** The integer must meet the following conditions: 
** The integer = single digit factorial + ten digit factorial + hundred digit factorial + ...
** Like this format: abc = a! + b! +c!
** And it just test the integer from 0 to 99,999,999.
*/

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
		Factorial fc = new Factorial();
		
		for(int n=0; n<=9; n++){
			int g=n;
			if(n==fc.factorial(g)){
				System.out.println(n);
			}			
		}
		
		for(int n=10; n<=99; n++){
			int g=(n/1)%10;
			int s=(n/10)%10;			
			if(n==fc.factorial(s)+fc.factorial(g)){
				System.out.println(n); 
			}			
		}
		
		for(int n=100; n<=999; n++){
			int g=(n/1)%10;
			int s=(n/10)%10;
			int b=(n/100)%10;
			if(n==fc.factorial(b)+fc.factorial(s)+fc.factorial(g)){
				System.out.println(n); 
			}			
		}
		
		for(int n=1000; n<=9999; n++){
			int g=(n/1)%10;
			int s=(n/10)%10;
			int b=(n/100)%10;
			int q=(n/1000)%10;
			if(n==fc.factorial(q)+fc.factorial(b)+fc.factorial(s)+fc.factorial(g)){
				System.out.println(n); 
			}			
		}
		
		for(int n=10000; n<=99999; n++){
			int g=(n/1)%10;
			int s=(n/10)%10;
			int b=(n/100)%10;
			int q=(n/1000)%10;
			int w=(n/10000)%10;
			if(n==fc.factorial(w)+fc.factorial(q)+fc.factorial(b)+fc.factorial(s)+fc.factorial(g)){
				System.out.println(n); 
			}			
		}
		
		for(int n=100000; n<=999999; n++){
			int g=(n/1)%10;
			int s=(n/10)%10;
			int b=(n/100)%10;
			int q=(n/1000)%10;
			int w=(n/10000)%10;
			int sw=(n/100000)%10;
			if(n==fc.factorial(sw)+fc.factorial(w)+fc.factorial(q)+fc.factorial(b)+fc.factorial(s)+fc.factorial(g)){
				System.out.println(n); 
			}			
		}
		
		for(int n=1000000; n<=9999999; n++){
			int g=(n/1)%10;
			int s=(n/10)%10;
			int b=(n/100)%10;
			int q=(n/1000)%10;
			int w=(n/10000)%10;
			int sw=(n/100000)%10;
			int bw=(n/1000000)%10;
			if(n==fc.factorial(bw)+fc.factorial(sw)+fc.factorial(w)+fc.factorial(q)+fc.factorial(b)+fc.factorial(s)+fc.factorial(g)){
				System.out.println(n); 
			}			
		}
		
		for(int n=10000000; n<=99999999; n++){
			int g=(n/1)%10;
			int s=(n/10)%10;
			int b=(n/100)%10;
			int q=(n/1000)%10;
			int w=(n/10000)%10;
			int sw=(n/100000)%10;
			int bw=(n/1000000)%10;
			int qw=(n/10000000)%10;
			if(n==fc.factorial(qw)+fc.factorial(bw)+fc.factorial(sw)+fc.factorial(w)+fc.factorial(q)+fc.factorial(b)+fc.factorial(s)+fc.factorial(g)){
				System.out.println(n); 
			}			
		}	
    }
}

class Factorial {
	private int i;
	
	public int factorial(int i){
		if(i==0){
			return 1;
		}else{
			return i*factorial(i-1);
		}
	}
		
}