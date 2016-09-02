package javaCollectionFrameuud;

public class Time2 {
    int hour;
    int minute;
    int second;
    
	public Time2(int hour, int minute, int second){
		  this.hour=hour;
		  this.minute=minute;
		  this.second=second;
	}
	
	public int getHour(){
		return hour;
	}
	
	public int getMinute(){
		return minute;
	}
	
	public int getSecond(){
		return second;
	}
	
	public void printing(){
		System.out.print(hour+":"+minute+":"+second+" ");
	}
}
