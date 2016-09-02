package java1;

public class IllegalTriangleException extends Exception {
      double side1, side2, side3;
      
      public IllegalTriangleException(double side1, double side2, double side3){
    	  super("invalid Triangle ");
    	  System.out.println("error:"+side1+side2+side3);
      }
   
}
