package geriinDaalgavruud;

import javax.swing.JOptionPane;

public class Time {
    private long hour;
    private long minute;
    private long second;
    
    
    public Time(){ // hamgiin suuliin udriin tsag minut sekundiig awah  
    	long elapsedTime =System.currentTimeMillis();
    	setTime(elapsedTime);
    	
    }
    
    public Time(long l){
       setTime(l);	
    }
	
    void showTime(){
    	String output="";
    	output+="The Time ";
    	output+="\nhour = "+hour;
    	output+="\nminute = "+minute;
    	output+="\nsecond = "+second;
    	JOptionPane.showMessageDialog(null, output);
    }
    

	public long getHour() {
		return hour;
	}
	
	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}

	void setTime(long a){
	      long totalHour;
	        long totalMinute;
	        long totalSecond;
	        
	    	long elapsedTime=a;
	    	
	    	totalSecond=elapsedTime/1000; // niit ungursun second 
	    	second=(int)(totalSecond%60);  //suuliin udriin sekund
	        
	    	totalMinute=totalSecond/60;
	    	minute=totalMinute%60;
	    	
	    	totalHour=totalMinute/60;
	    	hour=totalHour%24;  // odoogiin tsag
	    
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Time t1 = new Time();
      t1.showTime();
      
	}


}
