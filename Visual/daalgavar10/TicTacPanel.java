package daalgavar10;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class TicTacPanel extends JPanel{
          char [][]arr= new char[3][3]; // tsaad yg bodolt hiih massiv 
          int xcoor, ycoor;  // mouse aar darsan bairlaliig awna
          Coor [][]co= new Coor[3][3];
          int pieceWidth;
    	  int pieceHeight;
          
    	  
          public TicTacPanel(){
        	 
        	  int x=0, y=0;
        	  pieceWidth=484/3;
        	  pieceHeight=439/3;  
        	//  System.out.println("baiguulagch dotor width ="+getWidth());
        //	  System.out.println("baiguulagch dotor height ="+getHeight());
        	  
        	  for(int i=0; i<3; i++){
        		  for(int j=0; j<3; j++){
        		     co[i][j]= new Coor();
        			 co[i][j].setXcoor(x);
        		     co[i][j].setYcoor(y);		 
        			 x=x+pieceWidth;
        			 arr[i][j]='a'; // 'a' useg bwal yum zurahgui gsn ug 
        			 
        		  }
        		  y=y+pieceHeight;
        		  x=0;
        	  }
          }
          
          
          public boolean checkTalbar(int x, int y, char ch){ // mouse darsan koordinatiig awaad ali nud gedgiig ni medeh method
        	  // hervee bairluulj bolson bol true butsaana
        	  boolean ret=false;
        	  for(int i=0; i<3; i++){
        		  for(int j=0; j<3; j++){
        			 if( co[i][j].getXcoor()<=x &&  co[i][j].getXcoor()+pieceWidth>=x && 
        				co[i][j].getYcoor()<=y && co[i][j].getYcoor()+pieceHeight>=y){
        			//	  System.out.println(i+": nud "+ j+ ": bagana  daragdsan");
        				  if(arr[i][j]!='x' && arr[i][j]!='o')
        				    arr[i][j]=ch;
        				    
        				    
        				    ret=true;
        			      }
        		  }
        	  }
        	  
        	  
        	  repaint();
        	  return ret;
          }
          
          
          public void paintComponent(Graphics g){
        	  super.paintComponent(g);
        	 
        	  for(int i=0; i<3; i++){
        		  for(int j=0; j<3; j++){
        			 g.drawRect(co[i][j].getXcoor(), co[i][j].getYcoor(), pieceWidth, pieceHeight);
        	         
        			 if(arr[i][j]=='x'){
        				g.drawLine(co[i][j].getXcoor(), co[i][j].getYcoor(), co[i][j].getXcoor()+pieceWidth, co[i][j].getYcoor()+pieceHeight);
        				g.drawLine(co[i][j].getXcoor()+pieceWidth, co[i][j].getYcoor(), co[i][j].getXcoor(), co[i][j].getYcoor()+pieceHeight);
        			 }
        			 
        			 if(arr[i][j]=='o'){
        				g.drawOval(co[i][j].getXcoor()+10, co[i][j].getYcoor()+10, pieceWidth-30, pieceHeight-30); 
        			 }
        		  }
        	  }
        	  
        	  
          }
          
          
          class Coor{  // coordinatuudiin bairlaliig hadgalah massiv
        	   int x,y;
        	   
        	   public Coor(){
        		   x=0;
        		   y=0;
        	   }
        	   
        	   public void setXcoor(int x){
        		   this.x=x;
        	   }
        	   
        	   public void setYcoor(int y){
        		   this.y=y;
        	   }
        	   
        	   public int getXcoor(){
        		return x;   
        	   }
        	   
        	   public int getYcoor(){
        		   return y;
        	   }
        	   
        	   public void show(){
        		   System.out.println("x: "+x+"  y:"+y);
        	   }
          }
          
          
          public int checkWin(char ch){  // 'x' bol 1  'o' bol 2 tentswel 3 iig ylaagui bwal 0 iig butsaana  
        	  int ret=0;
        	  
        	  if(arr[0][0]==ch && arr[1][1]==ch && arr[2][2]==ch) ret=1;
        	  if(arr[0][2]==ch && arr[1][1]==ch && arr[2][0]==ch) ret=1;
        	  
        	  for(int i=0; i<3; i++){
        	      if(arr[i][0]==ch && arr[i][1]==ch && arr[i][2]==ch) ret=1;
        	     
        	      if(arr[0][i]==ch && arr[1][i]==ch && arr[2][i]==ch) ret=1;	  
        	  }
        		  
        	  System.out.println("ret = "+ret);
        	  return ret;  //1 butswal tuhain toglogch hojson gsn ug 
          }
          
          public void Restart(){
        	  for(int i=0; i<3; i++){
        		  for(int j=0; j<3; j++){
        			  arr[i][j]='a';
        		  }
        	  }
        	  repaint();
          }
          
}
