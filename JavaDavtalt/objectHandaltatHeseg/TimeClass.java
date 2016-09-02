package objectHandaltatHeseg;

public class TimeClass {
    private int hour;
    private int minute;
    private int second;
    
	
    public void setTime(int h, int m, int s){
    	hour=((h>=0 && h<=23) ? h:0);
    	minute=((m>=0 && m<=59) ? m:0);  // haaltandahi nuhtsul bilej bwal h iig ugui bol 0 iig hour t olgono gsn ug
    	second=((s>=0 && s<=59) ? s:0);
    	
    }
    
    public TimeClass(){  // baiguulagch funkts
       setTime(0,0,0);	
    }
    
    public String toUniversalString(){
    	
    	return(hour+" : "+minute+" : "+second);
    }
    


}
