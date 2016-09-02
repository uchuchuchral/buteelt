package geriinDaalgavruud;

public class LinearEquation {
    private double a,b,c,d,e,f;
    
    public LinearEquation(double a, double b, double c, double d, double e, double f){
    	this.a=a;
    	this.b=b;
    	this.c=c;
    	this.d=d;
    	this.e=e;
    	this.f=f;
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
	
	public double getD() {
		return d;
	}
	
	public double getE() {
		return e;
	}
	
	public double getF() {
		return f;
	}
     
	double getX(){  // tegshitgeliin shiid butsaah method
	double x;
	x=(e*d-b*f)/(a*d-b*c);
	return x;
	}
	
	double getY(){  
	double y;
	y=(a*f-e*c)/(a*d-b*c);
	return y;
	}
	
	
	boolean isSolvable(){  // shiidtei esehiig shalgah method
		if((a*d-b*c)!=0){
			return true;
		}
		else
			return false;
	}
	

	 
}
