package bodlogo11_2;



public class MyDate {
    private int day;
    private int month;
    private int year;
	
    public MyDate(int day, int month, int year){
    	setDay(day);
    	setMonth(month);
    	setYear(year);
    	
    }

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
   
	public String toString(){
		 String output;
		 output=" "+day;
		 output+=": "+month;
		 output+=": "+year;
		  return output;
		 
	}
}
