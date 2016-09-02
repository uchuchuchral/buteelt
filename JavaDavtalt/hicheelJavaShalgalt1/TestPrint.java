package hicheelJavaShalgalt1;

public class TestPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int []arr= new int[11];

		for(int i=1; i<arr.length; i++){
			arr[i]=i;
		}

		Print p= new Print();

		
		System.out.println("Arr["+(arr.length-1)+"] :");

		for(int i=1; i<arr.length; i++){
			p.print(arr[i]);
		}

		
		arr=eval(p, arr);


		for(int i=1; i<arr.length; i++){
			p.print(arr[i]);
		}

      
	}

	
	public static int[] eval(Function f, int []arr){
		// int []arr1= arr.clone();
		f= new Half();
		

		for(int i=0; i<arr.length; i++){

			arr[i]=f.evaluate(arr[i]);


		}


		return arr;

	}

}