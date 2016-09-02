package matrixAndMethod;
/*
 code by uchral 
 2015.09.15
 
 6taltai shoog 6000 udaa hayh turshilt hj too bur heden udaa buuj bgaag haruul ?
 */
public class RandomBodlogo {

	public static void showResult(int arr[]){
		for(int i=1; i<arr.length ; i++){
			System.out.println(i+" nud "+arr[i]+ "udaa buusan ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int []Shoo= new int[7]; // 1-6 hurtelh taluudiig tuluuluh massiv jishee ni shoo[1] ni dotroo 1 heden udaa buusniig hadgalna.
     
     for(int i=0; i<6000; i++){
    	 Shoo[(int)(Math.random()*7)]++;
     }
     showResult(Shoo);
    		 
	}

}
