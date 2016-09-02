package pro_dadlaga;

import java.sql.Date;

public class Date1 { // on sariig hadgalah hereglegchiin uusgesen date class 
	int year;
	int month;
	int day;
	Date d1;


	public Date1(){ // default baiguulagch funkts automataar systemiin tsagiig awch 

		d1= new java.sql.Date(System.currentTimeMillis());
		String m1=d1.toString();
		m1+=" ";
		DateUtga(m1); // dateUtga funktsruu shideed 

	}


	public void DateUtga(String m1){  // ene ni day, year, month-d yg ter utgiin olgono 
		int j=0;
		String year1;
		String month1;
		String day1;
		int count=0;
		int temp[]; 
		temp = new int[3];


	//	System.out.println("undsen version :"+m1);
		for(int i=0; i<m1.length() ; i++){
			if(m1.charAt(i)=='-'|| m1.charAt(i)==' '){
		//		System.out.println("- garch irsen");
				year1=m1.substring(j, i);
				temp[count]=Integer.parseInt(year1);
				count++;

			//	System.out.println("str :"+year1);
				j=i+1;
			}

		}

		setYear(temp[0]);
		setMonth(temp[1]);
		setDay(temp[2]);

	}

	public void setYear(int year){
		this.year=year;
	}
	public void setMonth(int month){
		this.month=month;
	}
	public void setDay(int day){
		this.day=day;
	}


	public int getYear(){
		return year;
	}
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}

	public String getDate(){ // 2016-04-14 gej haragdah string butsaana 
		return d1.toString();      
	}

/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date1 d1= new Date1();
        System.out.println(d1.getDate());
        System.out.println("jil="+d1.getYear());
        System.out.println("sar="+d1.getMonth());
        System.out.println("udur="+d1.getDay());
	}
*/
}
