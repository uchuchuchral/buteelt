package shalgalt1;

public class MyRectangle2D {
        double x,y;
        double width, height;
        
        public MyRectangle2D(){
        	x=y=0;
        	width=height=1;
        }
        
        
        public MyRectangle2D(double x, double y, double width, double height){
        	setX(x);
        	setY(y);
        	setWidth(width);
        	setHeight(height);
        
        }
        
        public void setX(double x){
        	this.x=x;
        }
        public void setY(double y){
        	this.y=y;
        }
        public void setWidth(double width){
        	this.width=width;
        }
        public void setHeight(double height){
        	this.height=height;
        }
        public double getX(){
        	return x;
        	
        }
        
        public double getY(){
        	return y;
        	
        }
        public double getWidth(){
        	return width;
        	
        }
        public double getHeight(){
        	return height;
        	
        }
        
        public double getArea(){
        	return width*height;
        }
        
        public double getPerimetr(){
        	return (width+height)*2;
        }
        // x ees 8
        //
        
        
        public boolean contains(double x1, double y1){
        	  boolean ret=false;
        	  
        	  double zdeedx,zdeedy, zdoodx,zdoody, bdeedx,bdeedy, bdoodx,bdoody; // tegsh untsugtiin 4n bulangiin tseguud 
        	  zdeedy=y+(height/2);
        	  zdeedx=x-(width/2);
        	  zdoodx=zdeedx;
        	  zdoody=zdeedy-height;
        	  bdeedy=zdeedy;
        	  bdeedx=zdeedx+width;
        	  bdoody=zdoody;
        	  bdoodx=bdeedx;
        	  
        	  if(x1>=zdeedx && x1<=bdeedx && y1<=zdeedy && y1>=zdoody){
        		 ret=true;  
        	  }
        	   
        	  return ret;
        }
        
        public boolean contains(MyRectangle2D r){
      	  boolean ret=false;
      	  
      	  double zdeedx,zdeedy, zdoodx,zdoody, bdeedx,bdeedy, bdoodx,bdoody; // tegsh untsugtiin 4n bulangiin tseguud 
      	  zdeedy=y+(height/2);
      	  zdeedx=x-(width/2);
      	  zdoodx=zdeedx;
      	  zdoody=zdeedy-height;
      	  bdeedy=zdeedy;
      	  bdeedx=zdeedx+width;
      	  bdoody=zdoody;
      	  bdoodx=bdeedx;
      	  
           // parametreer orj irsen tegsh untsugtiin 4n bulangiin tsegiig awna
      	  double Rzdeedx,Rzdeedy, Rzdoodx,Rzdoody, Rbdeedx,Rbdeedy, Rbdoodx, Rbdoody; // tegsh untsugtiin 4n bulangiin tseguud 
     
      	  Rzdeedy=r.getY()+(r.getHeight()/2);
      	  Rzdeedx=r.getX()-(r.getWidth()/2);
      	  Rzdoodx=Rzdeedx;
      	  
      	  Rzdoody=Rzdeedy-height;
      	  Rbdeedy=Rzdeedy;
      	  Rbdeedx=Rzdeedx+width;
      	  Rbdoody=Rzdoody;
      	  Rbdoodx=Rbdeedx;
      	  
      	  
      //	System.out.println(zdeedx+" "+zdoodx+" "+bdeedx+" "+bdoodx);
     //	 System.out.println(Rzdeedx+" "+Rzdoodx+" "+Rbdeedx+" "+Rbdoodx);
     	 
     	 
      	  if(Distance(zdeedx,zdeedy,Rzdeedx,Rzdeedy)>0 && Distance(zdoodx,zdoody,Rzdoodx,Rzdoody)>0  && Distance(bdeedx,bdeedy,Rbdeedx,Rbdeedy)>0 && Distance(bdoodx,bdoody,Rbdoodx,Rbdoody)>0){
      		 ret=true;  
      	  }
      	   
      	  return ret;
      }
        
        public double Distance(double dX0, double dY0, double dX1, double dY1) // 2tsegiin hoorondoh zaig oldog method
        
        {
            return Math.sqrt((dX1 - dX0)*(dX1 - dX0) + (dY1 - dY0)*(dY1 - dY0));
        }

}
