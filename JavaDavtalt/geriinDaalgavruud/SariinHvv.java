package geriinDaalgavruud;

public class SariinHvv {
	private int sariinToo;
	private double huwi;
	boolean uridchilsan; // uridchilsan huut bwal true baiguulaga bol false 


	public SariinHvv(){
		sariinToo=0;
		huwi=0;
		uridchilsan=true;
	}

	public void setSariinToo(int sariinToo){
		
		if(uridchilsan){	
			if(sariinToo==3 || sariinToo==6  || sariinToo==12){
				checkHvv(sariinToo);	         	
			}
			else{
				System.out.println("Iim sartai hadgalamj bhgui ");
			}
		}

		if(!uridchilsan){
			if(sariinToo==3 || sariinToo==6  || sariinToo==9 || sariinToo==12){
				checkHvv(sariinToo);	         	
			}
			else{
				System.out.println("Iim sartai hadgalamj bhgui ");
			} 
		}

		this.sariinToo=sariinToo;
	}


	public double getHuwi(){
		return huwi;
	}

	public boolean getUridchilsan(){
		return uridchilsan;
	}

	public int getSariinToo(){
		return sariinToo;
	}

	public void setUridchilsan(boolean urid){
		this.uridchilsan=urid;
	}



	public void checkHvv(int sariinToo1){


		switch(sariinToo1){

		case 3: 
			huwi=0.75;
			break;
		case 6:
			huwi=1;
			break;

		case 12:
			huwi=1.1;
			break;

		}


	}

}
