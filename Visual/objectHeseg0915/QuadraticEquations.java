package objectHeseg0915;

public class QuadraticEquations {
	private double a,b,c;

	public QuadraticEquations(){
		this(1,0,0);
	}
	public QuadraticEquations(double a, double b, double c){
		this.a=a;
		this.b=b;
		this.c=c;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}


	public double getDiscriminant(){
		return ((b*b)-4*a*c);
	}

	public double getRoot1(){
		double root1= -1*(b)+Math.sqrt(getDiscriminant());
		root1=root1/(2*a);
		return root1;
	}

	public double getRoot2(){
		double root2= -1*(b)-Math.sqrt(getDiscriminant());
		root2=root2/(2*a);
		return root2;
	}

	public void FindRoot(){
		if(getDiscriminant()==0){
			System.out.println("x1 and x2 ="+getRoot1());
		}

		if(getDiscriminant()<0){
			System.out.println("no Root !!!");

		}

		if(getDiscriminant()>0){
			System.out.println("x1 ="+getRoot1()+"\nx2="+getRoot2());
		}
	}
}
