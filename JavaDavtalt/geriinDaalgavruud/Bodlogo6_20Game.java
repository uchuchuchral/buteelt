package geriinDaalgavruud;

import java.io.Console;
import java.util.Scanner;



public class Bodlogo6_20Game {
	char [][] arr=new char [8][8] ; // delgetsend haruulah massiv
	boolean [][] arr1= new boolean [8][8]; //bers tawisan esehiig shalgah bool massiv
	int count;  // heden udaa bers tawisniig tooloh tooluur 8aas hetrehgui
    boolean end; //duusah ued hudal bolno utgaa awna
    Scanner input= new Scanner(System.in);
    Console console = System.console();  // console tseverleh console classiin obekt
    int x; //bers tawih muriig hadgalah huwisagch
    int y; // bers tawih baganiig hadgalah huwisagch
    int ch; // ahiad togloh esehiig asuuhiin tuld zarlasan huwisagch
    
    
	public Bodlogo6_20Game(){
		count=0;	
		end=true;

	    
	}

	void showArr(){
		for(int i=0; i<5; i++){
		System.out.println();
		
		}
		
		
		System.out.println("Start Game 1 -> enter");		
	}

	
	void put(){  //haana bairluulhiig garaas awah funkts
	
	if(end==true){	
	System.out.println("");
    System.out.print("Mur = ");
	x=input.nextInt();
	System.out.print("Bagana = ");
	y=input.nextInt();
	}
	else{}
	
	
	}
	
	

	void check(){  // ter mur baganad bers tawij boloh esehiig shalgah funkts
		
	if(arr1[x][y]==false){
	   count++;  // togloltiin tooluur 1 eer nemegdene	
	   arr[x][y]='Q';
	   arr1[x][y]=true;
	   int xco=x;
	   int yco=y;
	   
	   
	   for(int i=0; i<y; i++){
		   arr[x][i]='*';
		   arr1[x][i]=true;
	   }
	   
	   for(int i=y+1; i<8; i++){
		  arr[x][i]='*';
		  arr1[x][i]=true;
		  
	   }
	   
	   
	   for(int i=0; i<x; i++){
		   arr[i][y]='*';
		   arr1[i][y]=true;
	   }
	   
	   for(int i=x+1; i<8; i++){
		  arr[i][y]='*';
		  arr1[i][y]=true;
		  
	   }
	
	  
	  for(int i=xco-1; i+1>0 ; i--){
		   if(yco==0){
			 break;    
		   }
		   yco=yco-1;
		   arr[i][yco]='*';
		   arr1[i][yco]=true;
		   
	   }
	   
	   yco=y;
	   xco=x;
	   
	   for(int i=x+1; i<8 ; i++){
		   if(yco==7){
			   break;
		   }
		   
		   arr[i][yco+1]='*';
		   arr1[i][yco+1]=true;
		   yco=yco+1;
		   
	   }
	   
	   yco=y;
	   xco=x;
	   for(int i=x; i>0 ; i--){
			if(yco==7){
				break;
			}
		   
		   arr[i-1][yco+1]='*';
		   arr1[i-1][yco+1]=true;
		   yco=yco+1;
		   
	   }
	   
	   yco=y;
	   xco=x;
	   
	   for(int i=x+1; i<8; i++){
			if(yco==0){
				break;
			}
		   
		   arr[i][yco-1]='*';
		   arr1[i][yco-1]=true;
		   yco=yco-1;
		   
	   }
	   
		int s=0;
		for(int i=0; i<8; i++){
			for(int j=0; j<8; j++){
				if(arr1[i][j]==false){
				   s=1;
					break;   	
				}
			
			}
		
		}
		
		if(s==0){ // s teg gedeg ni bugd unen utgatai bsaan gsn ug
			end=false;
		}
		else{}
	   
	

	   
	   
	    }       
	}
	
	
void restartGame(){
	clear();
	end=true;
	for(int i=0; i<8; i++){
		for(int j=0; j<8; j++){
			arr[i][j]=' ';
			arr1[i][j]=false;
		}
	}
	
	
}
	
	

	

	

	void Desktop(){  // delgetstei ajillah funkts
		showArr();
	    
		do{
		restartGame();
		while(end){
		clear();	
		PrintBoard();
		put();
		check();
        clear();
        PrintBoard();
		}
		
	    winner();
	    System.out.println("Ahiad toglohuu? 1/0");
		ch=input.nextInt();
	    }
		while(ch==1);
	
	}

	void PrintBoard(){  // delgetsend shatriin hulug helbereer haruulah funkts
		System.out.print("\t");	
		for(int i=0; i<8; i++){
			System.out.print("  "+i+"  ");

		}
		System.out.println();	


		for(int j=0; j<8; j++){


			System.out.print("\t");	
			for(int i=0; i<8; i++){
				System.out.print("-----");
			}
			System.out.println("");


			System.out.print("    "+j);
			System.out.print("\t");
			for(int i=0; i<8; i++){
				System.out.print("| "+arr[j][i]+"  "); 
			}
			System.out.println("|");
		}

		System.out.print("\t");
		for(int i=0; i<8; i++){
			System.out.print("-----");
		}


	}
	
	
void clear(){
	for(int clear=0; clear<100; clear++){
		System.out.println("\n");
	}
	
}


void winner(){
	switch(count){
	case 8:
	  System.out.println();
      System.out.print("Gaihaltai ta yallaa !");
      break;
      
	case 7:
		  System.out.println();
	      System.out.print("Dajgui shvv 7n bers !");
	      break;
	      
	case 6:
		  System.out.println();
	      System.out.print("Yahavdee 6n bers !");
	      break;
	      
	default:
		  System.out.println();
	      System.out.print("Arai l baina daa muu yumaa !");
	      break;
	      
	}
	
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bodlogo6_20Game gamer= new Bodlogo6_20Game();
		gamer.Desktop();
		
	}
	


}
