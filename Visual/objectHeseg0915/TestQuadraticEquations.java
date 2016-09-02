package objectHeseg0915;

import java.util.Scanner;

public class TestQuadraticEquations {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double a, b,c;
		System.out.println("a,b,c =");
		a=input.nextDouble();
		b=input.nextDouble();
		c=input.nextDouble();
        
		
		QuadraticEquations q1= new QuadraticEquations(a,b,c);
		q1.FindRoot();
		
	}

}
