/* @author Xingyu Gao */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
		Factorial fc = new Factorial();
		
		System.out.println("Please input an integer(0~170) to get it's factorial:");
		Scanner input = new Scanner(System.in);
		double numberInput  = input.nextInt();
		if(numberInput<0){
			System.out.println("Negative numbers have no factorial.");
		}else if(numberInput<=170){
			System.out.println("The factorial of the number you input is: "+fc.factorial(numberInput));
		}else{
			System.out.println("The result is out of range.");
		}	
    }
}

class Factorial {
	private double i;
	
	public double factorial(double i){
		if(i==0){
			return 1;
		}else{
			return i*factorial(i-1);
		}
	}
		
}
