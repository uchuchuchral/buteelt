package geriinDaalgavruud;

public class TheEightQueen {
	final static int N=8;
	private int []arr= new int[N];  // bagana
	private int []barr=new int[2*N-1]; // hajuu diagonal
	private int []carr=new int[2*N-1]; // gol diagonal
    private int []x= new int[N];
	static int solution;
    
	public TheEightQueen(){
	int i;
	solution=0;
	for(i=0; i<N; i++) arr[i]=1;
	for(i=0; i<2*N-1; i++) barr[i]=1;
	for(i=0; i<2*N-1; i++) carr[i]=1;
	}
	
	void seek(int i){
		int j;
		for(j=0; j<N; j++)
			if(arr[j]==1 && barr[i+j]==1 && carr[i-j+N-1]==1){
			  x[i]=j;
			  if(i<N-1){
				  arr[j]=barr[i+j]=carr[i-j+N-1]=0;
				  seek(i+1);
				  arr[j]=barr[i+j]=carr[i-j+N-1]=1;
			  }
			  else found();
			}
		
	}
	
	void found(){
		int i,j;
		solution=solution+1;
	   System.out.println("solution ="+solution);
	   
	    for(i=0; i<N; i++){
	    	for(j=0; j<N; j++){
	    		if(x[i]==j) System.out.print("Q");
	    		else System.out.print(".");
	    		
	    	}
	    	System.out.println();
	    }
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TheEightQueen e= new TheEightQueen();
      e.seek(0);
    // for(i=0; i<n)
	
	}

}
